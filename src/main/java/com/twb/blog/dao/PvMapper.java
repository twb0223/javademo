package com.twb.blog.dao;

import com.twb.blog.domain.Pv;
import org.springframework.stereotype.Repository;

@Repository
public interface PvMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pv record);

    int insertSelective(Pv record);

    Pv selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pv record);

    int updateByPrimaryKey(Pv record);
}