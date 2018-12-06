package com.twb.blog.controller;

import com.twb.blog.domain.ArticleWithBLOBs;
import com.twb.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/Article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/{offset}/{limit}", method = RequestMethod.GET)
    public List<ArticleWithBLOBs> selectAllByPage2(@PathVariable(value = "offset") Integer offset, @PathVariable(value = "limit") Integer limit) {
        return articleService.selectAllByPage(offset, limit);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ArticleWithBLOBs selectAllByPage(@PathVariable(value = "id") Integer id) {
        return articleService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public int insert(@RequestBody ArticleWithBLOBs articleWithBLOBs){
        return articleService.insert(articleWithBLOBs);
    }

    
}