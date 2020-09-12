package com.healthtrack.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.healthtrack.demo.domain.Plano;
import com.healthtrack.demo.repositories.PlanoRepository;

@Service
public class PlanoService {
	
	@Autowired
	private PlanoRepository repo;
	
	public Plano find(Integer id) {
		Optional<Plano> obj = repo.findById(id);
		return obj.orElse(null);


   }
}
