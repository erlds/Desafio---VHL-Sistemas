package com.desafioVHL.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
// Sinaliza essa classe como uma entidade (tabela)
@Entity
public class Ente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Long codigo;

    private String lei;

    @Column(name = "nome_da_entidade")
    private String nomeDaEntidade;

}
