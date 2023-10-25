package br.gov.sp.fatec.springboot3app.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3app.entity.Tempo;
import br.gov.sp.fatec.springboot3app.repository.TempoRepository;

@Service
public class TempoService {
    
    @Autowired
    private TempoRepository tempoRepository;

    public List<Tempo> findAll(){
        return tempoRepository.findAll();

    };

    public List<Tempo> findAte(LocalDateTime dataHora,Double medida){
        return tempoRepository.findTempoAfterDateTime(dataHora,medida);
    };

    public Tempo save(Tempo tempo){
        tempoRepository.save(tempo);
        return tempo;
    };

    
}
