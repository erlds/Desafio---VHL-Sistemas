
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoEmail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoEmail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtipoemail" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="detipoemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEmail", propOrder = {
    "cdtipoemail",
    "detipoemail"
})
public class TipoEmail {

    protected Short cdtipoemail;
    protected String detipoemail;

    /**
     * Gets the value of the cdtipoemail property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtipoemail() {
        return cdtipoemail;
    }

    /**
     * Sets the value of the cdtipoemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtipoemail(Short value) {
        this.cdtipoemail = value;
    }

    /**
     * Gets the value of the detipoemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetipoemail() {
        return detipoemail;
    }

    /**
     * Sets the value of the detipoemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetipoemail(String value) {
        this.detipoemail = value;
    }

}
