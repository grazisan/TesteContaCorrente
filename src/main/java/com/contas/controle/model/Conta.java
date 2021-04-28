package com.contas.controle.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Conta {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private long numero;
	
	@Column (nullable = false)
	private Pessoa pessoa;
	
	@Column
	private Date dtCriacao;
	
	@Column
	private LocalDateTime hrCriacao;
	
	@Column 
	private double saldo;
	
	public Conta(Pessoa pessoa, Date dtCriacao, LocalDateTime hrCriacao, long numero, double saldo) {
		super();
		this.pessoa = pessoa;
		this.dtCriacao = dtCriacao;
		this.hrCriacao = hrCriacao;
		this.numero = numero;
		this.saldo = saldo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	public LocalDateTime getHrCriacao() {
		return hrCriacao;
	}

	public void setHrCriacao(LocalDateTime hrCriacao) {
		this.hrCriacao = hrCriacao;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
