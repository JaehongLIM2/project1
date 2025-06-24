package com.example.project1.board.repository;

import com.example.project1.board.dto.BoardListInfo;
import com.example.project1.board.entity.Board;
import com.example.project1.member.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {
  // 오버로드용 파라미터 없는 것
  List<BoardListInfo> findAllBy();

  Page<BoardListInfo> findAllBy(Pageable pageable);

    void deleteByWriter(Member member);
}