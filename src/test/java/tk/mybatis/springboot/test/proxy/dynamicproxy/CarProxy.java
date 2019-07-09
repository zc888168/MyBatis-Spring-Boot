package tk.mybatis.springboot.test.proxy.dynamicproxy;// CarProxy.java

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class CarProxy implements InvocationHandler {
    private Object target;
    /**
     * 绑定一个委托对象并获得一个代理类对象
     * @param target [description]
     * @return [description]
     */
    public Object bind(Object target) {
        this.target = target;
        // 取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
           this);
    }
    @Override
    //这个方法并不是我们自己去调用
    public Object invoke(Object proxy, Method method, Object[] args)
       throws Throwable {
        System.out.println("该客户是否是vip客户");
        // 执行委托类的方法
        Object result = method.invoke(target,args);
        System.out.println("该客户买车完成");
        return result;
    }
}