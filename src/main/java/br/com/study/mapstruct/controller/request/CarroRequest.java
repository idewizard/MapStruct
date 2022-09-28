package br.com.study.mapstruct.controller.request;

import br.com.study.mapstruct.domain.Pessoa;
import br.com.study.mapstruct.enums.CorEmpresa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarroRequest {

    /*CAMPOS COM OS MESMOS VALORES ESPERADOS MAS NOMES DIFERENTES*/
    private String plateNumber;
    private String chassiNumber;

    /*CAMPOS COM VALORES E NOMES IDENTICOS A ENTITY*/
    private Pessoa motorista;
    private int tamanhoRoda;
    private CorEmpresa cor;

    /*CAMPO QUE É DTO*/
    private MotorRequest motor;

    private String campoNovo;
}