package tk.mybatis.springboot.factory.base;
//减法
public class OperationSub extends Operation {
    @Override
    protected double getResule() {
        return getValue1() - getValue2();
    }
}