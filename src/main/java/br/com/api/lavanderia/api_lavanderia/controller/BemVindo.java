package br.com.api.lavanderia.api_lavanderia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BemVindo {

    @GetMapping
    public String bemVindo(){
        return "Bem vindo ao Cliente";
    }
}
