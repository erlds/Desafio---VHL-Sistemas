
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for estado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="estado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estado", propOrder = {
    "cdestado",
    "deestado"
})
public class Estado {

    protected String cdestado;
    protected String deestado;

    /**
     * Gets the value of the cdestado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdestado() {
        return cdestado;
    }

    /**
     * Sets the value of the cdestado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdestado(String value) {
        this.cdestado = value;
    }

    /**
     * Gets the value of the deestado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeestado() {
        return deestado;
    }

    /**
     * Sets the value of the deestado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeestado(String value) {
        this.deestado = value;
    }

}
