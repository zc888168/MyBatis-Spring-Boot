package tk.mybatis.springboot.factory.base.absstract;

public class BenzBusinessCar implements BenzCar{
    public void gasUp() {
        System.out.println("给我的奔驰商务车加一般的汽油");
    }
}