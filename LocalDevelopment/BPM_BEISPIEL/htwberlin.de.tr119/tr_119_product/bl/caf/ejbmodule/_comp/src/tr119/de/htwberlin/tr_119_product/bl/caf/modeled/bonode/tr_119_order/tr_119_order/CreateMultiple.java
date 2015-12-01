
package tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="tR_119_OrdercreateMultipleInput" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="quantitiy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="comment" type="{http://www.sap.com/caf/sap.com/caf.core/services}LongText" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "tr119OrdercreateMultipleInput"
})
@XmlRootElement(name = "createMultiple")
public class CreateMultiple implements java.io.Serializable {

    @XmlElement(name = "tR_119_OrdercreateMultipleInput")
    protected List<CreateMultiple.TR_119_OrdercreateMultipleInput> tr119OrdercreateMultipleInput;

    /**
     * Gets the value of the tr119OrdercreateMultipleInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tr119OrdercreateMultipleInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTR_119_OrdercreateMultipleInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateMultiple.TR_119_OrdercreateMultipleInput }
     * 
     * 
     */
    public List<CreateMultiple.TR_119_OrdercreateMultipleInput> getTR_119_OrdercreateMultipleInput() {
        if (tr119OrdercreateMultipleInput == null) {
            tr119OrdercreateMultipleInput = new ArrayList<CreateMultiple.TR_119_OrdercreateMultipleInput>();
        }
        return this.tr119OrdercreateMultipleInput;
    }


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
     *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="quantitiy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="comment" type="{http://www.sap.com/caf/sap.com/caf.core/services}LongText" minOccurs="0"/>
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
        "productId",
        "quantitiy",
        "comment"
    })
    public static class TR_119_OrdercreateMultipleInput implements java.io.Serializable {

        protected String productId;
        protected Integer quantitiy;
        protected String comment;

        /**
         * Gets the value of the productId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductId() {
            return productId;
        }

        /**
         * Sets the value of the productId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductId(String value) {
            this.productId = value;
        }

        /**
         * Gets the value of the quantitiy property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuantitiy() {
            return quantitiy;
        }

        /**
         * Sets the value of the quantitiy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuantitiy(Integer value) {
            this.quantitiy = value;
        }

        /**
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

    }

}
