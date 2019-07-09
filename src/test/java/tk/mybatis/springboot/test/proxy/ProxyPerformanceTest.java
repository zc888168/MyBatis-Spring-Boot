package tk.mybatis.springboot.test.proxy;

import com.google.common.collect.Maps;

import java.util.Map;

public class ProxyPerformanceTest {
    public static void main(String[] args) {
        Target nativeTarget = new TargetImpl();
        Target dynamicProxy = JdkDynamicProxyText.newProxyInstance(nativeTarget);
        Target cglibProxy = CglibProxyTest.newProxyInstance(TargetImpl.class);

        int preRunCount = 10000;
        runWithOutMonitor(nativeTarget, preRunCount);
        runWithOutMonitor(cglibProxy, preRunCount);
        runWithOutMonitor(dynamicProxy, preRunCount);

        Map<String, Target> tests = Maps.newHashMap();
        tests.put("Native",  nativeTarget);
        tests.put("Dynamic", dynamicProxy);
        tests.put("Cglib", cglibProxy);

        int repeatCount = 3;
        int runCount =  1000000;
        runTest(repeatCount, runCount, tests);
        
    }

    private static void runTest(int repeatCount, int runCount, Map<String, Target> tests) {
        System.out.println(String.format("\n==== runTest:[repeatCount=%s] [runCount=%s] [java.version=%s]====",
                repeatCount, runCount, System.getProperty("java.version")));
        for(int i=0;i< runCount;i++){
            System.out.println(String.format("\n-------- test:[%s]--------", i+1));
            for(String key: tests.keySet()){
                runWithMonitor(tests.get(key), runCount, key);
            }
        }
    }

    private static void runWithMonitor(Target target, int runCount, String tag) {
        Long start = System.currentTimeMillis();
        for(int i=0;i< runCount; i++){
            target.test(i);
        }
        Long end = System.currentTimeMillis();
        System.out.println("[" + tag + "] total time " + (end - start) +"ms");

    }

    private static void runWithOutMonitor(Target target, int preRunCount) {
        for(int i=0;i< preRunCount; i++){
            target.test(i);
        }
    }
}
