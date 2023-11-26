package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
    /**
     * spring data jpa 쿼리 메소드 사용법
     */
    // select m from Member m where m.username = ?
    List<Member> findByUsername(String username);

}
