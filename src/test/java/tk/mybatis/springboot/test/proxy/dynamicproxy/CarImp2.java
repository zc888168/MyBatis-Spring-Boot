package tk.mybatis.springboot.test.proxy.dynamicproxy;
// CarImp2.java
/**
 * 委托类2
 */
public class CarImp2 implements Car {
    public void buyCar() {
        System.out.println("我是vip2");
    }
}