package com.desafioVHL.api.services;

import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.converter.EnteConverter;
import com.desafioVHL.api.entities.Ente;
import com.desafioVHL.api.repository.EnteRepository;
import com.desafioVHL.api.utils.EntesDeclarados;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class EnteService {

    @Autowired
    private EnteConverter enteConverter;

    @Autowired
    private EnteRepository enteRepository;

    @PostConstruct
    public void fillDataEntesDeclaradosUtilidadePublicaEstadualToDataBase() {
        enteRepository.saveAll(enteConverter.converter(EntesDeclarados.getEntesDeclaradosUtilidadePublicaEstadual()));
    }

    public List<EnteDTO> findAll(Integer id, String nomeDaEntidade, Pageable pageable) {
        Page<Ente> entesPage = getDataFromEnteRepository(id,nomeDaEntidade,pageable);
        List<EnteDTO> entesDTO = enteConverter.convertPageEnteToListEntesDTO(entesPage);
        return entesDTO;
    }

    private Page<Ente> getDataFromEnteRepository(Integer id, String nomeDaEntidade, Pageable pageable){
        if (id != null) {
            return enteRepository.findAllById(id,pageable);
        }
        if (nomeDaEntidade != null){
            return enteRepository.findAllByNomeDaEntidade(nomeDaEntidade,pageable);
        }
        return enteRepository.findAll(pageable);
    }


}