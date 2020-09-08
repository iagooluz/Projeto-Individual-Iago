package br.com.bandtec.projetoindividual;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class Medico {


  private String nome;
  private String especialiade;


    public Medico(String nome, String especialiade) {
        this.nome = nome;
        this.especialiade = especialiade;
    }



    @GetMapping("/cirurgioes")

    public String getNome() {
        return nome;
    }

    public String getEspecialiade() {
        return especialiade;
    }

    public static void main(String[] args) {

         CirurgiaoController[] cirurgioes = {
            new CirurgiaoController("João", "Cirurgião",3, 150),
        };

         OftalmologistaController[] oftalmologistas = {
                 new OftalmologistaController("Pedro","Oftalmologista", 2, 200)
         };


    }
}

