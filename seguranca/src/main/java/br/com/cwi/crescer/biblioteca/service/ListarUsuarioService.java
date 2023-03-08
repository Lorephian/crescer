package br.com.cwi.crescer.biblioteca.service;

import br.com.cwi.crescer.biblioteca.controller.request.AtualizarUsuarioRequest;
import br.com.cwi.crescer.biblioteca.security.controller.response.UsuarioResponse;
import br.com.cwi.crescer.biblioteca.security.domain.Usuario;
import br.com.cwi.crescer.biblioteca.security.mapper.UsuarioMapper;
import br.com.cwi.crescer.biblioteca.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ListarUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioResponse getById(Long id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        return UsuarioMapper.toResponse(usuario);
    }

    public Page<UsuarioResponse> listarPorEmailOuPorNome(String received, Pageable pageable) {
        return usuarioRepository.findByNomeContainingIgnoreCaseOrEmailContainingIgnoreCaseAndAtivo(received, received, true, pageable)
                .map(UsuarioMapper::toResponse);
    }

    public UsuarioResponse atualizarUsuario(Long id, AtualizarUsuarioRequest request) {
        Usuario usuario = usuarioRepository.findById(id).get();

        return UsuarioMapper.toResponse(usuario);
    }
}
