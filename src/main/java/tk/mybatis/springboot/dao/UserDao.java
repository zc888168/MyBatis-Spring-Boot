package tk.mybatis.springboot.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import tk.mybatis.springboot.async.User;

@Repository
public class UserDao {
    Logger log = LoggerFactory.getLogger(UserDao.class);

    public void insert(User user) {
        log.info("添加用户成功 用户信息 {}", user.toString());
    }
}