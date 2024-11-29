package com.compexx.compexx_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compexx.compexx_backend.model.UsuarioInstituicao;

@RestController
@RequestMapping(value = "usuarios_instituicoes")

public class UsuarioInstituicaoController extends GenericController<UsuarioInstituicao, Integer> {

}
