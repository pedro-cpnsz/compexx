package com.compexx.compexx_backend.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "exemplos")
@Data
@NoArgsConstructor

public class Exemplo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "implementacao")
    private String implementacao;

    @JoinColumn(name = "idAssunto", referencedColumnName = "id")
    @ManyToOne
    private Materia materia;

    @CreationTimestamp
    @Column(name = "dataInsercao", updatable = false)
    private Timestamp dataInsercao;

    public Exemplo(String titulo, String implementacao, Materia materia) {
        this.titulo = titulo;
        this.implementacao = implementacao;
        this.materia = materia;
    }

}
