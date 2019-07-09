package tk.mybatis.springboot.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service
public class AnnotationTest {
    @Resource
    private Person person;

    @Resource
    private Student student;

    public AnnotationTest(){

    }
    @PostConstruct
    public void init(){
        System.out.println(student);
        System.out.println(person );
    }
}
