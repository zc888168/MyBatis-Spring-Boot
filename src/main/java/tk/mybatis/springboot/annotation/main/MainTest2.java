package tk.mybatis.springboot.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tk.mybatis.springboot.annotation.Circle;
import tk.mybatis.springboot.annotation.MainConfigTwo;
import tk.mybatis.springboot.annotation.Triangle;

public class MainTest2 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigTwo.class);
        Circle circle = context.getBean(Circle.class);
        Triangle triangle = context.getBean(Triangle.class);
        circle.sayHi();
        triangle.sayHi();

    }
}
