package com.desafioVHL.api.services;

import javax.annotation.PostConstruct;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import br.jus.tjsc.selo.Exception_Exception;
import br.jus.tjsc.selo.SeloService;
import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.converter.EnteConverter;
import com.desafioVHL.api.entities.Ente;
import com.desafioVHL.api.repository.EnteRepository;
import com.desafioVHL.api.utils.EntesDeclarados;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@org.springframework.stereotype.Service
public class EnteService {

  @Autowired
  private EnteConverter enteConverter;

  @Autowired
  private EnteRepository enteRepository;

  @PostConstruct
  public void fillDataEntesDeclaradosUtilidadePublicaEstadualToDataBase(){
    enteRepository.saveAll(enteConverter.converter(EntesDeclarados.getEntesDeclaradosUtilidadePublicaEstadual()));
  }

  public List<EnteDTO> findAll(){
    List<Ente> entes = enteRepository.findAll();
    List<EnteDTO> enteDTOS = new LinkedList<>();
    entes.forEach(ente -> {
      EnteDTO enteDTO = new EnteDTO();
      BeanUtils.copyProperties(ente,enteDTO);
      enteDTOS.add(enteDTO);
    });
    return enteDTOS;
  }
}