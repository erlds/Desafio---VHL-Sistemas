
package br.jus.tjsc.selo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCartorioLivros20Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCartorioLivros20Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cartorioLivros20" type="{http://www.tjsc.jus.br/selo}cartorioLivro20" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCartorioLivros20Response", propOrder = {
    "cartorioLivros20"
})
public class GetCartorioLivros20Response {

    protected List<CartorioLivro20> cartorioLivros20;

    /**
     * Gets the value of the cartorioLivros20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartorioLivros20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartorioLivros20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartorioLivro20 }
     * 
     * 
     */
    public List<CartorioLivro20> getCartorioLivros20() {
        if (cartorioLivros20 == null) {
            cartorioLivros20 = new ArrayList<CartorioLivro20>();
        }
        return this.cartorioLivros20;
    }

}
