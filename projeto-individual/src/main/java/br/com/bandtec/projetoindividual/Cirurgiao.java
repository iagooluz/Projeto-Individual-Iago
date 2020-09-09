package br.com.bandtec.projetoindividual;

import java.util.ArrayList;
import java.util.List;

public class Cirurgiao extends Medico {




    public Cirurgiao(String nome, String especialidade, Integer consultas, Integer custoConsulta) {
        super(nome, especialidade, consultas, custoConsulta);

    }

    @Override
    public double calcSalario() {
        return getConsultas() * (getCustoConsulta() * 0.20) * getCustoConsulta();
    }

}
