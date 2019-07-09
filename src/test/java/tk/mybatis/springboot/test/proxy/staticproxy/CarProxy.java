package tk.mybatis.springboot.test.proxy.staticproxy;// CarProxy.java
/**
 * 代理类
 */
public class CarProxy implements Car {
    private CarImpl ci;
    public CarProxy(CarImpl ci) {
        this.ci = ci;
    }

    public void revCar() {
        System.out.println("该客户是否有足够的钱预订车");
        ci.revCar();
        System.out.println("该客户预订完成");
    }

    public void buyCar() {
        System.out.println("该客户是否是vip客户");
        ci.buyCar();
        System.out.println("该客户买车完成");
    }
}