
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSelosCompactadosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelosCompactadosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selosCompactados" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosCompactadosResponse", propOrder = {
    "selosCompactados"
})
public class GetSelosCompactadosResponse {

    protected byte[] selosCompactados;

    /**
     * Gets the value of the selosCompactados property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosCompactados() {
        return selosCompactados;
    }

    /**
     * Sets the value of the selosCompactados property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosCompactados(byte[] value) {
        this.selosCompactados = value;
    }

}
