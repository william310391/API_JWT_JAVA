package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;

import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.Exception.ValidationGroup.Login;
import com.example.demo.Service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;
    
    @GetMapping("/ping")
    public String ping() {
        return "holaa sssssss";
    }
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        return service.findAll();
    }

    @GetMapping("/findById")
    public ResponseEntity<?> findById(@RequestParam Integer usuarioId){
        return service.findById(usuarioId);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody UsuarioDTO dto){
        return service.Save(dto);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody UsuarioDTO dto){
        return service.Update(dto);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(@RequestParam Integer usuarioId){
        return service.delete(usuarioId);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Validated({Login.class})@RequestBody UsuarioDTO dto){
        return service.Login(dto);
    }
}
