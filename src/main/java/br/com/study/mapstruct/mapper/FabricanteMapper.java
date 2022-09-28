package br.com.study.mapstruct.mapper;

import br.com.study.mapstruct.controller.request.FabricanteRequest;
import br.com.study.mapstruct.domain.Fabricante;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;

@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface FabricanteMapper {

    FabricanteRequest fabricanteParaFabricanteRequestDto(Fabricante fabricante);

}
