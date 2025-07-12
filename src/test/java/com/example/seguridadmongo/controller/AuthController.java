package com.example.seguridadmongo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/user")
    public String user() {
        return "Contenido para USUARIO";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Contenido para ADMINISTRADOR";
    }
}
