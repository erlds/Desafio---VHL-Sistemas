package com.desafioVHL.api.utils;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import br.jus.tjsc.selo.SeloService;
import lombok.extern.slf4j.Slf4j;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class EntesDeclarados {
    private static final String WSDL_SELO_SERVICE = "http://selo.tjsc.jus.br/SeloService31Teste?wsdl";
    private static final String SITE_SELO = "http://www.tjsc.jus.br/selo";
    private static final String SELO_SERVICE_LOCALPART = "SeloService";

    public static List<EnteDeclaradoUtilidadePublicaEstadual> getEntesDeclaradosUtilidadePublicaEstadual(){
        try {
            SeloService seloService = createSeloService();
            return seloService.getEntesDeclaradosUtilidadePublicaEstadual();
        } catch (Exception e) {
            log.error("Não foi possível obter a informação sobre entes declarados, verifique se o seu java possui o certificado, ou se o servico do TJSC está online");
            return new ArrayList<EnteDeclaradoUtilidadePublicaEstadual>();
        }
    }

    private static SeloService createSeloService() throws MalformedURLException {
        Service ws = Service.create(createUrlFromSeloServiceWSDL(), createQnameFromSiteSelo());
        return ws.getPort(SeloService.class);
    }

    private static URL createUrlFromSeloServiceWSDL() throws MalformedURLException{
        return new URL(WSDL_SELO_SERVICE);
    }

    private static QName createQnameFromSiteSelo(){
        return new QName(SITE_SELO,SELO_SERVICE_LOCALPART);
    }
}
