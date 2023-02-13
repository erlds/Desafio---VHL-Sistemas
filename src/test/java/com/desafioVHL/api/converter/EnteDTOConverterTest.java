package com.desafioVHL.api.converter;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.entities.Ente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnteDTOConverterTest {

    private EnteDeclaradoUtilidadePublicaEstadual enteDeclarado;

    private final EnteConverter enteConverter = new EnteConverter();

    @BeforeEach
    public void createEnteDeclarado() {
        enteDeclarado = new EnteDeclaradoUtilidadePublicaEstadual();
        enteDeclarado.setCdcomarca(0);
        enteDeclarado.setCdentepub(12L);
        enteDeclarado.setDtLei("DtLei");
        enteDeclarado.setDtLeiExtenso("DtLeiExtenso");
        enteDeclarado.setLei("Lei");
        enteDeclarado.setNomeComarca("NomeComarca");
        enteDeclarado.setNomeComarcaEntidade("NomeComarcaEntidade");
        enteDeclarado.setNomeEntidade("NomeEntidade");
    }

    @Test
    public void convertFromEnteDeclaradoUtilidadePublicaEstadualToEnteDTOTest(){
        Ente ente = enteConverter.convertFromEnteDeclaradoToEnte(enteDeclarado);
        assertEquals(ente.getCodigo(),enteDeclarado.getCdentepub());
        assertEquals(ente.getLei(),enteDeclarado.getLei());
        assertEquals(ente.getNomeDaEntidade(),enteDeclarado.getNomeEntidade());
    }

    @Test
    public void convertFromListEnteDeclaradoUtilidadePublicaEstadualToListEnteDTOTest(){
        List<Ente> entes = enteConverter.convertFromListEnteDeclaradoToListEnte(createListEnteDeclarado());
        entes.forEach(ente -> {
            assertEquals(ente.getCodigo(),enteDeclarado.getCdentepub());
            assertEquals(ente.getLei(),enteDeclarado.getLei());
            assertEquals(ente.getNomeDaEntidade(),enteDeclarado.getNomeEntidade());
        });
    }

    @Test
    public void convertEnteToEnteDTOTest(){
        Ente ente = createNewEnte();
        EnteDTO enteDTO = enteConverter.convertEnteToEnteDTO(ente);
        assertEquals(ente.getCodigo(),enteDTO.getCodigo());
        assertEquals(ente.getLei(),enteDTO.getLei());
        assertEquals(ente.getNomeDaEntidade(),enteDTO.getNomeDaEntidade());
    }

    private List<EnteDeclaradoUtilidadePublicaEstadual> createListEnteDeclarado() {
        List<EnteDeclaradoUtilidadePublicaEstadual> listEntesDeclarados = new ArrayList<>();
        listEntesDeclarados.add(enteDeclarado);
        listEntesDeclarados.add(enteDeclarado);
        listEntesDeclarados.add(enteDeclarado);
        return listEntesDeclarados;
    }

    private Ente createNewEnte(){
        return new Ente(7000,100L,"123","Nome Da Entidade teste");
    }
}
