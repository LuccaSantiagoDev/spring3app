package br.gov.sp.fatec.springboot3app.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tempo")
public class Tempo {
    
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tmp_id")
    private Long id;


    @Column(name = "tmp_data_hora")
    private LocalDateTime dataHora;

    @Column(name = "tmp_medida")
    private Double medida;

    @Column(name = "tmp_umidade")
    private Double umidade;
    
    @Column(name = "tmp_patriculas")
    private Double particulas;




    public Tempo(Long id, LocalDateTime dataHora, Double medida, Double umidade, Double particulas) {
        this.id = id;
        this.dataHora = dataHora;
        this.medida = medida;
        this.umidade = umidade;
        this.particulas = particulas;
    }

    public Tempo(Long id, LocalDateTime dataHora, Double medida) {
        this.id = id;
        this.dataHora = dataHora;
        this.medida = medida;
    }

    public Tempo() {
        
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Double getMedida() {
        return medida;
    }

    public void setMedida(Double medida) {
        this.medida = medida;
    }

    public Double getUmidade() {
        return umidade;
    }

    public void setUmidade(Double umidade) {
        this.umidade = umidade;
    }

    public Double getParticulas() {
        return particulas;
    }

    public void setParticulas(Double particulas) {
        this.particulas = particulas;
    }

    
}
