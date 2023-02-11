
package br.jus.tjsc.selo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSituacoesDeTituloResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSituacoesDeTituloResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="situacoesDeTitulo" type="{http://www.tjsc.jus.br/selo}situacaoTitulo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSituacoesDeTituloResponse", propOrder = {
    "situacoesDeTitulo"
})
public class GetSituacoesDeTituloResponse {

    protected List<SituacaoTitulo> situacoesDeTitulo;

    /**
     * Gets the value of the situacoesDeTitulo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situacoesDeTitulo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituacoesDeTitulo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituacaoTitulo }
     * 
     * 
     */
    public List<SituacaoTitulo> getSituacoesDeTitulo() {
        if (situacoesDeTitulo == null) {
            situacoesDeTitulo = new ArrayList<SituacaoTitulo>();
        }
        return this.situacoesDeTitulo;
    }

}
