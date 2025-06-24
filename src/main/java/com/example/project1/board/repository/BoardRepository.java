package com.example.project1.board.repository;

import com.example.project1.board.dto.BoardListInfo;
import com.example.project1.board.entity.Board;
import com.example.project1.member.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {
  // 오버로드용 파라미터 없는 것
  List<BoardListInfo> findAllBy();

  Page<BoardListInfo> findAllBy(Pageable pageable);

    void deleteByWriter(Member member);

  @Query("""
            SELECT b
            FROM Board b
            WHERE b.title LIKE :keyword
               OR b.content LIKE :keyword
               OR b.writer.nickname LIKE :keyword
            """)
  Page<BoardListInfo> searchByKeyword(String keyword, PageRequest pageRequest);
}