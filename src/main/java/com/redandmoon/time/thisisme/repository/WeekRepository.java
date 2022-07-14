package com.redandmoon.time.thisisme.repository;

import com.redandmoon.time.thisisme.entity.Week;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekRepository extends JpaRepository<Week, Long> {
}

