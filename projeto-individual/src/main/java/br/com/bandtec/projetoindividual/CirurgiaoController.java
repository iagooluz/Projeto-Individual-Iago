package br.com.bandtec.projetoindividual;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cirurgioes")
public class CirurgiaoController {


    public List<Medico> listaCirurgiao = new ArrayList<>();


    @PostMapping("/cadastrar")
    public void cadastrarCirurgiao(@RequestBody Oftalmologista oftalmologista){
        listaCirurgiao.add(oftalmologista);
    }

    @GetMapping("/calcularSalario")
    public int calculaSalario() {

        int totalSalario = 0;

        for (Medico m : listaCirurgiao) {
            totalSalario = m.getConsultas() * m.getCustoConsulta();
        }
        return totalSalario;
    }

    @GetMapping("/listar")
    public List<Medico> getCirurgiao() {
        return listaCirurgiao;
    }



    @DeleteMapping("/excluir/{id}")
    public void excluirCirurgiao(@PathVariable int id) {
        listaCirurgiao.remove(id-1);
        
    }

    @GetMapping("/seleciona/{id}")
    public void selecionarCirurgiao(@PathVariable int id) {
        listaCirurgiao.get(id - 1);

    }
}





