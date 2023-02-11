
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCobranca20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCobranca20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtipocobranca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dispositivolegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtipocobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCobranca20", propOrder = {
    "cdtipocobranca",
    "dispositivolegal",
    "nmtipocobranca"
})
public class TipoCobranca20 {

    protected Long cdtipocobranca;
    protected String dispositivolegal;
    protected String nmtipocobranca;

    /**
     * Gets the value of the cdtipocobranca property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipocobranca() {
        return cdtipocobranca;
    }

    /**
     * Sets the value of the cdtipocobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipocobranca(Long value) {
        this.cdtipocobranca = value;
    }

    /**
     * Gets the value of the dispositivolegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositivolegal() {
        return dispositivolegal;
    }

    /**
     * Sets the value of the dispositivolegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositivolegal(String value) {
        this.dispositivolegal = value;
    }

    /**
     * Gets the value of the nmtipocobranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipocobranca() {
        return nmtipocobranca;
    }

    /**
     * Sets the value of the nmtipocobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipocobranca(String value) {
        this.nmtipocobranca = value;
    }

}
