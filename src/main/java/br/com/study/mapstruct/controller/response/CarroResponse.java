package br.com.study.mapstruct.controller.response;

import br.com.study.mapstruct.domain.Pessoa;
import br.com.study.mapstruct.enums.CorEmpresa;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CarroResponse {

    /*CAMPOS IDENTICOS AO OBJETO CARRO*/
    private String numeroPlaca;
    private String numeroChassi;
    private Pessoa motorista;
    private int tamanhoRoda;
    private CorEmpresa cor;

}