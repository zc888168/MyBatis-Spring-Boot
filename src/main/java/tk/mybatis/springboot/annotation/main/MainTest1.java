package tk.mybatis.springboot.annotation.main;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tk.mybatis.springboot.annotation.Circle;
import tk.mybatis.springboot.annotation.MainConfig;

public class MainTest1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Circle circle = context.getBean(Circle.class);
        circle.sayHi();

    }
}
