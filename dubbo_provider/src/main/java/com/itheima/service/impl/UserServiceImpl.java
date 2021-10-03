package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  实现类的包名必须与接口的包名一致 AnnotationBean.postProcessAfterInitialization
 * </p>
 *
 * @author: Eric
 * @since: 2020/11/19
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }
}
