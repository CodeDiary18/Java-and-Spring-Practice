package com.example.firstproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity //DB가 해당 객체를 인식 가능!
@NoArgsConstructor
@ToString
@Getter
public class Article {
    @Id //대표값
    @GeneratedValue(strategy = GenerationType.IDENTITY) //1,2,3 .. 자동생성
    private Long id;    //사람으로 따지면 주민번호

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Builder // 빌더 패턴 적용! 추후 설명..!
    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
