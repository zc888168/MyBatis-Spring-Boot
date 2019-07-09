package tk.mybatis.springboot.factory.base;
//加法
public class OperationAdd extends Operation {
    @Override
    protected double getResule() {
        return getValue1() + getValue2();
    }
}