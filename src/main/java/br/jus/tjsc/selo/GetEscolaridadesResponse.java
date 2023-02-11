
package br.jus.tjsc.selo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEscolaridadesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEscolaridadesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="escolaridades" type="{http://www.tjsc.jus.br/selo}escolaridade" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEscolaridadesResponse", propOrder = {
    "escolaridades"
})
public class GetEscolaridadesResponse {

    protected List<Escolaridade> escolaridades;

    /**
     * Gets the value of the escolaridades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the escolaridades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEscolaridades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Escolaridade }
     * 
     * 
     */
    public List<Escolaridade> getEscolaridades() {
        if (escolaridades == null) {
            escolaridades = new ArrayList<Escolaridade>();
        }
        return this.escolaridades;
    }

}
