package br.com.study.mapstruct.controller;

import br.com.study.mapstruct.controller.request.CarroRequest;
import br.com.study.mapstruct.controller.response.CarroResponse;
import br.com.study.mapstruct.controller.response.EnderecoResponse;
import br.com.study.mapstruct.domain.Carro;
import br.com.study.mapstruct.domain.Endereco;
import br.com.study.mapstruct.domain.Pessoa;
import br.com.study.mapstruct.mapper.CarroApplyMapper;
import br.com.study.mapstruct.mapper.CarroMapper;
import br.com.study.mapstruct.mapper.EnderecoMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Optional.ofNullable;

@RestController
public class TestController {

    @Autowired
    private CarroApplyMapper carroApplyMapper;

    private final CarroMapper carroMapper = Mappers.getMapper(CarroMapper.class);
    private final EnderecoMapper enderecoMapper = Mappers.getMapper(EnderecoMapper.class);

    @PostMapping("/post-test-1")
    public CarroResponse postTest1(@RequestBody Carro request){
        /*CHAMADA SIMPLIFICADA DO MAPPER*/
        return ofNullable(request).map(carroApplyMapper).orElseThrow();
    }

    @PostMapping("/post-test-2")
    public CarroRequest postTest2(@RequestBody Carro carro){
        return carroMapper.carroParaCarroRequestDto(carro);
    }

    @GetMapping("/get-test-1")
    public EnderecoResponse postTest3(){

        Endereco endereco = Endereco.builder()
                .rua("Dos bobos")
                .cidade("Brasilia")
                .numero("66")
                .cep("71556987")
                .build();

        Pessoa pessoa = Pessoa.builder()
                .nomeCompleto("André Sousa Silva")
                .build();

        return enderecoMapper.enderecoParaEnderecoResponseDto(endereco, pessoa);
    }


}