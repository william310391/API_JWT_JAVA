package com.example.demo.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.example.demo.Exception.ValidationGroup.Login;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class UsuarioDTO {
	
	int id;
	String nombres;	
	String apellidos;
	@NotBlank(message = "campo requerido cuenta NotBlank",groups = Login.class)
	@NotNull(message = "campo requerido cuenta NotNull",groups = Login.class)
	String cuenta;
	String correo;
	@NotNull(message = "campo requerido passssss",groups = Login.class)
	@NotEmpty(message = "campo requerido passssss",groups = Login.class)
	String contrasena;

}
