package com.insonestudio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insonestudio.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
