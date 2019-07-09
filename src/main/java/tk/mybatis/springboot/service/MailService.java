package tk.mybatis.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.async.User;

@Service
public class MailService {
    Logger log = LoggerFactory.getLogger(MailService.class);

    //@Async
    public void send(User user) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        log.info("发送激活邮箱成功！"+(end-start)+"ms");
    }
}