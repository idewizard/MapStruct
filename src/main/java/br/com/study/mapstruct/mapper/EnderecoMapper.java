package br.com.study.mapstruct.mapper;

import br.com.study.mapstruct.controller.response.EnderecoResponse;
import br.com.study.mapstruct.domain.Endereco;
import br.com.study.mapstruct.domain.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EnderecoMapper {

    @Mappings({
            @Mapping(target = "nome", source = "pessoa.nomeCompleto"),
            @Mapping(target = "cep", source = "endereco.cep")
    })
    EnderecoResponse enderecoParaEnderecoResponseDto(Endereco endereco, Pessoa pessoa);
}
