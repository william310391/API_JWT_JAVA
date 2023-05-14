package com.example.demo.DTO.MapperConfig;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.Entity.Usuario;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);
    @Mapping(target = "contrasena", ignore = true)      // afecta tambien a listas entidad a DTO
    UsuarioDTO usuarioToUsuarioDTO(Usuario usuario);
    List<UsuarioDTO> getUsuarios(List<Usuario> ent);
}
