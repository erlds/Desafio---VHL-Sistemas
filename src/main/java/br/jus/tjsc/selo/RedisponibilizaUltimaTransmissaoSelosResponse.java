
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for redisponibilizaUltimaTransmissaoSelosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="redisponibilizaUltimaTransmissaoSelosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroSelosLiberados" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redisponibilizaUltimaTransmissaoSelosResponse", propOrder = {
    "numeroSelosLiberados"
})
public class RedisponibilizaUltimaTransmissaoSelosResponse {

    protected int numeroSelosLiberados;

    /**
     * Gets the value of the numeroSelosLiberados property.
     * 
     */
    public int getNumeroSelosLiberados() {
        return numeroSelosLiberados;
    }

    /**
     * Sets the value of the numeroSelosLiberados property.
     * 
     */
    public void setNumeroSelosLiberados(int value) {
        this.numeroSelosLiberados = value;
    }

}
