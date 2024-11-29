package com.compexx.compexx_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compexx.compexx_backend.model.ExemploAcessado;

@RestController
@RequestMapping(value = "exemplos_acessados")

public class ExemploAcessadoController extends GenericController<ExemploAcessado, Integer> {

}
