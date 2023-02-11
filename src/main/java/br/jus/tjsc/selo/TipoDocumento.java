
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtpdocumento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="detpdocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detpdocumentoabrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumento", propOrder = {
    "cdtpdocumento",
    "detpdocumento",
    "detpdocumentoabrev"
})
public class TipoDocumento {

    protected Short cdtpdocumento;
    protected String detpdocumento;
    protected String detpdocumentoabrev;

    /**
     * Gets the value of the cdtpdocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtpdocumento() {
        return cdtpdocumento;
    }

    /**
     * Sets the value of the cdtpdocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtpdocumento(Short value) {
        this.cdtpdocumento = value;
    }

    /**
     * Gets the value of the detpdocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpdocumento() {
        return detpdocumento;
    }

    /**
     * Sets the value of the detpdocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpdocumento(String value) {
        this.detpdocumento = value;
    }

    /**
     * Gets the value of the detpdocumentoabrev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpdocumentoabrev() {
        return detpdocumentoabrev;
    }

    /**
     * Sets the value of the detpdocumentoabrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpdocumentoabrev(String value) {
        this.detpdocumentoabrev = value;
    }

}
