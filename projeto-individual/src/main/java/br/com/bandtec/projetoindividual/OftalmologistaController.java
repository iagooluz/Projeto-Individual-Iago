package br.com.bandtec.projetoindividual;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OftalmologistaController extends Medico {


  private Integer consultas;
  private Integer custoConsulta;
    public List<Medico> listaOftalmo = new ArrayList<>();


    public OftalmologistaController(String nome, String especialiade, Integer consultas, Integer custoConsulta) {
        super(nome, especialiade);
        this.consultas = consultas;
        this.custoConsulta = custoConsulta;
    }

    @GetMapping("calcularSalario")
    public int calcSalario(){
        return (custoConsulta * consultas);
    }

    @GetMapping("ExibirMensagemCalculo")
    public void Mensagem(){
        System.out.println(String.format("O salário de %s é de R$%d", getNome(), calcSalario()));
    }

    @GetMapping("/listarOftalmo")
    public List<Medico> getOftalmo() {
        return listaOftalmo;
    }


    @DeleteMapping("/excluir/{id}")
    public void excluirCachorro(@PathVariable int id) {
        listaOftalmo.remove(id-1);
        // -1 porque se passarem "/1" quero o 1º (que é o item na posição 0 da lista)
    }


    public Integer getConsultas() {
        return consultas;
    }

    public Integer getCustoConsulta() {
        return custoConsulta;
    }



}

