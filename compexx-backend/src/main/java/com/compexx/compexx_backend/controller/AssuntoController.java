package com.compexx.compexx_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compexx.compexx_backend.model.Assunto;

@RestController
@RequestMapping(value = "assuntos")

public class AssuntoController extends GenericController<Assunto, Integer> {

}
