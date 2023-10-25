package br.gov.sp.fatec.springboot3app.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.gov.sp.fatec.springboot3app.entity.Tempo;


public interface TempoRepository extends JpaRepository<Tempo, Long>  {


    @Query("SELECT t FROM Tempo t WHERE t.dataHora > :dataHora AND t.medida > :medida")
    List<Tempo> findTempoAfterDateTime(@Param("dataHora") LocalDateTime dataHora, @Param("medida") Double medida);


    
}
