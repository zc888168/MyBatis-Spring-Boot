package tk.mybatis.springboot.test.proxy.staticproxy;// CarImpl.java
/**
 * 委托类
 */
public class CarImpl implements Car {
    public void revCar() {
        System.out.println("我要去预订一辆车咯");
    }

    public void buyCar() {
        System.out.println("我要买车咯");
    }
}