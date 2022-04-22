package com.example.chakruk;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entidades.Roles;
import com.entidades.Usuario;

@SpringBootApplication
public class ChakrukApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChakrukApplication.class, args);
				
	}

}
