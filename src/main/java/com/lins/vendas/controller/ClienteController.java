package com.lins.vendas.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lins.vendas.Repository.ClienteRepository;
import com.lins.vendas.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}


	@GetMapping("/{clienteId}")
	public ResponseEntity<Cliente> buscar(@PathVariable Integer clienteId) {
		return clienteRepository.findById(clienteId)
				.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@PutMapping("/{clienteId}")
	public ResponseEntity<Cliente> atualizar(@PathVariable Integer clienteId,
			@RequestBody Cliente cliente) {
		Cliente clienteAtual = clienteRepository.getById(clienteId);
		
		if (clienteAtual != null) {	
			BeanUtils.copyProperties(cliente, clienteAtual, "id");
			
			clienteAtual = clienteRepository.save( clienteAtual );
			return ResponseEntity.ok(clienteAtual);
		}
		
		return ResponseEntity.notFound().build();
	}
	@DeleteMapping("/{clienteId}")
	public ResponseEntity<Cliente> remover(@PathVariable Integer clienteId) {
		try {
			Cliente cliente = clienteRepository.getById(clienteId);
			
			if (cliente != null) {
				clienteRepository.delete(cliente);
				
				return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.notFound().build();
		} catch (DataIntegrityViolationException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
	}
}