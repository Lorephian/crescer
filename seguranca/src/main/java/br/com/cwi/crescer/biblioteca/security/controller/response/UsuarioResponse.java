package br.com.cwi.crescer.biblioteca.security.controller.response;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDate;

@Getter
@Setter
public class UsuarioResponse {

    private Long id;

    private String nome;

    private String email;

    private String senha;

    private boolean ativo;

    private String imagemPerfil;

    private String telefone;

    private LocalDate adicionado_em;

    private LocalDate modificado_em;
}
