package com.desafioVHL.api.services;

import javax.net.ssl.SSLHandshakeException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.jus.tjsc.selo.EnteDeclaradoUtilidadePublicaEstadual;
import br.jus.tjsc.selo.Exception_Exception;
import br.jus.tjsc.selo.SeloService;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

class EnteService {
  private static final String WSDL_SELO_SERVICE = "http://selo.tjsc.jus.br/SeloService31Teste?wsdl";
  private static final String SITE_SELO = "http://www.tjsc.jus.br/selo";
  private static final String SELO_SERVICE_LOCALPART = "SeloService";

  private List<EnteDeclaradoUtilidadePublicaEstadual> getEntesDeclaradosUtilidadePublicaEstadual(){
    SeloService seloService = createSeloService();
    try {
      return seloService.getEntesDeclaradosUtilidadePublicaEstadual();
    } catch (Exception_Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  private SeloService createSeloService(){
    Service ws = Service.create(createUrlFromSeloServiceWSDL(), createQnameFromSiteSelo());
    return ws.getPort(SeloService.class);
  }

  private URL createUrlFromSeloServiceWSDL(){
    try {
      return new URL(WSDL_SELO_SERVICE);
    } catch (MalformedURLException e) {
      return null;
    }
  }

  private QName createQnameFromSiteSelo(){
    return new QName(SITE_SELO,SELO_SERVICE_LOCALPART);
  }
}