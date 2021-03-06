package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.Data;

@Data
public class ArticleForm {//폼 데이터를 받아올 그릇
    private Long id;
    private String title;
    private String content;

    public ArticleForm(){

    }
    // 빌더 패턴으로 객체 생성! 생성자의 변형. 입력 순서가 일치하지 않아도 됨.
    public Article toEntity() {
        return Article.builder()
                .id(null)
                .title(title)
                .content(content)
                .build();
    }

    // 생성자: entity 객체를 form으로 변환!
    public ArticleForm(Article entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
    }
}
