
package tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Input" type="{http://www.sap.com/caf/htwberlin.de.tr119/tr_119_product.bl.caf/modeled}TR_119_Order"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "input"
})
@XmlRootElement(name = "delete")
public class Delete implements java.io.Serializable {

    @XmlElement(name = "Input", required = true)
    protected TR_119_Order input;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link TR_119_Order }
     *     
     */
    public TR_119_Order getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link TR_119_Order }
     *     
     */
    public void setInput(TR_119_Order value) {
        this.input = value;
    }

}
