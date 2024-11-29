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
@Table(name = "assuntos")
@Data
@NoArgsConstructor

public class Assunto {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @JoinColumn(name = "idMateria", referencedColumnName = "id")
    @ManyToOne
    private Materia materia;

    @CreationTimestamp
    @Column(name = "data_publicacao", updatable = false)
    private Timestamp data_publicacao;

    public Assunto(String nome, Materia materia) {
        this.nome = nome;
        this.materia = materia;
    }
}
