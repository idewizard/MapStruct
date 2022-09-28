package br.com.study.mapstruct.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String cep;
}