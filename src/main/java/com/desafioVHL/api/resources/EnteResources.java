package com.desafioVHL.api.resources;

import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.services.EnteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/entes")
public class EnteResources {

    @Autowired
    private EnteService service;

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<List<EnteDTO>> getClienteById() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }
}
