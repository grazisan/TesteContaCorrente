package com.contas.controle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contas.controle.model.Conta;
import com.contas.controle.repository.ContaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Conta")
@CrossOrigin(origins = "*") //* significa que qq domínio pode acessar essa api
public class ContaController {

	@Autowired
	ContaRepository contaRepository;
	
	@PostMapping(value = "/conta")
	@ApiOperation(value = "Cria uma conta")
	public Conta criarConta(@RequestBody Conta conta){
		return contaRepository.save(conta);
		
	}
	
	@GetMapping(value = "/conta/{id}")
	@ApiOperation(value = "Busca uma conta por através do Id")
	public Conta consultarConta(@PathVariable (value ="id") int numero) {
		return contaRepository.findbyId(numero);
		
	}
	
	@PutMapping(value = "/conta")
	@ApiOperation(value = "Insere crédito em uma conta")
	public Conta inserirCredito(@RequestBody Conta saldo) {
		return contaRepository.save(saldo);
		
	}
	
	@ApiOperation(value = "Transfere valor entre contas")
	public Conta transferir() {
		return null;
		
	}
}
