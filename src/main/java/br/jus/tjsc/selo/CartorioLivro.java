
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cartorioLivro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cartorioLivro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdcartoriolivro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cdtipoformalivro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdtipolivro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dtabertura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtencerramento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nmtipoformalivro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtipolivro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nucartorio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nucartorioresponsavel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seqlivro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartorioLivro", propOrder = {
    "cdcartoriolivro",
    "cdtipoformalivro",
    "cdtipolivro",
    "dtabertura",
    "dtencerramento",
    "nmtipoformalivro",
    "nmtipolivro",
    "nucartorio",
    "nucartorioresponsavel",
    "seqlivro"
})
public class CartorioLivro {

    protected Long cdcartoriolivro;
    protected Integer cdtipoformalivro;
    protected Integer cdtipolivro;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtabertura;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtencerramento;
    protected String nmtipoformalivro;
    protected String nmtipolivro;
    protected Integer nucartorio;
    protected Integer nucartorioresponsavel;
    protected String seqlivro;

    /**
     * Gets the value of the cdcartoriolivro property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdcartoriolivro() {
        return cdcartoriolivro;
    }

    /**
     * Sets the value of the cdcartoriolivro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdcartoriolivro(Long value) {
        this.cdcartoriolivro = value;
    }

    /**
     * Gets the value of the cdtipoformalivro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdtipoformalivro() {
        return cdtipoformalivro;
    }

    /**
     * Sets the value of the cdtipoformalivro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdtipoformalivro(Integer value) {
        this.cdtipoformalivro = value;
    }

    /**
     * Gets the value of the cdtipolivro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdtipolivro() {
        return cdtipolivro;
    }

    /**
     * Sets the value of the cdtipolivro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdtipolivro(Integer value) {
        this.cdtipolivro = value;
    }

    /**
     * Gets the value of the dtabertura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtabertura() {
        return dtabertura;
    }

    /**
     * Sets the value of the dtabertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtabertura(XMLGregorianCalendar value) {
        this.dtabertura = value;
    }

    /**
     * Gets the value of the dtencerramento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtencerramento() {
        return dtencerramento;
    }

    /**
     * Sets the value of the dtencerramento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtencerramento(XMLGregorianCalendar value) {
        this.dtencerramento = value;
    }

    /**
     * Gets the value of the nmtipoformalivro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoformalivro() {
        return nmtipoformalivro;
    }

    /**
     * Sets the value of the nmtipoformalivro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoformalivro(String value) {
        this.nmtipoformalivro = value;
    }

    /**
     * Gets the value of the nmtipolivro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipolivro() {
        return nmtipolivro;
    }

    /**
     * Sets the value of the nmtipolivro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipolivro(String value) {
        this.nmtipolivro = value;
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

    /**
     * Gets the value of the nucartorioresponsavel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNucartorioresponsavel() {
        return nucartorioresponsavel;
    }

    /**
     * Sets the value of the nucartorioresponsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNucartorioresponsavel(Integer value) {
        this.nucartorioresponsavel = value;
    }

    /**
     * Gets the value of the seqlivro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqlivro() {
        return seqlivro;
    }

    /**
     * Sets the value of the seqlivro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqlivro(String value) {
        this.seqlivro = value;
    }

}
