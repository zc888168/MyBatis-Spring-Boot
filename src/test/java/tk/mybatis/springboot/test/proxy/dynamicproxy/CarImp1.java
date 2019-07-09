package tk.mybatis.springboot.test.proxy.dynamicproxy;// CarImp1.java


/**
 * 委托类1
 */
public class CarImp1 implements Car {
    public void buyCar() {
        System.out.println("我是vip1");
    }
}