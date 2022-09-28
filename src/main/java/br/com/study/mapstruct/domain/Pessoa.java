package br.com.study.mapstruct.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private String nomeCompleto;
    private Endereco enderecoCompleto;
}
