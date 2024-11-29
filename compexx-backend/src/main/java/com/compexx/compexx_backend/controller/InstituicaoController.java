package com.compexx.compexx_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compexx.compexx_backend.model.Instituicao;

@RestController
@RequestMapping(value = "instituicoes")

public class InstituicaoController extends GenericController<Instituicao, Integer> {

}
