package com.twb.oauth.service.Impl;

import com.twb.oauth.dao.ArticleMapper;
import com.twb.oauth.domain.Article;
import com.twb.oauth.domain.ArticleWithBLOBs;
import com.twb.oauth.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
      return articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ArticleWithBLOBs record) {
      return articleMapper.insert(record);
    }

    @Override
    public int insertSelective(ArticleWithBLOBs record) {
        return articleMapper.insertSelective(record);
    }

    @Override
    public ArticleWithBLOBs selectByPrimaryKey(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ArticleWithBLOBs record) {
        return articleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(ArticleWithBLOBs record) {
        return articleMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Article record) {
        return articleMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ArticleWithBLOBs> selectAllByPage(Integer offset, Integer limit) {
        return articleMapper.selectByPage(offset,limit);
    }

}
