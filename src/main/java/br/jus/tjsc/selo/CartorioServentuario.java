
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cartorioServentuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cartorioServentuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdserventuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nmserventuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nucartorio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartorioServentuario", propOrder = {
    "cdserventuario",
    "cdtiposerventuario",
    "nmserventuario",
    "nmtiposerventuario",
    "nucartorio"
})
public class CartorioServentuario {

    protected Integer cdserventuario;
    protected Integer cdtiposerventuario;
    protected String nmserventuario;
    protected String nmtiposerventuario;
    protected Integer nucartorio;

    /**
     * Gets the value of the cdserventuario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdserventuario() {
        return cdserventuario;
    }

    /**
     * Sets the value of the cdserventuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdserventuario(Integer value) {
        this.cdserventuario = value;
    }

    /**
     * Gets the value of the cdtiposerventuario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdtiposerventuario() {
        return cdtiposerventuario;
    }

    /**
     * Sets the value of the cdtiposerventuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdtiposerventuario(Integer value) {
        this.cdtiposerventuario = value;
    }

    /**
     * Gets the value of the nmserventuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmserventuario() {
        return nmserventuario;
    }

    /**
     * Sets the value of the nmserventuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmserventuario(String value) {
        this.nmserventuario = value;
    }

    /**
     * Gets the value of the nmtiposerventuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiposerventuario() {
        return nmtiposerventuario;
    }

    /**
     * Sets the value of the nmtiposerventuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiposerventuario(String value) {
        this.nmtiposerventuario = value;
    }

    /**
     * Gets the value of the nucartorio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNucartorio() {
        return nucartorio;
    }

    /**
     * Sets the value of the nucartorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNucartorio(Integer value) {
        this.nucartorio = value;
    }

}
