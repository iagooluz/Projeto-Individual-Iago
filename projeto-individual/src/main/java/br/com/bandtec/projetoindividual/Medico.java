package br.com.bandtec.projetoindividual;



public abstract class Medico {


  private String nome;
  private String especialidade;
  private Integer consultas;
  private Integer custoConsulta;


    public Medico(String nome, String especialidade, Integer consultas, Integer custoConsulta) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.consultas = consultas;
        this.custoConsulta = custoConsulta;
    }

    public abstract double calcSalario();

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;

    }

    public Integer getConsultas() {
        return consultas;
    }

    public Integer getCustoConsulta() {
        return custoConsulta;
    }
}


