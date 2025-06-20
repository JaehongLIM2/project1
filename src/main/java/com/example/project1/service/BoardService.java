package com.example.project1.service;

import com.example.project1.dto.BoardForm;
import com.example.project1.dto.BoardListInfo;
import com.example.project1.dto.PageResult;
import com.example.project1.entity.Board;
import com.example.project1.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void add(BoardForm formData) {
        Board board = new Board();
        board.setTitle(formData.getTitle());
        board.setContent(formData.getContent());
        board.setWriter(formData.getWriter());

        boardRepository.save(board);
    }

    public PageResult<BoardListInfo> list(Integer page) {
//        List<Board> list = boardRepository.findAll();
        Pageable pageable = PageRequest.of(page - 1, 10, Sort.by("id").descending());

        Page<BoardListInfo> result = boardRepository
                .findAllBy(pageable);


        return new PageResult<>(result, page);
    }
}
