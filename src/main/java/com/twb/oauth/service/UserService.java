package com.twb.oauth.service;

import com.twb.oauth.domain.User;
import com.twb.oauth.domain.UserArticleDto;

import java.util.List;

public interface UserService {
    User getUser(int id);

    List<User> getAllUser();

    List<UserArticleDto> getUserArticles();
}
