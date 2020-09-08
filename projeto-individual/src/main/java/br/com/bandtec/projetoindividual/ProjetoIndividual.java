package br.com.bandtec.projetoindividual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProjetoIndividual {
	//COLOCAR ("/Nome_do_EndPoint") DEPOIS DO @GETMAPPING PARA PODER DIZER QUE AQUELE ENDPOINT DETERMINA TAL COISA
	//GET MAPPING É UM ENDPOINT.
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetoIndividual.class, args);
	}

}
