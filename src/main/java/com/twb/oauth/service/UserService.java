package com.twb.oauth.service;

import com.twb.oauth.domain.User;

import java.util.List;

public interface UserService {
    User getUser(int id);

    List<User> getAllUser();

}
