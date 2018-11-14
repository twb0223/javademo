package com.twb.blog.service.Impl;

import com.twb.blog.dao.UserMapper;
import com.twb.blog.domain.User;
import com.twb.blog.dao.UserDao;
import com.twb.blog.domain.UserArticleDto;
import com.twb.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSciveImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getAllUser() {
        List<User> list= userDao.getAll();
        return list;
    }

    @Override
    public List<UserArticleDto> getUserArticles() {
        return userDao.getUserArticles();
    }
}
