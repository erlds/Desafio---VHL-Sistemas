
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for especieTitulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="especieTitulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdespecietitulo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nmespecietitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sgespecietitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "especieTitulo", propOrder = {
    "cdespecietitulo",
    "nmespecietitulo",
    "sgespecietitulo"
})
public class EspecieTitulo {

    protected Short cdespecietitulo;
    protected String nmespecietitulo;
    protected String sgespecietitulo;

    /**
     * Gets the value of the cdespecietitulo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdespecietitulo() {
        return cdespecietitulo;
    }

    /**
     * Sets the value of the cdespecietitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdespecietitulo(Short value) {
        this.cdespecietitulo = value;
    }

    /**
     * Gets the value of the nmespecietitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmespecietitulo() {
        return nmespecietitulo;
    }

    /**
     * Sets the value of the nmespecietitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmespecietitulo(String value) {
        this.nmespecietitulo = value;
    }

    /**
     * Gets the value of the sgespecietitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgespecietitulo() {
        return sgespecietitulo;
    }

    /**
     * Sets the value of the sgespecietitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgespecietitulo(String value) {
        this.sgespecietitulo = value;
    }

}
