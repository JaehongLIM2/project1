package com.example.project1.repository;

import com.example.project1.dto.BoardListInfo;
import com.example.project1.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {
  // 오버로드용 파라미터 없는 것
  List<BoardListInfo> findAllBy();

  Page<BoardListInfo> findAllBy(Pageable pageable);
}