package com.dc.clientecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dc.clienteentity.ClienteEntity;
import com.dc.clienteservice.IClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	
	@Autowired
    private IClienteService clienteService;
    
    @PostMapping
    public ClienteEntity guardarCliente(@RequestBody ClienteEntity cliente) { 
    return clienteService.guardarCliente(cliente);
    }

    @GetMapping
    public List<ClienteEntity> listarClientes() { 
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public ClienteEntity obtenerClientePorId(@PathVariable Long id) {
        return clienteService.obtenerClientePorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
    }
}
