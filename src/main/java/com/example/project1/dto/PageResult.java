package com.example.project1.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
public class PageResult<T> {
    private List<T> content;
    private Integer currentPage;
    private Integer totalPages;
    private Integer startPages;
    private Integer endPages;

    public PageResult(Page<T> pageDate, int page) {
        this.content = pageDate.getContent();
        this.currentPage = page;
        this.totalPages = pageDate.getTotalPages();

        int start = ((page - 1) / 10) * 10 + 1;
        int end = Math.min(start + 9, totalPages);
        this.startPages = start;
        this.endPages = end;
    }
}
