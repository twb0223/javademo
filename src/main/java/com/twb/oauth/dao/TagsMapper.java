package com.twb.oauth.dao;

import com.twb.oauth.domain.Tags;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tags record);

    int insertSelective(Tags record);

    Tags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);
}