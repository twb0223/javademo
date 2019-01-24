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

    /**
     * 分页获取文章列表
     *
     * @param offset
     * @param limit
     * @return
     */
    @RequestMapping(value = "/{offset}/{limit}", method = RequestMethod.GET)
    public List<ArticleWithBLOBs> selectAllByPage2(@PathVariable(value = "offset") Integer offset,
                                                   @PathVariable(value = "limit") Integer limit) {
        return articleService.selectAllByPage(offset, limit);
    }

    /**
     * 通过id获取文章内容
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ArticleWithBLOBs selectAllByPage(@PathVariable(value = "id") Integer id) {
        return articleService.selectByPrimaryKey(id);
    }

    /**
     * 添加
     *
     * @param articleWithBLOBs
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public int insert(@RequestBody ArticleWithBLOBs articleWithBLOBs) {
        return articleService.insert(articleWithBLOBs);
    }

}