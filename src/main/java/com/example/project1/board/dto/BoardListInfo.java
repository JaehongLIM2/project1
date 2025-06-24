package com.example.project1.board.dto;


import com.example.project1.member.dto.MemberListInfo;

import java.time.LocalDateTime;

public interface BoardListInfo {
    public Integer getId();

    public String getTitle();

    public MemberListInfo getWriter();

    public LocalDateTime getCreatedAt();
}
