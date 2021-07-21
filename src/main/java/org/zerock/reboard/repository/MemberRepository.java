package org.zerock.reboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.reboard.entity.Member;

public interface MemberRepository extends JpaRepository<Member,String> {
}
