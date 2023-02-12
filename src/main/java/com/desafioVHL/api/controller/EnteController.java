package com.desafioVHL.api.controller;

import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.services.EnteService;
import io.swagger.annotations.Api;
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

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<List<EnteDTO>> getClienteById(Integer id, String nomeDaEntidade ,Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll(id,nomeDaEntidade,pageable));
    }
}
