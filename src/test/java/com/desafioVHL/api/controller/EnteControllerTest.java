package com.desafioVHL.api.controller;

import com.desafioVHL.api.DTO.EnteDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.desafioVHL.api.services.EnteService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@WebMvcTest(controllers = EnteController.class)
@AutoConfigureMockMvc
public class EnteControllerTest {

    private static final String URI_ID = "/entes";
    private static final int ID = 13;
    private static final String CORRECT_USERNAME = "cartorio";
    private static final String CORRECT_PASSWORD = "selodigital";

    @Autowired
    private MockMvc mvc;

    @MockBean
    private EnteService enteService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void findByIdTest() throws Exception{
        EnteDTO expectedEnteDTO = createNewEnteDTO();
        BDDMockito.given(enteService.findById(ID)).willReturn(expectedEnteDTO);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get(URI_ID + "/" + ID)
                .with(httpBasic(CORRECT_USERNAME, CORRECT_PASSWORD));

        MvcResult result = mvc.perform(request).andExpect(status().isOk()).andReturn();
        EnteDTO actualEnteDTO = objectMapper.readValue(result.getResponse().getContentAsString(), EnteDTO.class);
        Assertions.assertEquals(expectedEnteDTO, actualEnteDTO);
    }

    @Test
    public void findAllByNomeDaEntidadeTest() throws Exception{

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
                .with(httpBasic(CORRECT_USERNAME, CORRECT_PASSWORD));

        MvcResult result = mvc.perform( request ).andExpect( status().isOk() ).andReturn();
        List<EnteDTO> actualListEnteDTO = objectMapper.readValue(result.getResponse().getContentAsString(),new TypeReference<List<EnteDTO>>(){});
        Assertions.assertEquals(expectedDTOList, actualListEnteDTO);
    }

    @Test
    public void makeRequestWithWrongCredentialsTest () throws Exception{
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get(URI_ID + "/" + ID)
                .with(httpBasic("wrongusername", "wrongpassword"));
        mvc.perform(request).andExpect(status().isUnauthorized());
    }

    @Test
    public void findByIdTesteIfIdNotExistTest() throws Exception{
        int wrongid = 8000;
        EnteDTO expectedEnteDTO = createNewEnteDTO();
        BDDMockito.given(enteService.findById(wrongid)).willReturn(expectedEnteDTO);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get(URI_ID + "/" + ID)
                .with(httpBasic(CORRECT_USERNAME, CORRECT_PASSWORD));

        MvcResult result = mvc.perform(request).andExpect(status().isOk()).andReturn();
        assertEquals(result.getResponse().getContentAsString(), "");
    }

    @Test
    public void findAllByNomeDaEntidadeIfNomeDaEntidadeNotExistTest() throws Exception{
        EnteDTO expectedEnteDTO = createNewEnteDTO();
        List<EnteDTO> expectedDTOList = new LinkedList<>();
        PageRequest pageRequest = PageRequest.of(0, 1);
        expectedDTOList.add(expectedEnteDTO);

        BDDMockito.given(enteService.findAllByNomeDaEntidade("wrongNomeDaEntidade", pageRequest) ).willReturn(expectedDTOList);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
                .get(URI_ID)
                .param("page","0")
                .param("size", "1")
                .param("nomeDaEntidade", "GRUPO CONDOR")
                .with(httpBasic(CORRECT_USERNAME, CORRECT_PASSWORD));

        MvcResult result = mvc.perform(request).andExpect(status().isOk()).andReturn();
        assertEquals(result.getResponse().getContentAsString(), "[]");
    }

    private EnteDTO createNewEnteDTO() {
        return new EnteDTO(5706L , "10.280", "GRUPO CONDOR");
    }
}
