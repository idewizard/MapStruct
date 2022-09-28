package br.com.study.mapstruct.controller.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EnderecoResponse {
    /*OS CAMPOS VEM DE DOIS OBJETOS DIFERENTES ENDERECO E PESSOA*/
    private String nome;
    private String cep;
}
