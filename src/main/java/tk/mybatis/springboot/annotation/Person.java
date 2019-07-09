package tk.mybatis.springboot.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("i am name")
    private String name;

    @Value("${server.port}")
    private int port;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }
}