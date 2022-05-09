package com.lins.vendas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lins.vendas.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer>{

}
