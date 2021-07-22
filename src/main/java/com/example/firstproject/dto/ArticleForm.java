package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {//폼 데이터를 받아올 그릇
    private String title;
    private String content;

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null,title,content);
    }
}
