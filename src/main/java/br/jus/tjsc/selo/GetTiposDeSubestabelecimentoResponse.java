
package br.jus.tjsc.selo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTiposDeSubestabelecimentoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTiposDeSubestabelecimentoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tiposDeSubestabelecimento" type="{http://www.tjsc.jus.br/selo}tipoSubestabelecimento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTiposDeSubestabelecimentoResponse", propOrder = {
    "tiposDeSubestabelecimento"
})
public class GetTiposDeSubestabelecimentoResponse {

    protected List<TipoSubestabelecimento> tiposDeSubestabelecimento;

    /**
     * Gets the value of the tiposDeSubestabelecimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposDeSubestabelecimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposDeSubestabelecimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoSubestabelecimento }
     * 
     * 
     */
    public List<TipoSubestabelecimento> getTiposDeSubestabelecimento() {
        if (tiposDeSubestabelecimento == null) {
            tiposDeSubestabelecimento = new ArrayList<TipoSubestabelecimento>();
        }
        return this.tiposDeSubestabelecimento;
    }

}
