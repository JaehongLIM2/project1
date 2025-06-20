package com.example.project1.repository;

import com.example.project1.dto.BoardListInfo;
import com.example.project1.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {

  List<BoardListInfo> findAllBy();
}