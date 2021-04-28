package com.contas.controle.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "TB_PF")
public class Fisica extends Pessoa{
	
	@Id
	private int cpf;
	
	@Column (nullable = false)
	private Date dtNascimento;
	
	public Fisica(String nome, int cpf, Date dtNascimento ) {
		super(nome);
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		// TODO Auto-generated constructor stub
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}


	
	

	
}
