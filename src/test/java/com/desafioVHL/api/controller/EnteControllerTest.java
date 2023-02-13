package com.desafioVHL.api.controller;

import com.desafioVHL.api.DTO.EnteDTO;
import com.desafioVHL.api.converter.EnteConverter;
import com.desafioVHL.api.entities.Ente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.desafioVHL.api.services.EnteService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@WebMvcTest(controllers = EnteController.class)
@AutoConfigureMockMvc
public class EnteControllerTest {

    private static final String URI_ID = "/entes";
    private static final int ID = 13;

    @Autowired
    private MockMvc mvc;

    @MockBean
    private EnteService enteService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void findByIdTeste() throws Exception{
        EnteDTO expectedEnteDTO = createNewEnteDTO();
        BDDMockito.given(enteService.findById(ID)).willReturn(expectedEnteDTO);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get(URI_ID + "/" + ID)
                .with(httpBasic("cartorio", "selodigital"));

        MvcResult result = mvc.perform(request).andExpect(status().isOk()).andReturn();
        EnteDTO actualEnteDTO = objectMapper.readValue(result.getResponse().getContentAsString(), EnteDTO.class);
        actualEnteDTO.setNomeDaEntidade(formatNomeDaEntidade(actualEnteDTO.getNomeDaEntidade()));
        Assertions.assertEquals(expectedEnteDTO, actualEnteDTO);
    }

    @Test
    public void findAllByNomeDaEntidade() throws Exception{

        EnteDTO expectedEnteDTO = createNewEnteDTO();
        List<EnteDTO> expectedDTOList = new LinkedList<>();
        PageRequest pageRequest = PageRequest.of(0, 1);
        expectedDTOList.add(expectedEnteDTO);

        BDDMockito.given(enteService.findAllByNomeDaEntidade("GRUPO CONDOR", pageRequest) ).willReturn(expectedDTOList);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get(URI_ID)
                .param("page","0")
                .param("size", "1")
                .param("nomeDaEntidade", "GRUPO CONDOR")
                .with(httpBasic("cartorio", "selodigital"));

        MvcResult result = mvc.perform( request ).andExpect( status().isOk() ).andReturn();
        List<EnteDTO> actualListEnteDTO = objectMapper.readValue(result.getResponse().getContentAsString(),new TypeReference<List<EnteDTO>>(){});
        Assertions.assertEquals(expectedDTOList, actualListEnteDTO);
    }

    private String formatNomeDaEntidade(String str){
        try {
            return new String(str.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    private EnteDTO createNewEnteDTO() {
        return new EnteDTO(5706L , "10.280", "GRUPO CONDOR");
    }
}
