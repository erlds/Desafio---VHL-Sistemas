package com.desafioVHL.api.converter;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.entities.Ente;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EnteConverter {

    public List<Ente> convertFromListEnteDeclaradoToListEnte(List<EnteDeclaradoUtilidadePublicaEstadual> entes) {
        return entes.stream().map(enteDeclarado ->
                convertFromEnteDeclaradoToEnte(enteDeclarado)).collect(Collectors.toList());
    }

    public Ente convertFromEnteDeclaradoToEnte(EnteDeclaradoUtilidadePublicaEstadual enteDeclarado){
        Ente ente = new Ente();
        ente.setCodigo(enteDeclarado.getCdentepub());
        ente.setLei(enteDeclarado.getLei());
        ente.setNomeDaEntidade(enteDeclarado.getNomeEntidade());
        return ente;
    }

    public List<EnteDTO> convertPageEnteToListEntesDTO(Page<Ente> entesPage) {
        ModelMapper modelMapper = new ModelMapper();
        return entesPage.getContent().stream().map(
                ente -> modelMapper.map(ente,EnteDTO.class)).collect(Collectors.toList());
    }

    public EnteDTO convertEnteToEnteDTO(Ente ente){
        EnteDTO enteDTO = new EnteDTO();
        BeanUtils.copyProperties(ente,enteDTO);
        return enteDTO;
    }
}
