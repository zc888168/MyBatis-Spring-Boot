package tk.mybatis.springboot.factory.base.absstract;

public interface CarFactory {

    public BenzCar getBenzCar();
    public TeslaCar getTeslaCar();
}