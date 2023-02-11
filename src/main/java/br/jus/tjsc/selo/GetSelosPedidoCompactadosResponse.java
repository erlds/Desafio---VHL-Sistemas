
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSelosPedidoCompactadosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelosPedidoCompactadosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selosPedidoCompactados" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosPedidoCompactadosResponse", propOrder = {
    "selosPedidoCompactados"
})
public class GetSelosPedidoCompactadosResponse {

    protected byte[] selosPedidoCompactados;

    /**
     * Gets the value of the selosPedidoCompactados property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosPedidoCompactados() {
        return selosPedidoCompactados;
    }

    /**
     * Sets the value of the selosPedidoCompactados property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosPedidoCompactados(byte[] value) {
        this.selosPedidoCompactados = value;
    }

}
