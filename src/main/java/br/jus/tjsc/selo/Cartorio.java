
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cartorio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cartorio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdmunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsbairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsendereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flsituacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nmcartorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmtitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nucartorio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nucnpjcpf" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nufone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartorio", propOrder = {
    "cdmunicipio",
    "deemail",
    "dsbairro",
    "dsendereco",
    "flsituacao",
    "nmcartorio",
    "nmtitular",
    "nucartorio",
    "nucnpjcpf",
    "nufone"
})
public class Cartorio {

    protected String cdmunicipio;
    protected String deemail;
    protected String dsbairro;
    protected String dsendereco;
    protected Integer flsituacao;
    protected String nmcartorio;
    protected String nmtitular;
    protected Integer nucartorio;
    protected Long nucnpjcpf;
    protected String nufone;

    /**
     * Gets the value of the cdmunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdmunicipio() {
        return cdmunicipio;
    }

    /**
     * Sets the value of the cdmunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdmunicipio(String value) {
        this.cdmunicipio = value;
    }

    /**
     * Gets the value of the deemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeemail() {
        return deemail;
    }

    /**
     * Sets the value of the deemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeemail(String value) {
        this.deemail = value;
    }

    /**
     * Gets the value of the dsbairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsbairro() {
        return dsbairro;
    }

    /**
     * Sets the value of the dsbairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsbairro(String value) {
        this.dsbairro = value;
    }

    /**
     * Gets the value of the dsendereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsendereco() {
        return dsendereco;
    }

    /**
     * Sets the value of the dsendereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsendereco(String value) {
        this.dsendereco = value;
    }

    /**
     * Gets the value of the flsituacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlsituacao() {
        return flsituacao;
    }

    /**
     * Sets the value of the flsituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlsituacao(Integer value) {
        this.flsituacao = value;
    }

    /**
     * Gets the value of the nmcartorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmcartorio() {
        return nmcartorio;
    }

    /**
     * Sets the value of the nmcartorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmcartorio(String value) {
        this.nmcartorio = value;
    }

    /**
     * Gets the value of the nmtitular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtitular() {
        return nmtitular;
    }

    /**
     * Sets the value of the nmtitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtitular(String value) {
        this.nmtitular = value;
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
     * Gets the value of the nucnpjcpf property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNucnpjcpf() {
        return nucnpjcpf;
    }

    /**
     * Sets the value of the nucnpjcpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNucnpjcpf(Long value) {
        this.nucnpjcpf = value;
    }

    /**
     * Gets the value of the nufone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNufone() {
        return nufone;
    }

    /**
     * Sets the value of the nufone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNufone(String value) {
        this.nufone = value;
    }

}
