package com.compexx.compexx_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compexx.compexx_backend.model.Materia;

@RestController
@RequestMapping(value = "materias")

public class MateriaController extends GenericController<Materia, Integer> {

}
