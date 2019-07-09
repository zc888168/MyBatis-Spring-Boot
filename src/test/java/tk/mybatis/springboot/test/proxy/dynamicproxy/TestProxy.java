package tk.mybatis.springboot.test.proxy.dynamicproxy;

public class TestProxy {
    public static void main(String[] args) {
        CarProxy cp = new CarProxy();
        // 传入一个实现了该接口的实例就行
        Car car = (Car)cp.bind(new CarImp1());
        // Car car = (Car)cp.bind(new CarImp2());
        car.buyCar();
    }
}