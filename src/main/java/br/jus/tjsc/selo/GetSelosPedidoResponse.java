
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSelosPedidoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelosPedidoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selosPedido" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosPedidoResponse", propOrder = {
    "selosPedido"
})
public class GetSelosPedidoResponse {

    protected byte[] selosPedido;

    /**
     * Gets the value of the selosPedido property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosPedido() {
        return selosPedido;
    }

    /**
     * Sets the value of the selosPedido property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosPedido(byte[] value) {
        this.selosPedido = value;
    }

}
