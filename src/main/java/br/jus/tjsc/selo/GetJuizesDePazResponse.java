
package br.jus.tjsc.selo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getJuizesDePazResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getJuizesDePazResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="juizesDePaz" type="{http://www.tjsc.jus.br/selo}juizPaz" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJuizesDePazResponse", propOrder = {
    "juizesDePaz"
})
public class GetJuizesDePazResponse {

    protected List<JuizPaz> juizesDePaz;

    /**
     * Gets the value of the juizesDePaz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the juizesDePaz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJuizesDePaz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JuizPaz }
     * 
     * 
     */
    public List<JuizPaz> getJuizesDePaz() {
        if (juizesDePaz == null) {
            juizesDePaz = new ArrayList<JuizPaz>();
        }
        return this.juizesDePaz;
    }

}
