package com.twb.blog.domain;

import java.io.Serializable;

public class Imgs implements Serializable {

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;

	private String url;
}
