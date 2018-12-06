package com.twb.blog.dao;

import com.twb.blog.domain.Article_tags;

import org.springframework.stereotype.Repository;

@Repository
public interface Article_tagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article_tags record);

    int insertSelective(Article_tags record);

    Article_tags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article_tags record);

    int updateByPrimaryKey(Article_tags record);
    
}