package com.example.project1.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.example.project1.entity.Board}
 */
//@Value
@Data
public class BoardDto implements Serializable {
    Integer id;
    String title;
    String content;
    String writer;
    LocalDateTime createdAt;
}