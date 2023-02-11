
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pais complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdpais" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="denacionalidadefeminina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denacionalidademasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pais", propOrder = {
    "cdpais",
    "denacionalidadefeminina",
    "denacionalidademasc",
    "depais"
})
public class Pais {

    protected Short cdpais;
    protected String denacionalidadefeminina;
    protected String denacionalidademasc;
    protected String depais;

    /**
     * Gets the value of the cdpais property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdpais() {
        return cdpais;
    }

    /**
     * Sets the value of the cdpais property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdpais(Short value) {
        this.cdpais = value;
    }

    /**
     * Gets the value of the denacionalidadefeminina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenacionalidadefeminina() {
        return denacionalidadefeminina;
    }

    /**
     * Sets the value of the denacionalidadefeminina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenacionalidadefeminina(String value) {
        this.denacionalidadefeminina = value;
    }

    /**
     * Gets the value of the denacionalidademasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenacionalidademasc() {
        return denacionalidademasc;
    }

    /**
     * Sets the value of the denacionalidademasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenacionalidademasc(String value) {
        this.denacionalidademasc = value;
    }

    /**
     * Gets the value of the depais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepais() {
        return depais;
    }

    /**
     * Sets the value of the depais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepais(String value) {
        this.depais = value;
    }

}
