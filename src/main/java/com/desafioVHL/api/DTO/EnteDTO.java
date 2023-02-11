package com.desafioVHL.api.DTO;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EnteDTO {

    @NotBlank
    private Long codigo;
    @NotBlank
    private String lei;
    @NotBlank
    private String nomeDaEntidade;
}