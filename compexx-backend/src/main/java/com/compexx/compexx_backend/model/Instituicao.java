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
@Table(name = "instituicoes")
@Data
@NoArgsConstructor

public class Instituicao {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "razaoSocial")
    private String razaoSocial;

    @Column(name = "cnpj")
    private String cnpj;

    @CreationTimestamp
    @Column(name = "dataInsercao", updatable = false)
    private Timestamp dataInsercao;

    public Instituicao(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

}
