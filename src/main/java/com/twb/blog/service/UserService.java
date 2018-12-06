package com.twb.blog.service;

import com.twb.blog.domain.User;
import com.twb.blog.domain.UserArticleDto;

import java.util.List;

public interface UserService {
    User getUser(Integer id);

    List<User> getAllUser();

    List<UserArticleDto> getUserArticles(Integer id);
    
    Integer deleteUser(Integer id);
    
    Integer updateUser(User user);
    
    Integer insert(User user);
   
}