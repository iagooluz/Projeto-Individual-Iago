package br.com.bandtec.projetoindividual;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/oftalmologistas")
public class OftalmologistaController {

    private List<Medico> listaOftalmologista = new ArrayList<>();

    @GetMapping("/calcularSalario")
    public int calcSalario() {

        int totalSalario = 0;

        for (Medico m : listaOftalmologista) {
           totalSalario = m.getConsultas() * m.getCustoConsulta();
        }
        return totalSalario;
    }

    @GetMapping("/listarOftalmo")
    public List<Medico> getOftalmo() {
        return listaOftalmologista;
    }

    @PostMapping("/")
    public void cadastrarOftalmo(@RequestBody Oftalmologista oftalmologista){
        listaOftalmologista.add(oftalmologista);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirCachorro(@PathVariable int id) {
        listaOftalmologista.remove(id-1);
        // -1 porque se passarem "/1" quero o 1º (que é o item na posição 0 da lista)
    }

    @GetMapping("/seleciona/{id}")
    public void selecionarCirurgiao(@PathVariable int id) {
        listaOftalmologista.get(id - 1);

    }


}
