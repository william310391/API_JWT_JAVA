package com.example.demo.Service;

import org.springframework.http.ResponseEntity;

import com.example.demo.DTO.UsuarioDTO;


public interface UsuarioService {
    public ResponseEntity<?> findAll();
    public ResponseEntity<?> findById(Integer UsuarioId);
    public ResponseEntity<?> Save(UsuarioDTO usuarioDTO);
    public ResponseEntity<?> Update(UsuarioDTO usuarioDTO);
    public ResponseEntity<?> delete(Integer usuarioId);
}
