package com.aluracursos.desafiospringboot;


import com.aluracursos.desafiospringboot.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafiospringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafiospringbootApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
