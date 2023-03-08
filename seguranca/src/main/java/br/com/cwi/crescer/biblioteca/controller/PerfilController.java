package br.com.cwi.crescer.biblioteca.controller;


import br.com.cwi.crescer.biblioteca.security.controller.response.UsuarioResponse;
import br.com.cwi.crescer.biblioteca.security.repository.UsuarioRepository;
import br.com.cwi.crescer.biblioteca.service.ListarUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

    @Autowired
    private ListarUsuarioService listarUsuarioService;

    @GetMapping("/{id}")
    public UsuarioResponse getById(@PathVariable Long id) {
        return listarUsuarioService.getById(id);
    }

    @GetMapping("/busca")
    public Page<UsuarioResponse> buscarUsuarios(@RequestParam String busca, Pageable pageable) {
        return listarUsuarioService.listarPorEmailOuPorNome(busca,pageable);
    }
}
