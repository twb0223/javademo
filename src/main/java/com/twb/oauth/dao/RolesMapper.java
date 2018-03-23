package com.twb.oauth.dao;

import com.twb.oauth.domain.Roles;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    int insertSelective(Roles record);

    Roles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}