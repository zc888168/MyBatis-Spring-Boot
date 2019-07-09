package tk.mybatis.springboot.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tk.mybatis.springboot.annotation.Circle;
import tk.mybatis.springboot.annotation.MainConfigThree;
import tk.mybatis.springboot.annotation.Rectangle;
import tk.mybatis.springboot.annotation.Triangle;

public class MainTest3 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfigThree.class);
        Circle circle = context.getBean(Circle.class);
        Triangle triangle = context.getBean(Triangle.class);
        Rectangle rectangle = context.getBean(Rectangle.class);
        circle.sayHi();
        triangle.sayHi();
        rectangle.sayHi();

    }
}
