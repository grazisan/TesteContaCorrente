package com.contas.controle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contas.controle.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

	Conta findbyId(int numero);
}