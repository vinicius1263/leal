package br.com.inicial.config;


import br.com.inicial.model.Pessoa;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Scheuduler {


    @Scheduled(initialDelay = 1, fixedDelay=60*1000 )
    private void chamandoExecutar() {
        try {
            Pessoa pessoa = new Pessoa();
//            pessoa.falar();
        }catch (Exception e){
            System.out.println(e);
        }
    }


}