package com.compexx.compexx_backend.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    @CreationTimestamp
    @Column(name = "dataInsercao", updatable = false)
    private Timestamp dataInsercao;

    public Assunto(String nome) {
        this.nome = nome;
    }

}
