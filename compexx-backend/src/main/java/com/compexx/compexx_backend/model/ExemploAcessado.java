package com.compexx.compexx_backend.model;

import java.sql.Timestamp;

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

    @Column(name = "dataAcesso")
    private Timestamp dataAcesso;

    public ExemploAcessado(UsuarioInstituicao usuarioInstituicao, Exemplo exemplo, Timestamp dataAcesso) {
        this.usuarioInstituicao = usuarioInstituicao;
        this.exemplo = exemplo;
        this.dataAcesso = dataAcesso;
    }

}
