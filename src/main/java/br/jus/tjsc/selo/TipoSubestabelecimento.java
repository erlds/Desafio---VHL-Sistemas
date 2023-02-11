
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoSubestabelecimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoSubestabelecimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtiposubestabelecimento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nmtiposubestabelecimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSubestabelecimento", propOrder = {
    "cdtiposubestabelecimento",
    "nmtiposubestabelecimento"
})
public class TipoSubestabelecimento {

    protected Long cdtiposubestabelecimento;
    protected String nmtiposubestabelecimento;

    /**
     * Gets the value of the cdtiposubestabelecimento property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtiposubestabelecimento() {
        return cdtiposubestabelecimento;
    }

    /**
     * Sets the value of the cdtiposubestabelecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtiposubestabelecimento(Long value) {
        this.cdtiposubestabelecimento = value;
    }

    /**
     * Gets the value of the nmtiposubestabelecimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiposubestabelecimento() {
        return nmtiposubestabelecimento;
    }

    /**
     * Sets the value of the nmtiposubestabelecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiposubestabelecimento(String value) {
        this.nmtiposubestabelecimento = value;
    }

}
