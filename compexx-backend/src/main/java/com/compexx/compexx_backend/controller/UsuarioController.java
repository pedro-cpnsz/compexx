package com.compexx.compexx_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compexx.compexx_backend.model.Usuario;

@RestController
@RequestMapping(value = "usuarios")

public class UsuarioController extends GenericController<Usuario, Integer> {

}
