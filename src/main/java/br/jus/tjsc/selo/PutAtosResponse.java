
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for putAtosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="putAtosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reciboTSR" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putAtosResponse", propOrder = {
    "reciboTSR"
})
public class PutAtosResponse {

    protected byte[] reciboTSR;

    /**
     * Gets the value of the reciboTSR property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReciboTSR() {
        return reciboTSR;
    }

    /**
     * Sets the value of the reciboTSR property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReciboTSR(byte[] value) {
        this.reciboTSR = value;
    }

}
