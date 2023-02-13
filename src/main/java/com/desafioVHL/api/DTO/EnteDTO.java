package com.desafioVHL.api.DTO;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnteDTO {

    @NotBlank
    private Long codigo;
    @NotBlank
    private String lei;
    @NotBlank
    private String nomeDaEntidade;
}