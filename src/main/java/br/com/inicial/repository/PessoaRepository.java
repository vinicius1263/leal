package br.com.inicial.repository;

import br.com.inicial.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {

}
