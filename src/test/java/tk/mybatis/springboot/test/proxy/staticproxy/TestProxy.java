package tk.mybatis.springboot.test.proxy.staticproxy;

public class TestProxy {
    public static void main(String[] args) {
        CarImpl ci = new CarImpl();
        CarProxy cp = new CarProxy(ci);
        cp.revCar();
        cp.buyCar();
    }
}