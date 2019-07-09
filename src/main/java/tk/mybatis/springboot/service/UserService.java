package tk.mybatis.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.async.User;
import tk.mybatis.springboot.dao.UserDao;

@Service
public class UserService {
    Logger log = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserDao userDao;
    @Autowired
    private MailService mailService;

    public long addUser(User user) throws InterruptedException{
        long startTime = System.currentTimeMillis();
        userDao.insert(user);
        mailService.send(user);
        long endTime = System.currentTimeMillis();
        log.info("注册耗时："+(endTime - startTime));
        return (endTime - startTime);
    }
}