package br.com.study.mapstruct.mapper;


import br.com.study.mapstruct.controller.request.CarroRequest;
import br.com.study.mapstruct.controller.request.MotorRequest;
import br.com.study.mapstruct.controller.response.CarroResponse;
import br.com.study.mapstruct.domain.Carro;
import br.com.study.mapstruct.domain.Motor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

@Mapper
public interface CarroMapper {

    @Mapping(target = "plateNumber", source = "numeroPlaca")
    @Mapping(target = "chassiNumber", source = "numeroChassi")
    CarroRequest carroParaCarroRequestDto(Carro carro);

    @Mapping(source = "tamanhoEmCentimetros", target = "tamanhoEmPolegadas", qualifiedByName = "converteCentimetrosParaPolegadas")
    MotorRequest motorParaMotorRequestDto(Motor motor);

    @Named("converteCentimetrosParaPolegadas")
    default double converteCentimetrosParaPolegadas(int tamanhoEmCentimetros){
        return (tamanhoEmCentimetros * 0.393701);
    }
}
