package com.news.summary.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "articles")
public class Article {

	@Id
    private String id;

	private String url;

    @Type(type = "text")
    private String keywords;

    public Article() {
    }

    public Article(String id, String url, String keywords) {
        this.id = id;
        this.keywords = keywords;
		this.url = url;
	}

    public String getId() {
		return id;
	}

    public void setId(String id) {
		this.id = id;
	}

    public String getKeywords() {
        return keywords;
	}

    public void setKeywords(String keywords) {
        this.keywords = keywords;
	} 

	public String getUrl() {
		return url;
	} 

	public void setUrl(String url) {
		this.url = url;
	}
}