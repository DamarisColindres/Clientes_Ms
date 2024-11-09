package com.dc.clienteentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ClienteEntity {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nombre;
	    private String correo;
	    private String telefono;
	   	private String direccion;
	   	private String nit;

}
