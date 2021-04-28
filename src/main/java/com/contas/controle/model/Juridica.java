package com.contas.controle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "TB_PJ")
public class Juridica  extends Pessoa{
	
	@Id
	private int cnpj;
	
	@Column (nullable = false)
	private String razaoSocial;
	
	
	public Juridica(String nome, int cnpj, String razaoSocial) {
		super(nome);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
}