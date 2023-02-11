
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for decodificaReciboResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="decodificaReciboResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reciboDecodificado" type="{http://www.tjsc.jus.br/selo}reciboProtocolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decodificaReciboResponse", propOrder = {
    "reciboDecodificado"
})
public class DecodificaReciboResponse {

    protected ReciboProtocolo reciboDecodificado;

    /**
     * Gets the value of the reciboDecodificado property.
     * 
     * @return
     *     possible object is
     *     {@link ReciboProtocolo }
     *     
     */
    public ReciboProtocolo getReciboDecodificado() {
        return reciboDecodificado;
    }

    /**
     * Sets the value of the reciboDecodificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReciboProtocolo }
     *     
     */
    public void setReciboDecodificado(ReciboProtocolo value) {
        this.reciboDecodificado = value;
    }

}
