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
@Table(name = "usuarios_instituicoes")
@Data
@NoArgsConstructor

public class UsuarioInstituicao {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "idUsuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario usuario;

    @JoinColumn(name = "idInstituicao", referencedColumnName = "id")
    @ManyToOne
    private Instituicao instituicao;

    @CreationTimestamp
    @Column(name = "data_publicacao", updatable = false)
    private Timestamp data_publicacao;

    public UsuarioInstituicao(Usuario usuario, Instituicao instituicao) {
        this.usuario = usuario;
        this.instituicao = instituicao;
    }

}
