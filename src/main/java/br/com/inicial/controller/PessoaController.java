package br.com.inicial.controller;

import br.com.inicial.model.Pessoa;
import br.com.inicial.repository.PessoaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PessoaController {

    private PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public PessoaController(){

    }

    @GetMapping("/listar")
    public List<Pessoa> listar(){

        return pessoaRepository.findAll();
    }

//    @GetMapping("/vercidade")
//    public String verCidade(){
//
//        return "SALVADOR";
//    }
//    @GetMapping("/verpais")
//    public String verPais(){
//
//        return "BRASIL";
//    }
//    @GetMapping("/contar")
//    public void contar(){
//        for ( int i = 0; i <= 10;i++){
//            System.out.println(i);
//
//
//
//        }
//    }


}
