
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for etnia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etnia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdetnia" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="deetnia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etnia", propOrder = {
    "cdetnia",
    "deetnia"
})
public class Etnia {

    protected Short cdetnia;
    protected String deetnia;

    /**
     * Gets the value of the cdetnia property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdetnia() {
        return cdetnia;
    }

    /**
     * Sets the value of the cdetnia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdetnia(Short value) {
        this.cdetnia = value;
    }

    /**
     * Gets the value of the deetnia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeetnia() {
        return deetnia;
    }

    /**
     * Sets the value of the deetnia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeetnia(String value) {
        this.deetnia = value;
    }

}
