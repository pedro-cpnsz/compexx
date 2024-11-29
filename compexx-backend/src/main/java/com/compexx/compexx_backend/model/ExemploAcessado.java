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
@Table(name = "exemplos_acessados")
@Data
@NoArgsConstructor

public class ExemploAcessado {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "idUsuarioInstituicao", referencedColumnName = "id")
    @ManyToOne
    private UsuarioInstituicao usuarioInstituicao;

    @JoinColumn(name = "idExemplo", referencedColumnName = "id")
    @ManyToOne
    private Exemplo exemplo;

    @CreationTimestamp
    @Column(name = "data_publicacao", updatable = false)
    private Timestamp data_publicacao;

    public ExemploAcessado(UsuarioInstituicao usuarioInstituicao, Exemplo exemplo) {
        this.usuarioInstituicao = usuarioInstituicao;
        this.exemplo = exemplo;
    }

}
