package com.twb.oauth.service.Impl;

import com.twb.oauth.dao.UserDao;
import com.twb.oauth.domain.User;
import com.twb.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSciveImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(int id) {
        return userDao.get(id);
    }

    @Override
    public List<User> getAllUser() {
        List<User> list= userDao.getAll();
        return list;
    }
}