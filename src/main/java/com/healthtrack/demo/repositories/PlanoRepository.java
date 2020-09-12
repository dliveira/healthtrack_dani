package com.healthtrack.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthtrack.demo.domain.Plano;

@Repository
public interface PlanoRepository extends JpaRepository<Plano, Integer>{
	
}
