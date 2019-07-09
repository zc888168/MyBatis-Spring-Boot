package tk.mybatis.springboot.factory.base;

import tk.mybatis.springboot.factory.base.factory.AddFactory;
import tk.mybatis.springboot.factory.base.factory.IFactory;

public class FactoryModeMain {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operationAdd =  factory.CreateOption();
        operationAdd.setValue1(10);
        operationAdd.setValue2(5);
        System.out.println(operationAdd.getResule());
    }
}
