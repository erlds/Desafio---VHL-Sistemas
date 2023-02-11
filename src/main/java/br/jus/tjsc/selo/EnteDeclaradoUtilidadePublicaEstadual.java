
package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enteDeclaradoUtilidadePublicaEstadual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enteDeclaradoUtilidadePublicaEstadual">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdcomarca" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdentepub" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dtLei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtLeiExtenso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeComarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeComarcaEntidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeEntidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enteDeclaradoUtilidadePublicaEstadual", propOrder = {
    "cdcomarca",
    "cdentepub",
    "dtLei",
    "dtLeiExtenso",
    "lei",
    "nomeComarca",
    "nomeComarcaEntidade",
    "nomeEntidade"
})
public class EnteDeclaradoUtilidadePublicaEstadual {

    protected Integer cdcomarca;
    protected Long cdentepub;
    protected String dtLei;
    protected String dtLeiExtenso;
    protected String lei;
    protected String nomeComarca;
    protected String nomeComarcaEntidade;
    protected String nomeEntidade;

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
     * Gets the value of the cdentepub property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdentepub() {
        return cdentepub;
    }

    /**
     * Sets the value of the cdentepub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdentepub(Long value) {
        this.cdentepub = value;
    }

    /**
     * Gets the value of the dtLei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtLei() {
        return dtLei;
    }

    /**
     * Sets the value of the dtLei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtLei(String value) {
        this.dtLei = value;
    }

    /**
     * Gets the value of the dtLeiExtenso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtLeiExtenso() {
        return dtLeiExtenso;
    }

    /**
     * Sets the value of the dtLeiExtenso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtLeiExtenso(String value) {
        this.dtLeiExtenso = value;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLei() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLei(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the nomeComarca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeComarca() {
        return nomeComarca;
    }

    /**
     * Sets the value of the nomeComarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeComarca(String value) {
        this.nomeComarca = value;
    }

    /**
     * Gets the value of the nomeComarcaEntidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeComarcaEntidade() {
        return nomeComarcaEntidade;
    }

    /**
     * Sets the value of the nomeComarcaEntidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeComarcaEntidade(String value) {
        this.nomeComarcaEntidade = value;
    }

    /**
     * Gets the value of the nomeEntidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEntidade() {
        return nomeEntidade;
    }

    /**
     * Sets the value of the nomeEntidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEntidade(String value) {
        this.nomeEntidade = value;
    }

}
