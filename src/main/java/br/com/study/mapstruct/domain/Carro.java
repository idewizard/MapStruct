package br.com.study.mapstruct.domain;

import br.com.study.mapstruct.enums.CorEmpresa;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
    private String numeroPlacaA;
    private String numeroChassi;
    private Pessoa motorista;
    private int tamanhoRoda;
    private CorEmpresa cor;
    private Motor motor;
}
