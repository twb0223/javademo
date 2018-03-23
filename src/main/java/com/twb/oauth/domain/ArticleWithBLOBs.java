package com.twb.oauth.domain;

import java.io.Serializable;

public class ArticleWithBLOBs extends Article implements Serializable {
    private String mdcontent;

    private String htmlcontent;

    private String summary;

    private static final long serialVersionUID = 1L;

    public String getMdcontent() {
        return mdcontent;
    }

    public void setMdcontent(String mdcontent) {
        this.mdcontent = mdcontent == null ? null : mdcontent.trim();
    }

    public String getHtmlcontent() {
        return htmlcontent;
    }

    public void setHtmlcontent(String htmlcontent) {
        this.htmlcontent = htmlcontent == null ? null : htmlcontent.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
}