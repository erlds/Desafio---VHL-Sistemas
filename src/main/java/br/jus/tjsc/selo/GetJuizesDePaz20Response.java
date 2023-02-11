
package br.jus.tjsc.selo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getJuizesDePaz20Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getJuizesDePaz20Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="juizesDePaz20" type="{http://www.tjsc.jus.br/selo}juizPaz20" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJuizesDePaz20Response", propOrder = {
    "juizesDePaz20"
})
public class GetJuizesDePaz20Response {

    protected List<JuizPaz20> juizesDePaz20;

    /**
     * Gets the value of the juizesDePaz20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the juizesDePaz20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJuizesDePaz20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JuizPaz20 }
     * 
     * 
     */
    public List<JuizPaz20> getJuizesDePaz20() {
        if (juizesDePaz20 == null) {
            juizesDePaz20 = new ArrayList<JuizPaz20>();
        }
        return this.juizesDePaz20;
    }

}
