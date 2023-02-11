package com.desafioVHL.api.utils;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import com.desafioVHL.api.entities.Ente;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntesDeclaradosTest {

    @Test
    public void testConvertFromEnteDeclaradoUtilidadePublicaEstadualToEnteDTO(){
        List<EnteDeclaradoUtilidadePublicaEstadual> entesDeclarados = EntesDeclarados.getEntesDeclaradosUtilidadePublicaEstadual();
        assertNotNull(entesDeclarados);
        assertTrue(entesDeclarados.size() > 0);
        assertNotNull(entesDeclarados.get(0).getCdentepub());
        assertNotNull(entesDeclarados.get(0).getLei());
        assertNotNull(entesDeclarados.get(0).getNomeEntidade());
    }
}
