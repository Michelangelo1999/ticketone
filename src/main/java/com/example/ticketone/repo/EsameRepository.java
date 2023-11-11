package com.example.ticketone.repo;

import com.example.ticketone.model.Esame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsameRepository extends JpaRepository<Esame, Integer> {


}
