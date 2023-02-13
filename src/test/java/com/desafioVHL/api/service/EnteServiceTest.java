package com.desafioVHL.api.service;

import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.converter.EnteConverter;
import com.desafioVHL.api.entities.Ente;
import com.desafioVHL.api.repository.EnteRepository;
import com.desafioVHL.api.services.EnteService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class EnteServiceTest {

    private EnteService service;

    private EnteConverter converter;

    @MockBean
    private EnteRepository repository;

    @BeforeEach
    public void setUp() {
        this.service = new EnteService(repository);
        this.converter = new EnteConverter();
    }

    @Test
    public void findByIdTest(){
        Integer id = 1;
        Ente ente = createNewEnte();
        ente.setId(id);

        Mockito.when(repository.findById(id)).thenReturn(Optional.of(ente));

        EnteDTO enteDTO = service.findById(id);
        Assertions.assertThat( enteDTO != null ).isTrue();
        Assertions.assertThat( enteDTO.getCodigo()).isEqualTo(ente.getCodigo());
        Assertions.assertThat( enteDTO.getLei()).isEqualTo(ente.getLei());
        Assertions.assertThat( enteDTO.getNomeDaEntidade()).isEqualTo(ente.getNomeDaEntidade());
    }

    @Test
    public void findAllByNomeDaEntidadeTest(){
        Integer id = 1;
        Ente ente = createNewEnte();
        ente.setId(id);
        PageRequest pageRequest = PageRequest.of(0, 10);

        List<Ente> entes = new LinkedList<>();
        entes.add(ente);
        Page<Ente> page = new PageImpl<>(entes, pageRequest, 1);
        Mockito.when( repository.findAllByNomeDaEntidade(ente.getNomeDaEntidade(), pageRequest))
                .thenReturn(page);

        List<EnteDTO> result = service.findAllByNomeDaEntidade(ente.getNomeDaEntidade(),pageRequest);

        Assertions.assertThat(result.size()).isEqualTo(1);
        Assertions.assertThat(result.get(0)).isEqualTo(converter.convertEnteToEnteDTO(entes.get(0)));
    }

    @Test
    public void findByIdTestFailBecauseOfNonExistentId(){
        assertThrows(ResponseStatusException.class,() -> service.findById(8000));
    }

    @Test
    public void findByIdTestFailBecauseOfNonExistentNomeDaEntidade(){
        assertThrows(ResponseStatusException.class,() -> service.findAllByNomeDaEntidade("whatevername", PageRequest.of(0, 10)));
    }

    private static Ente createNewEnte() {
        Ente ente = new Ente();
        ente.setCodigo(1565L);
        ente.setLei("5.133");
        ente.setNomeDaEntidade("ASSOCIAÇÃO ATLÉTICA BEIRA RIO");
        return ente;
    }
}
