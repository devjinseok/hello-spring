package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 저장
    Optional<Member> findById(Long id); // 아이디 찾기
    Optional<Member> findByName(String name); // 닉네임 찾기
    List<Member> findAll();  // 전체 가져오기


    /**
     *
     */
}
