package com.desafioVHL.api.repository;

import com.desafioVHL.api.entities.Ente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@DataJpaTest
public class EnteRepositoryTest {

    @Autowired
    TestEntityManager entityManager;

    @Autowired
    EnteRepository repository;

    private Ente ente;

    @BeforeEach
    public void createAndPersistEnte(){
        ente = createNewEnte();
        entityManager.persist(ente);
    }

    @Test
    public void findByIdTest() {
        Optional<Ente> foundBook = repository.findById(ente.getId());
        assertThat(foundBook.isPresent()).isTrue();
    }

    @Test
    public void findAllByNomeDaEntidadeTest(){
        Page<Ente> foundBook = repository.findAllByNomeDaEntidade(ente.getNomeDaEntidade(), PageRequest.of(0, 10));
        assertThat(foundBook.getContent()).hasSize(1);
    }

    public static Ente createNewEnte() {
        Ente ente = new Ente();
        ente.setCodigo(1565L);
        ente.setLei("5.133");
        ente.setNomeDaEntidade("ASSOCIAÇÃO ATLÉTICA BEIRA RIO");
        return ente;
    }

    @Test
    public void findByIdTestFail() {
        int wrongId = 2;
        Optional<Ente> foundBook = repository.findById(wrongId);
        assertTrue(foundBook.isEmpty());
    }

    @Test
    public void findAllByNomeDaEntidadeTestFail(){
        Page<Ente> foundBook = repository.findAllByNomeDaEntidade("otherNomeDaEntidade", PageRequest.of(0, 10));
        assertThat(foundBook.getContent()).hasSize(0);
    }


}