
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for banco complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="banco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdbanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmbanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "banco", propOrder = {
    "cdbanco",
    "nmbanco"
})
public class Banco {

    protected String cdbanco;
    protected String nmbanco;

    /**
     * Gets the value of the cdbanco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdbanco() {
        return cdbanco;
    }

    /**
     * Sets the value of the cdbanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdbanco(String value) {
        this.cdbanco = value;
    }

    /**
     * Gets the value of the nmbanco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmbanco() {
        return nmbanco;
    }

    /**
     * Sets the value of the nmbanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmbanco(String value) {
        this.nmbanco = value;
    }

}
