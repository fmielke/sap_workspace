
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
 *         &lt;element name="Output" type="{http://www.sap.com/caf/htwberlin.de.tr119/tr_119_product.bl.caf/modeled}TR_119_Order"/>
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
    "output"
})
@XmlRootElement(name = "createResponse")
public class CreateResponse implements java.io.Serializable {

    @XmlElement(name = "Output", required = true)
    protected TR_119_Order output;

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link TR_119_Order }
     *     
     */
    public TR_119_Order getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link TR_119_Order }
     *     
     */
    public void setOutput(TR_119_Order value) {
        this.output = value;
    }

}
