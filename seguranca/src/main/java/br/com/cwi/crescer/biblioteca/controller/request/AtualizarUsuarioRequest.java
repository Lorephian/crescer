package br.com.cwi.crescer.biblioteca.controller.request;

import lombok.*;

import javax.persistence.Column;

@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class AtualizarUsuarioRequest {

    private String nome;

    private String email;

    private String imagemPerfil;

    private String telefone;

    private boolean ativo;
}
