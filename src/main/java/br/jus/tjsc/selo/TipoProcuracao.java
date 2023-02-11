
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoProcuracao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoProcuracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtipoprocuracao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nmtipoprocuracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoProcuracao", propOrder = {
    "cdtipoprocuracao",
    "nmtipoprocuracao"
})
public class TipoProcuracao {

    protected Long cdtipoprocuracao;
    protected String nmtipoprocuracao;

    /**
     * Gets the value of the cdtipoprocuracao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipoprocuracao() {
        return cdtipoprocuracao;
    }

    /**
     * Sets the value of the cdtipoprocuracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipoprocuracao(Long value) {
        this.cdtipoprocuracao = value;
    }

    /**
     * Gets the value of the nmtipoprocuracao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoprocuracao() {
        return nmtipoprocuracao;
    }

    /**
     * Sets the value of the nmtipoprocuracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoprocuracao(String value) {
        this.nmtipoprocuracao = value;
    }

}
