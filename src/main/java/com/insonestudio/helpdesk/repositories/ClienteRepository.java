package com.insonestudio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insonestudio.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
