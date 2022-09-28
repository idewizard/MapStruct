package br.com.study.mapstruct.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Motor {
    private float litragem;
    private int qtCilindros;
    private Fabricante fabricante;
    private int tamanhoEmCentimetros;
}
