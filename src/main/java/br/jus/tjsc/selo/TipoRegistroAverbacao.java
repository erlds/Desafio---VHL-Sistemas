
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoRegistroAverbacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRegistroAverbacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtiporegaverbacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtiporegaverbacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRegistroAverbacao", propOrder = {
    "cdtiporegaverbacao",
    "nmtiporegaverbacao"
})
public class TipoRegistroAverbacao {

    protected String cdtiporegaverbacao;
    protected String nmtiporegaverbacao;

    /**
     * Gets the value of the cdtiporegaverbacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtiporegaverbacao() {
        return cdtiporegaverbacao;
    }

    /**
     * Sets the value of the cdtiporegaverbacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtiporegaverbacao(String value) {
        this.cdtiporegaverbacao = value;
    }

    /**
     * Gets the value of the nmtiporegaverbacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiporegaverbacao() {
        return nmtiporegaverbacao;
    }

    /**
     * Sets the value of the nmtiporegaverbacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiporegaverbacao(String value) {
        this.nmtiporegaverbacao = value;
    }

}
