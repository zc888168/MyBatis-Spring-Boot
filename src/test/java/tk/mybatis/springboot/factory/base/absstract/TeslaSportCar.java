package tk.mybatis.springboot.factory.base.absstract;

public class TeslaSportCar implements TeslaCar {
    public void charge() {
        System.out.println("给我特斯拉跑车冲满电");
    }
}