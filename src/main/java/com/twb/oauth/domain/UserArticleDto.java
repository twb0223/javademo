package com.twb.oauth.domain;

import java.io.Serializable;

public class UserArticleDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer userId;

    private String userName;

    private String email;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArticleWithBLOBs getArticle() {
        return article;
    }

    public void setArticle(ArticleWithBLOBs article) {
        this.article = article;
    }

    private ArticleWithBLOBs article;

}
