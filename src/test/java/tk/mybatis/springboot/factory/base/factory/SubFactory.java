package tk.mybatis.springboot.factory.base.factory;

import tk.mybatis.springboot.factory.base.Operation;
import tk.mybatis.springboot.factory.base.OperationSub;

//减法类工厂
public class SubFactory implements IFactory {
    public Operation CreateOption() {
        return new OperationSub();
    }
}