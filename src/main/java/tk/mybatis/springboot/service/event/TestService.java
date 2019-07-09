package tk.mybatis.springboot.service.event;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Service
public class TestService {

    @Resource
    private DemoPublisher publisher;
    @PostConstruct
    public void init(){
        publisher.publish("aaa");
    }

}
