package com.example.project1.member.service;

import com.example.project1.member.dto.MemberForm;
import com.example.project1.member.entity.Member;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    public void add(MemberForm data) {
        // 새 엔티티 개체 생성해서
        Member member = new Member();
        // data 에 있는 것 entity에 옮겨 담고

        // repository.save()
    }
}
