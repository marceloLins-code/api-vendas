package com.lins.vendas.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lins.vendas.Repository.VendaRepository;
import com.lins.vendas.model.Venda;
@Service
public class VendaService {
	
	@Autowired
	VendaRepository vendaRepository;

//	public LocalDate gerarDataEntrega(Venda data) {
//		LocalDate dataPresente = vendaRepository.
//		 return this.dataEntrega = dataPresente.plusDays(10);
//		
//		}


		   
		// this.dataEntrega = LocalDate.of(this.dataVenda.getYear(),
		// this.dataVenda.getMonth(), this.dataVenda.getDayOfMonth());
		// this.dataEntrega = LocalDate.from(getDataVenda().plusDays(10));
	

}
