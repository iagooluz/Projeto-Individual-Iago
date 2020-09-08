package br.com.bandtec.projetoindividual;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class CirurgiaoController extends Medico {

    private Integer consultas;
    private Integer custoConsulta;
    public List<Medico> listaCirurgiao = new ArrayList<>();


    public CirurgiaoController(String nome, String especialiade, Integer consultas, Integer custoConsulta) {
        super(nome, especialiade);
        this.consultas = consultas;
        this.custoConsulta = custoConsulta;
    }

    public int calcSalario() {
        return (custoConsulta * consultas);
    }


       @GetMapping("/listarCirurgiao")
        public List<Medico> getCirurgiao() {
            return listaCirurgiao;
        }


    @DeleteMapping("/excluir/{id}")
    public void excluirCirurgiao(@PathVariable int id) {
        listaCirurgiao.remove(id-1);
        // -1 porque se passarem "/1" quero o 1º (que é o item na posição 0 da lista)
    }


    public Integer getConsultas() {
        return consultas;
    }

    public Integer getCustoConsulta() {
        return custoConsulta;
    }


    }





