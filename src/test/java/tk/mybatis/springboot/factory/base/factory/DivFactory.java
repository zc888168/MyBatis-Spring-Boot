package tk.mybatis.springboot.factory.base.factory;

import tk.mybatis.springboot.factory.base.Operation;
import tk.mybatis.springboot.factory.base.OperationDiv;

//除法类工厂
public class DivFactory implements IFactory {
    public Operation CreateOption() {
        return new OperationDiv();
    }
}
