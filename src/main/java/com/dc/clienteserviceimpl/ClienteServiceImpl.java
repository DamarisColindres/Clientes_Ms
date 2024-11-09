package com.dc.clienteserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dc.clienteentity.ClienteEntity;
import com.dc.clienterepository.IClienteRepository;
import com.dc.clienteservice.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepository clienteRepository;

	@Override
	public ClienteEntity guardarCliente(ClienteEntity cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public List<ClienteEntity> listarClientes() {
		return clienteRepository.findAll();
	}

	@Override
	public ClienteEntity obtenerClientePorId(Long id) {
	    return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminarCliente(Long id) {
		clienteRepository.deleteById(id);
	}
}