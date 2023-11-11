package com.example.ticketone.repo;

import com.example.ticketone.model.Relatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatoreRepository extends JpaRepository<Relatore, Integer> {
}
