package tk.mybatis.springboot.factory.base;

//除法
public class OperationDiv extends Operation {
    @Override
    protected double getResule() {
        if (getValue2() != 0) {
            return getValue1() / getValue2();
        }
        throw new IllegalArgumentException("除数不能为零");
    }
}