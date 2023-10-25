package br.gov.sp.fatec.springboot3app.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springboot3app.entity.Tempo;
import br.gov.sp.fatec.springboot3app.service.TempoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/temperatura")
public class TempoController {

    @Autowired
    private TempoService ts;

    @GetMapping
    public List<Tempo> buscarTodas() {
        return ts.findAll();
    };

    @PostMapping
    public Tempo NewTempo(@RequestBody Tempo tempo) {
        return ts.save(tempo);
    }

    @GetMapping (value = "/{dataHora}/{medida}")
    public List<Tempo> buscarAte(@PathVariable("dataHora") LocalDateTime dataHora,@PathVariable("medida") Double medida) {
        return ts.findAte(dataHora,medida);
    };


    
}
