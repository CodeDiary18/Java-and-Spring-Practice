package com.example.firstproject.service;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service // 서비스 객체 선언! 서비스란?
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional // 트랜잭션 처리! 트랜잭션이란?
    public Article update(Long id, ArticleForm form) {
        // 받아온 데이터 확인!
        log.info("form: " + form.toString());
        // 해당 id로 기존 데이터를 가져옴!
        Article target = articleRepository.findById(id)
                .orElseThrow(
                        () -> new IllegalArgumentException("해당 Article이 없습니다.")
                );
        log.info("target: " + target.toString());
        // 재 작성 및 저장!
        target.rewrite(form.getTitle(), form.getContent());
        Article saved = articleRepository.save(target);
        log.info("saved: " + saved.toString());
        return saved;
    }

    @Transactional
    public Long destroy(Long id) {
        Article target = articleRepository.findById(id)
                .orElseThrow(
                        () -> new IllegalArgumentException("해당 Article이 없습니다.")
                );
        articleRepository.delete(target);
        return target.getId();
    }
}