package tk.mybatis.springboot.test.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyTest implements MethodInterceptor {
    private CglibProxyTest(){

    }
    public static <T extends Target> Target newProxyInstance(Class<T> targetInstanceCLazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetInstanceCLazz);
        enhancer.setCallback(new CglibProxyTest());
        return (Target) enhancer.create();
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        return proxy.invokeSuper(obj, args);
    }
}
