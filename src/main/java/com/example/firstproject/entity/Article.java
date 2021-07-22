package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //DB가 해당 객체를 인식 가능!
@AllArgsConstructor
@ToString
public class Article {
    @Id //대표값
    @GeneratedValue //1,2,3 .. 자동생성
    private Long id;    //사람으로 따지면 주민번호

    @Column
    private String title;

    @Column
    private String content;
}
