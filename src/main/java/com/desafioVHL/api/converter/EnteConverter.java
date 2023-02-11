package com.desafioVHL.api.converter;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import com.desafioVHL.api.DTO.EnteDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EnteConverter {

    public List<EnteDTO> converter(List<EnteDeclaradoUtilidadePublicaEstadual> entes) {
        return entes.stream().map(enteDeclarado -> converter(enteDeclarado)).collect(Collectors.toList());
    }

    public EnteDTO converter(EnteDeclaradoUtilidadePublicaEstadual enteDeclarado){
        EnteDTO enteDTO = new EnteDTO();
        enteDTO.setCodigo(enteDeclarado.getCdentepub());
        enteDTO.setLei(enteDeclarado.getLei());
        enteDTO.setNomeDaEntidade(enteDeclarado.getNomeEntidade());
        return enteDTO;
    }
}
