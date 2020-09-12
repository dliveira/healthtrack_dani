package com.healthtrack.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.healthtrack.demo.domain.Plano;
import com.healthtrack.demo.repositories.PlanoRepository;

@SpringBootApplication
public class HealthtrackApplication implements CommandLineRunner {
	
	@Autowired
	private PlanoRepository planoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HealthtrackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Plano p1 = new Plano(null, "Nutricao", null, null, null);
		Plano p2 = new Plano(null, "Exercicio", null, null, null);
		
		planoRepository.saveAll(Arrays.asList(p1, p2));
	}

	
}
