package com.twb.blog.dao;

import com.twb.blog.domain.Tags;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface TagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tags record);

    int insertSelective(Tags record);

    Tags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);
    
    List<Tags> selectAll();
}