package com.example.ticketone.repo;

import com.example.ticketone.model.StudenteEsame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudenteEsameRepository extends JpaRepository<StudenteEsame, Integer> {
}
