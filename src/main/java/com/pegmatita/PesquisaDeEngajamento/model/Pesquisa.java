package com.pegmatita.PesquisaDeEngajamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "pesquisa")
@EqualsAndHashCode(of = "id")
public class Pesquisa {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	public String nome;
	

}
