package br.com.cwi.crescer.biblioteca.security.mapper;

import br.com.cwi.crescer.biblioteca.security.controller.request.UsuarioRequest;
import br.com.cwi.crescer.biblioteca.security.controller.response.UsuarioResponse;
import br.com.cwi.crescer.biblioteca.security.domain.Usuario;

public class UsuarioMapper {

    public static Usuario toEntity(UsuarioRequest request) {
        Usuario entity = new Usuario();
        entity.setNome(request.getNome());
        entity.setEmail(request.getEmail());
        entity.setTelefone(request.getTelefone());
        entity.setImagemPerfil(request.getImagemPerfil());
        return entity;
    }

    public static UsuarioResponse toResponse(Usuario entity) {
        UsuarioResponse response = new UsuarioResponse();
        response.setId(entity.getId());
        response.setNome(entity.getNome());
        response.setEmail(entity.getEmail());
        response.setTelefone(entity.getTelefone());
        response.setAtivo(entity.isAtivo());
        response.setImagemPerfil(entity.getImagemPerfil());
        response.setAdicionado_em(entity.getAdicionado_em());
        response.setModificado_em(entity.getModificado_em());
        return response;
    }
}
