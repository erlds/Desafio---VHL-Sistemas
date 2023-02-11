
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for juizPaz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="juizPaz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdcomarca" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdjuizdepaz" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cdtpjuizdepaz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detpjuizdepaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtfimexercicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtiniexercicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "juizPaz", propOrder = {
    "cdcomarca",
    "cdjuizdepaz",
    "cdtpjuizdepaz",
    "cpf",
    "detpjuizdepaz",
    "dtfimexercicio",
    "dtiniexercicio",
    "nome"
})
public class JuizPaz {

    protected Integer cdcomarca;
    protected Long cdjuizdepaz;
    protected Integer cdtpjuizdepaz;
    protected String cpf;
    protected String detpjuizdepaz;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtfimexercicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtiniexercicio;
    protected String nome;

    /**
     * Gets the value of the cdcomarca property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdcomarca() {
        return cdcomarca;
    }

    /**
     * Sets the value of the cdcomarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdcomarca(Integer value) {
        this.cdcomarca = value;
    }

    /**
     * Gets the value of the cdjuizdepaz property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdjuizdepaz() {
        return cdjuizdepaz;
    }

    /**
     * Sets the value of the cdjuizdepaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdjuizdepaz(Long value) {
        this.cdjuizdepaz = value;
    }

    /**
     * Gets the value of the cdtpjuizdepaz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdtpjuizdepaz() {
        return cdtpjuizdepaz;
    }

    /**
     * Sets the value of the cdtpjuizdepaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdtpjuizdepaz(Integer value) {
        this.cdtpjuizdepaz = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the detpjuizdepaz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpjuizdepaz() {
        return detpjuizdepaz;
    }

    /**
     * Sets the value of the detpjuizdepaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpjuizdepaz(String value) {
        this.detpjuizdepaz = value;
    }

    /**
     * Gets the value of the dtfimexercicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtfimexercicio() {
        return dtfimexercicio;
    }

    /**
     * Sets the value of the dtfimexercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtfimexercicio(XMLGregorianCalendar value) {
        this.dtfimexercicio = value;
    }

    /**
     * Gets the value of the dtiniexercicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtiniexercicio() {
        return dtiniexercicio;
    }

    /**
     * Sets the value of the dtiniexercicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtiniexercicio(XMLGregorianCalendar value) {
        this.dtiniexercicio = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

}
