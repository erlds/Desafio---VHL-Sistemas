
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for profissao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profissao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdprofissao" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="deprofissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profissao", propOrder = {
    "cdprofissao",
    "deprofissao"
})
public class Profissao {

    protected Short cdprofissao;
    protected String deprofissao;

    /**
     * Gets the value of the cdprofissao property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdprofissao() {
        return cdprofissao;
    }

    /**
     * Sets the value of the cdprofissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdprofissao(Short value) {
        this.cdprofissao = value;
    }

    /**
     * Gets the value of the deprofissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeprofissao() {
        return deprofissao;
    }

    /**
     * Sets the value of the deprofissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeprofissao(String value) {
        this.deprofissao = value;
    }

}
