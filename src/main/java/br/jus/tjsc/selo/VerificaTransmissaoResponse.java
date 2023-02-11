
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verificaTransmissaoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verificaTransmissaoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reciboTSRarmazenado" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaTransmissaoResponse", propOrder = {
    "reciboTSRarmazenado"
})
public class VerificaTransmissaoResponse {

    protected byte[] reciboTSRarmazenado;

    /**
     * Gets the value of the reciboTSRarmazenado property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReciboTSRarmazenado() {
        return reciboTSRarmazenado;
    }

    /**
     * Sets the value of the reciboTSRarmazenado property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReciboTSRarmazenado(byte[] value) {
        this.reciboTSRarmazenado = value;
    }

}
