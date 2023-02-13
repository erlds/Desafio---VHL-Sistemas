package com.desafioVHL.api.services;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import lombok.extern.slf4j.Slf4j;

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

@Slf4j
@org.springframework.stereotype.Service
public class EnteService {

    private static final String ID_NOT_FOUND = "Ente não encontrado";
    private static final String NOMEDAENTIDADE_NOT_FOUND = "Nenhum ente encontrado com esse nome de entidade";

    @Autowired
    private EnteConverter enteConverter;

    private EnteRepository enteRepository;

    public EnteService(EnteRepository enteRepository){
        this.enteRepository = enteRepository;
        this.enteConverter = new EnteConverter();
    }

    @PostConstruct
    private void fillDataEntesDeclaradosUtilidadePublicaEstadualToDataBase() {
        List<EnteDeclaradoUtilidadePublicaEstadual> entesDeclarados = EntesDeclarados.getEntesDeclaradosUtilidadePublicaEstadual();
        List<Ente> entes = enteConverter.convertFromListEnteDeclaradoToListEnte(entesDeclarados);
        enteRepository.saveAll(entes);
    }

    public EnteDTO findById(Integer id) {
        Ente ente = enteRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, ID_NOT_FOUND));
        log.info("Ente com id {} recuperado com sucesso !", ente.getId());
        return enteConverter.convertEnteToEnteDTO(ente);
    }

    public List<EnteDTO> findAllByNomeDaEntidade(String nomeDaEntidade, Pageable pageable){
        Page<Ente> pageEntes =  enteRepository.findAllByNomeDaEntidade(nomeDaEntidade,pageable);
        if (pageEntes == null || pageEntes.isEmpty()) {
            log.error(NOMEDAENTIDADE_NOT_FOUND);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, NOMEDAENTIDADE_NOT_FOUND);
        }
        log.info("{} entes foram recuperados com sucesso !" , pageEntes.getTotalElements());
        return enteConverter.convertPageEnteToListEntesDTO(pageEntes);
    }
}