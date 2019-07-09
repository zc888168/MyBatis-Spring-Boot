package tk.mybatis.springboot.test.proxy.cglibproxy;

public class Test {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Train t = (Train)proxy.getProxy(Train.class);
        t.move();
    }
}