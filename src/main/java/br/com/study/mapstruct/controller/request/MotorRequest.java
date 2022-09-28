package br.com.study.mapstruct.controller.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MotorRequest {

    /*DOUBLE PARA FLOAT*/
    private int litragem;

    /*INT PARA INTEGER*/
    private Integer qtCilindros;
    private FabricanteRequest fabricante;

    /*CONVERSÃO COMPLEXA*/
    private int tamanhoEmPolegadas;
}