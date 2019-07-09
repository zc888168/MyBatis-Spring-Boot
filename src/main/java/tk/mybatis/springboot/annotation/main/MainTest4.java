package tk.mybatis.springboot.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tk.mybatis.springboot.annotation.ConditionBean;
import tk.mybatis.springboot.annotation.ConditionConfig;

public class MainTest4 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ConditionBean conditionBean = context.getBean(ConditionBean.class);
        conditionBean.sayHi();

    }
}
