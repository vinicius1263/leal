package br.com.inicial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @GetMapping("/vernome")
    public String verNome(){

      return "ilza";
    }

    @GetMapping("/vercidade")
    public String verCidade(){

        return "SALVADOR";
    }
}
