package com.lins.vendas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lins.vendas.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
}
