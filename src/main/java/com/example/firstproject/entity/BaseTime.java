package com.example.firstproject.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 부모 클래스로 선언! 자식 클래스는, 해당 클래스의 필드를 Colunm으로 생성!
@EntityListeners(AuditingEntityListener.class) // Auditing 기능을 추가!
public class BaseTime {
    @CreatedDate // 엔티티 생성 시, 당시 시각을 자동 기입!
    private LocalDateTime createdAt;

    @LastModifiedDate // 엔티티 수정 시, 당시 시각을 자동 기입!
    private LocalDateTime updatedAt;
}