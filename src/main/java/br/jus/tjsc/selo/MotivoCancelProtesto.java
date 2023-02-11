
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motivoCancelProtesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motivoCancelProtesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdmotivocancelprotesto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nmmotivocancelprotesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivoCancelProtesto", propOrder = {
    "cdmotivocancelprotesto",
    "nmmotivocancelprotesto"
})
public class MotivoCancelProtesto {

    protected Long cdmotivocancelprotesto;
    protected String nmmotivocancelprotesto;

    /**
     * Gets the value of the cdmotivocancelprotesto property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdmotivocancelprotesto() {
        return cdmotivocancelprotesto;
    }

    /**
     * Sets the value of the cdmotivocancelprotesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdmotivocancelprotesto(Long value) {
        this.cdmotivocancelprotesto = value;
    }

    /**
     * Gets the value of the nmmotivocancelprotesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmotivocancelprotesto() {
        return nmmotivocancelprotesto;
    }

    /**
     * Sets the value of the nmmotivocancelprotesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmotivocancelprotesto(String value) {
        this.nmmotivocancelprotesto = value;
    }

}
