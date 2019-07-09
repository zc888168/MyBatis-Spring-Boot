package tk.mybatis.springboot.test.proxy;

public class TargetImpl implements Target {
    @Override
    public int test(int i) {
        return i+1;
    }
}
