package com.desafioVHL.api.converter;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import com.desafioVHL.api.DTO.EnteDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnteDTOConverterTest {

    private EnteDeclaradoUtilidadePublicaEstadual enteDeclarado;

    private EnteConverter enteConverter = new EnteConverter();

    @BeforeEach
    public void createEnteDeclarado() {
        enteDeclarado = new EnteDeclaradoUtilidadePublicaEstadual();
        enteDeclarado.setCdcomarca(0);
        enteDeclarado.setCdentepub(12l);
        enteDeclarado.setDtLei("DtLei");
        enteDeclarado.setDtLeiExtenso("DtLeiExtenso");
        enteDeclarado.setLei("Lei");
        enteDeclarado.setNomeComarca("NomeComarca");
        enteDeclarado.setNomeComarcaEntidade("NomeComarcaEntidade");
        enteDeclarado.setNomeEntidade("NomeEntidade");
    }

    @Test
    public void testConvertFromEnteDeclaradoUtilidadePublicaEstadualToEnteDTO(){
        EnteDTO enteDTO = enteConverter.converter(enteDeclarado);
        assertTrue(enteDTO.getCodigo().equals(enteDeclarado.getCdentepub()));
        assertTrue(enteDTO.getLei().equals(enteDeclarado.getLei()));
        assertTrue(enteDTO.getNomeDaEntidade().equals(enteDeclarado.getNomeEntidade()));
    }

    @Test
    public void testConvertFromListEnteDeclaradoUtilidadePublicaEstadualToListEnteDTO(){
        List<EnteDTO> enteDTOS = enteConverter.converter(createListEnteDeclarado());
        enteDTOS.forEach(enteDTO -> {
            assertTrue(enteDTO.getCodigo().equals(enteDeclarado.getCdentepub()));
            assertTrue(enteDTO.getLei().equals(enteDeclarado.getLei()));
            assertTrue(enteDTO.getNomeDaEntidade().equals(enteDeclarado.getNomeEntidade()));
        });
    }

    private List<EnteDeclaradoUtilidadePublicaEstadual> createListEnteDeclarado() {
        List<EnteDeclaradoUtilidadePublicaEstadual> listEntesDeclarados = new ArrayList<EnteDeclaradoUtilidadePublicaEstadual>();
        listEntesDeclarados.add(enteDeclarado);
        listEntesDeclarados.add(enteDeclarado);
        listEntesDeclarados.add(enteDeclarado);
        return listEntesDeclarados;
    }
}
