package com.twb.blog.dao;

import com.twb.blog.domain.Roles_User;
import org.springframework.stereotype.Repository;

@Repository
public interface Roles_UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roles_User record);

    int insertSelective(Roles_User record);

    Roles_User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Roles_User record);

    int updateByPrimaryKey(Roles_User record);
}