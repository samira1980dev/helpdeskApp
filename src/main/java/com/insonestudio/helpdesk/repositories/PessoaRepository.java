package com.insonestudio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insonestudio.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
