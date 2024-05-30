package com.insonestudio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insonestudio.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
