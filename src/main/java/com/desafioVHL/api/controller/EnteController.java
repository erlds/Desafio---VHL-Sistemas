package com.desafioVHL.api.controller;

import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.services.EnteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/entes")
public class EnteController {

    @Autowired
    private EnteService service;

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<EnteDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<EnteDTO>> findAllByNomeDaEntidade(String nomeDaEntidade, Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAllByNomeDaEntidade(nomeDaEntidade,pageable));
    }
}
