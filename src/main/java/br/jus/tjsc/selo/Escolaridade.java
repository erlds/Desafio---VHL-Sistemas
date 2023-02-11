
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for escolaridade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="escolaridade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdescolaridade" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="deescolaridade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "escolaridade", propOrder = {
    "cdescolaridade",
    "deescolaridade"
})
public class Escolaridade {

    protected Short cdescolaridade;
    protected String deescolaridade;

    /**
     * Gets the value of the cdescolaridade property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdescolaridade() {
        return cdescolaridade;
    }

    /**
     * Sets the value of the cdescolaridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdescolaridade(Short value) {
        this.cdescolaridade = value;
    }

    /**
     * Gets the value of the deescolaridade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeescolaridade() {
        return deescolaridade;
    }

    /**
     * Sets the value of the deescolaridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeescolaridade(String value) {
        this.deescolaridade = value;
    }

}
