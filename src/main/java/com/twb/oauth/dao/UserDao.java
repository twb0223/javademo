package com.twb.oauth.dao;

import com.twb.oauth.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao {

    @Select("Select * from User where id=#{id}")
    User get(int id);

    @Select("Select * from User")
    List<User> getAll();

}
