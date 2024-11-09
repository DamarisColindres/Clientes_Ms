package com.dc.clienteservice;

import java.util.List;

import com.dc.clienteentity.ClienteEntity;

public interface IClienteService {
    ClienteEntity guardarCliente(ClienteEntity cliente);
    List<ClienteEntity> listarClientes();
    ClienteEntity obtenerClientePorId(Long id);
    void eliminarCliente(Long id);
}