package com.twb.oauth.service;

import com.twb.oauth.dao.UserDao;
import com.twb.oauth.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  UserService {
    @Autowired
    private UserDao userDao;

    public User getUser(int id) {
        return userDao.get(id);
    }

    public List<User> getAllUser() {
        return userDao.getAll();
    }

}
