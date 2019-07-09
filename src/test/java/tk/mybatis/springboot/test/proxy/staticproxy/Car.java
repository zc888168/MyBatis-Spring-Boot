package tk.mybatis.springboot.test.proxy.staticproxy;

// Car.java
public interface Car { 
    // 预订车 
    public void revCar(); 
    // vip客户可以直接买车 
    public void buyCar(); 
}