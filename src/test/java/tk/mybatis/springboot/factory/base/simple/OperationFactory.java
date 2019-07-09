package tk.mybatis.springboot.factory.base.simple;

import tk.mybatis.springboot.factory.base.Operation;
import tk.mybatis.springboot.factory.base.*;
import tk.mybatis.springboot.factory.base.OperationSub;

public class OperationFactory {

    public static Operation createOperation() {
        return createOperation();
    }

    public static Operation createOperation(String operation) {
        Operation oper = null;
        switch (operation) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;

            case "/":
                oper = new OperationDiv();
                break;
            default:
                throw new UnsupportedOperationException("不支持该操作");
        }
        return oper;
    }
}