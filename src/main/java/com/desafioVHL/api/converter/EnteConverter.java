package com.desafioVHL.api.converter;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.entities.Ente;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EnteConverter {

    public List<Ente> converter(List<EnteDeclaradoUtilidadePublicaEstadual> entes) {
        return entes.stream().map(enteDeclarado -> converter(enteDeclarado)).collect(Collectors.toList());
    }

    public Ente converter(EnteDeclaradoUtilidadePublicaEstadual enteDeclarado){
        Ente ente = new Ente();
        ente.setCodigo(enteDeclarado.getCdentepub());
        ente.setLei(enteDeclarado.getLei());
        ente.setNomeDaEntidade(enteDeclarado.getNomeEntidade());
        return ente;
    }
}
