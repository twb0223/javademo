package com.twb.oauth.controller;

import com.twb.oauth.domain.ArticleWithBLOBs;
import com.twb.oauth.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/api/Article", method = RequestMethod.GET)
    public List<ArticleWithBLOBs> selectAllByPage(@RequestParam Integer offset, @RequestParam Integer limit) {
        return articleService.selectAllByPage(offset, limit);
    }

    @RequestMapping(value = "/api/Article/{offset}/{limit}", method = RequestMethod.GET)
    public List<ArticleWithBLOBs> selectAllByPage2(@PathVariable(value = "offset") Integer offset, @PathVariable(value = "limit") Integer limit) {
        return articleService.selectAllByPage(offset, limit);
    }


    @RequestMapping(value = "/api/Article/{id}", method = RequestMethod.GET)
    public ArticleWithBLOBs selectAllByPage(@PathVariable(value = "id") Integer id) {
        return articleService.selectByPrimaryKey(id);
    }
}