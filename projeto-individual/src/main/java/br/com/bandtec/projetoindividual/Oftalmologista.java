package br.com.bandtec.projetoindividual;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


public class Oftalmologista extends Medico {





    public Oftalmologista(String nome, String especialidade, Integer consultas, Integer custoConsulta) {
        super(nome, especialidade, consultas, custoConsulta);

    }

    @Override
    public double calcSalario() {
        return getConsultas() * (getCustoConsulta() * 0.10) * getCustoConsulta();
    }
}

