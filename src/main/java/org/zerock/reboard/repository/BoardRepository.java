package org.zerock.reboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.reboard.entity.Board;

public interface BoardRepository extends JpaRepository<Board,Long> {
}
