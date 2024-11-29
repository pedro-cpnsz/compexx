package com.compexx.compexx_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compexx.compexx_backend.model.Exemplo;

@RestController
@RequestMapping(value = "exemplos")

public class ExemploController extends GenericController<Exemplo, Integer> {

}
