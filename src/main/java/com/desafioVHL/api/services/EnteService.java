package com.desafioVHL.api.services;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.converter.EnteConverter;
import com.desafioVHL.api.entities.Ente;
import com.desafioVHL.api.repository.EnteRepository;
import com.desafioVHL.api.utils.EntesDeclarados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.PostConstruct;
import java.util.List;

@org.springframework.stereotype.Service
public class EnteService {

    @Autowired
    private EnteConverter enteConverter;

    private EnteRepository enteRepository;

    public EnteService(EnteRepository enteRepository){
        this.enteRepository = enteRepository;
        this.enteConverter = new EnteConverter();
    }

    @PostConstruct
    public void fillDataEntesDeclaradosUtilidadePublicaEstadualToDataBase() {
        List<EnteDeclaradoUtilidadePublicaEstadual> entesDeclarados = EntesDeclarados.getEntesDeclaradosUtilidadePublicaEstadual();
        List<Ente> entes = enteConverter.convertFromListEnteDeclaradoToListEnte(entesDeclarados);
        enteRepository.saveAll(entes);
    }

    public EnteDTO findById(Integer id) {
        Ente ente = enteRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
        return enteConverter.convertEnteToEnteDTO(ente);
    }

    public List<EnteDTO> findAllByNomeDaEntidade(String nomeDaEntidade, Pageable pageable){
        Page<Ente> pageEntes =  enteRepository.findAllByNomeDaEntidade(nomeDaEntidade,pageable);
        return enteConverter.convertPageEnteToListEntesDTO(pageEntes);
    }


}