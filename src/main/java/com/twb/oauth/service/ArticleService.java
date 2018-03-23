package com.twb.oauth.service;

import com.twb.oauth.domain.Article;
import com.twb.oauth.domain.ArticleWithBLOBs;

import java.util.List;

public interface ArticleService {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleWithBLOBs record);

    int insertSelective(ArticleWithBLOBs record);

    ArticleWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticleWithBLOBs record);

    int updateByPrimaryKey(Article record);

    List<ArticleWithBLOBs> selectAllByPage(Integer offset,Integer limit);
}
