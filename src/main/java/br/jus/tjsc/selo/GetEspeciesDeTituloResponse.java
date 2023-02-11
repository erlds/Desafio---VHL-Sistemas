
package br.jus.tjsc.selo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEspeciesDeTituloResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEspeciesDeTituloResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="especiesDeTitulo" type="{http://www.tjsc.jus.br/selo}especieTitulo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEspeciesDeTituloResponse", propOrder = {
    "especiesDeTitulo"
})
public class GetEspeciesDeTituloResponse {

    protected List<EspecieTitulo> especiesDeTitulo;

    /**
     * Gets the value of the especiesDeTitulo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the especiesDeTitulo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEspeciesDeTitulo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EspecieTitulo }
     * 
     * 
     */
    public List<EspecieTitulo> getEspeciesDeTitulo() {
        if (especiesDeTitulo == null) {
            especiesDeTitulo = new ArrayList<EspecieTitulo>();
        }
        return this.especiesDeTitulo;
    }

}
