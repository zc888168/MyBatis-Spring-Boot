package tk.mybatis.springboot.factory.base.factory;

import tk.mybatis.springboot.factory.base.Operation;
import tk.mybatis.springboot.factory.base.OperationAdd;

//加法类工厂
public class AddFactory implements IFactory {
    public Operation CreateOption() {
        return new OperationAdd();
    }
}