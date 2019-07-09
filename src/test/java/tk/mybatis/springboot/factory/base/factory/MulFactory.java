package tk.mybatis.springboot.factory.base.factory;

import tk.mybatis.springboot.factory.base.Operation;
import tk.mybatis.springboot.factory.base.OperationMul;

//除法类工厂
public class MulFactory implements IFactory {
    public Operation CreateOption() {
        return new OperationMul();
    }
}