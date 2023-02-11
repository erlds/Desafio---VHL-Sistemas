
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTestamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTestamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtipotestamento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nmtipotestamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTestamento", propOrder = {
    "cdtipotestamento",
    "nmtipotestamento"
})
public class TipoTestamento {

    protected Long cdtipotestamento;
    protected String nmtipotestamento;

    /**
     * Gets the value of the cdtipotestamento property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipotestamento() {
        return cdtipotestamento;
    }

    /**
     * Sets the value of the cdtipotestamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipotestamento(Long value) {
        this.cdtipotestamento = value;
    }

    /**
     * Gets the value of the nmtipotestamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipotestamento() {
        return nmtipotestamento;
    }

    /**
     * Sets the value of the nmtipotestamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipotestamento(String value) {
        this.nmtipotestamento = value;
    }

}
