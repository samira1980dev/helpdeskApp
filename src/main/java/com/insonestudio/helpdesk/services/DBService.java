package com.insonestudio.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.insonestudio.helpdesk.domain.Chamado;
import com.insonestudio.helpdesk.domain.Cliente;
import com.insonestudio.helpdesk.domain.Tecnico;
import com.insonestudio.helpdesk.domain.enums.Perfil;
import com.insonestudio.helpdesk.domain.enums.Prioridade;
import com.insonestudio.helpdesk.domain.enums.Status;
import com.insonestudio.helpdesk.repositories.ChamadoRepository;
import com.insonestudio.helpdesk.repositories.ClienteRepository;
import com.insonestudio.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	@Bean
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Samira Marcela", "55861811008", "samira1980dev@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "47448824040", "torvalds@mail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
