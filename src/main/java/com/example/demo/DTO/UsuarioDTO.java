package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class UsuarioDTO {
	
	int id;
	String nombres;	
	String apellidos;
	String cuenta;
	String correo;
	String contrasena;

}
