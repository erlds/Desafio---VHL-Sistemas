package com.desafioVHL.api.repository;

import com.desafioVHL.api.entities.Ente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnteRepository extends JpaRepository<Ente, Integer> {
    Page<Ente> findAllByNomeDaEntidade(String nomeDaEntidade, Pageable pageable);
}
