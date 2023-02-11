
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoAto20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoAto20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtipoato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="flativo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="modeloscompativeis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtipoato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoAto20", propOrder = {
    "cdtipoato",
    "flativo",
    "modeloscompativeis",
    "nmtipoato"
})
public class TipoAto20 {

    protected Long cdtipoato;
    protected short flativo;
    protected String modeloscompativeis;
    protected String nmtipoato;

    /**
     * Gets the value of the cdtipoato property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipoato() {
        return cdtipoato;
    }

    /**
     * Sets the value of the cdtipoato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipoato(Long value) {
        this.cdtipoato = value;
    }

    /**
     * Gets the value of the flativo property.
     * 
     */
    public short getFlativo() {
        return flativo;
    }

    /**
     * Sets the value of the flativo property.
     * 
     */
    public void setFlativo(short value) {
        this.flativo = value;
    }

    /**
     * Gets the value of the modeloscompativeis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloscompativeis() {
        return modeloscompativeis;
    }

    /**
     * Sets the value of the modeloscompativeis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloscompativeis(String value) {
        this.modeloscompativeis = value;
    }

    /**
     * Gets the value of the nmtipoato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoato() {
        return nmtipoato;
    }

    /**
     * Sets the value of the nmtipoato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoato(String value) {
        this.nmtipoato = value;
    }

}
