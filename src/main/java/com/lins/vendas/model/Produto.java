package com.lins.vendas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	// @Column(length = 30)
	@NotBlank
	private String nome;
	
	@NotBlank
	@PositiveOrZero
	//@Digits(integer=3,fraction=2)
	private double valor;

//	@JsonIgnore
//	@ManyToOne
//	@JoinColumn(name = "venda_id", nullable = false)
//	private Venda venda;
	

}
