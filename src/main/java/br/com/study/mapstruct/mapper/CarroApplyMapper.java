package br.com.study.mapstruct.mapper;


import br.com.study.mapstruct.controller.request.CarroRequest;
import br.com.study.mapstruct.controller.response.CarroResponse;
import br.com.study.mapstruct.domain.Carro;
import org.mapstruct.Mapper;

import java.util.function.Function;


@Mapper(componentModel = "spring")
public interface CarroApplyMapper extends Function<Carro, CarroResponse> {

    CarroResponse apply(Carro carro);

}
