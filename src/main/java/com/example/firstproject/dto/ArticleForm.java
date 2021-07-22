package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor //생성자 대체
@ToString   //toString() 대체
public class ArticleForm {//폼 데이터를 받아올 그릇
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null,title,content);
    }
}
