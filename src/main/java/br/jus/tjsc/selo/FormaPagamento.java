
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formaPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formaPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdformapagamento" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="nmformapagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formaPagamento", propOrder = {
    "cdformapagamento",
    "nmformapagamento"
})
public class FormaPagamento {

    protected Short cdformapagamento;
    protected String nmformapagamento;

    /**
     * Gets the value of the cdformapagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdformapagamento() {
        return cdformapagamento;
    }

    /**
     * Sets the value of the cdformapagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdformapagamento(Short value) {
        this.cdformapagamento = value;
    }

    /**
     * Gets the value of the nmformapagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmformapagamento() {
        return nmformapagamento;
    }

    /**
     * Sets the value of the nmformapagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmformapagamento(String value) {
        this.nmformapagamento = value;
    }

}
