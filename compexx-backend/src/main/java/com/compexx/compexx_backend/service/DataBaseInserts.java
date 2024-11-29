package com.compexx.compexx_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.compexx.compexx_backend.model.Assunto;
import com.compexx.compexx_backend.model.Exemplo;
import com.compexx.compexx_backend.model.ExemploAcessado;
import com.compexx.compexx_backend.model.Instituicao;
import com.compexx.compexx_backend.model.Materia;
import com.compexx.compexx_backend.model.Usuario;
import com.compexx.compexx_backend.model.UsuarioInstituicao;
import com.compexx.compexx_backend.repository.AssuntoRepository;
import com.compexx.compexx_backend.repository.ExemploAcessadoRepository;
import com.compexx.compexx_backend.repository.ExemploRepository;
import com.compexx.compexx_backend.repository.InstituicaoRepository;
import com.compexx.compexx_backend.repository.MateriaRepository;
import com.compexx.compexx_backend.repository.UsuarioInstituicaoRepository;
import com.compexx.compexx_backend.repository.UsuarioRepository;

@Component
public class DataBaseInserts implements CommandLineRunner {

    @Autowired
    AssuntoRepository assuntoRepository;
    @Autowired
    MateriaRepository materiaRepository;
    @Autowired
    ExemploRepository exemploRepository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    InstituicaoRepository instituicaoRepository;
    @Autowired
    UsuarioInstituicaoRepository usuarioInstituicaoRepository;
    @Autowired
    ExemploAcessadoRepository exemploAcessadoRepository;

    @Override
    public void run(String... args) throws Exception {

        Assunto a1 = new Assunto("HTML e CSS");
        assuntoRepository.save(a1);

        Materia m1 = new Materia("Desenvolvimento WEB", a1);
        materiaRepository.save(m1);

        Exemplo e1 = new Exemplo("Cabeçalhos", "código", m1);
        exemploRepository.save(e1);

        Usuario u1 = new Usuario("Pedro", "pedro@email.com", "123321", "(45) 99845-6365", true);
        usuarioRepository.save(u1);

        Instituicao i1 = new Instituicao("Senac Cascavel", "154156956");
        instituicaoRepository.save(i1);

        UsuarioInstituicao ui1 = new UsuarioInstituicao(u1, i1);
        usuarioInstituicaoRepository.save(ui1);

        ExemploAcessado ea1 = new ExemploAcessado(ui1, e1, null);
        exemploAcessadoRepository.save(ea1);

    }

}
