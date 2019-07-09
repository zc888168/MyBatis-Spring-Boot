package tk.mybatis.springboot.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxyText implements InvocationHandler {
    private Target target;
    private JdkDynamicProxyText(Target target){
        this.target = target;
    }
    public static Target newProxyInstance(Target target){
        return (Target) Proxy.newProxyInstance(JdkDynamicProxyText.class.getClassLoader(),
                new Class<?>[]{Target.class}, new JdkDynamicProxyText(target));
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }
}
