package com.dc.clienterepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dc.clienteentity.ClienteEntity;

public interface IClienteRepository extends JpaRepository<ClienteEntity, Long> {
	
}
