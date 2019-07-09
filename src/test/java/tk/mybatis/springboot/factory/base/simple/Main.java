package tk.mybatis.springboot.factory.base.simple;

import tk.mybatis.springboot.factory.base.Operation;

public class Main {
    public static void main(String[] args) {
        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setValue1(10);
        operationAdd.setValue2(5);
        //System.out.println(operationAdd.getResule());


    }
}
