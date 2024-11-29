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
@Table(name = "materias")
@Data
@NoArgsConstructor

public class Materia {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @JoinColumn(name = "idMateria", referencedColumnName = "id")
    @ManyToOne
    private Assunto assunto;

    @CreationTimestamp
    @Column(name = "dataInsercao", updatable = false)
    private Timestamp dataInsercao;

    public Materia(String nome, Assunto assunto) {
        this.nome = nome;
        this.assunto = assunto;
    }

}
