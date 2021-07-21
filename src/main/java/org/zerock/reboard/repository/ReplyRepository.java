package org.zerock.reboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.reboard.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply,Long> {
}
