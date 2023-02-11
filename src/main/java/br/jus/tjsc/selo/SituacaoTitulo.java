
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for situacaoTitulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="situacaoTitulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdsituacaotitulo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nmsituacaotitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "situacaoTitulo", propOrder = {
    "cdsituacaotitulo",
    "nmsituacaotitulo"
})
public class SituacaoTitulo {

    protected Short cdsituacaotitulo;
    protected String nmsituacaotitulo;

    /**
     * Gets the value of the cdsituacaotitulo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdsituacaotitulo() {
        return cdsituacaotitulo;
    }

    /**
     * Sets the value of the cdsituacaotitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdsituacaotitulo(Short value) {
        this.cdsituacaotitulo = value;
    }

    /**
     * Gets the value of the nmsituacaotitulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmsituacaotitulo() {
        return nmsituacaotitulo;
    }

    /**
     * Sets the value of the nmsituacaotitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmsituacaotitulo(String value) {
        this.nmsituacaotitulo = value;
    }

}
