package com.twb.blog.service;

import com.twb.blog.domain.User;
import com.twb.blog.domain.UserArticleDto;

import java.util.List;

public interface UserService {
    User getUser(int id);

    List<User> getAllUser();

    List<UserArticleDto> getUserArticles();

}