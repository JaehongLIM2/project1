package com.example.project1.member.repository;

import com.example.project1.member.dto.MemberListInfo;
import com.example.project1.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {
    Optional<Member> findByNickname(String nickname);

    List<MemberListInfo> findAllBy();
}