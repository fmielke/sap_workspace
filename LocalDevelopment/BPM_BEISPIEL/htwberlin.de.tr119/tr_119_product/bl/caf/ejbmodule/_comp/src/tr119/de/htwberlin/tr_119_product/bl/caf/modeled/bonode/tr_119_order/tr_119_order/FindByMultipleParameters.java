
package tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.caf.rt.bol.util.QueryFilter;


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
 *         &lt;element name="mapNameToFilter" type="{http://www.sap.com/caf/query_filter}QueryFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="implCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="findByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mapNameToFilter",
    "implCheck",
    "findByName"
})
@XmlRootElement(name = "findByMultipleParameters")
public class FindByMultipleParameters implements java.io.Serializable {

    protected List<QueryFilter> mapNameToFilter;
    protected Boolean implCheck;
    protected String findByName;

    /**
     * Gets the value of the mapNameToFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapNameToFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapNameToFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryFilter }
     * 
     * 
     */
    public List<QueryFilter> getMapNameToFilter() {
        if (mapNameToFilter == null) {
            mapNameToFilter = new ArrayList<QueryFilter>();
        }
        return this.mapNameToFilter;
    }

    /**
     * Gets the value of the implCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImplCheck() {
        return implCheck;
    }

    /**
     * Sets the value of the implCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImplCheck(Boolean value) {
        this.implCheck = value;
    }

    /**
     * Gets the value of the findByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindByName() {
        return findByName;
    }

    /**
     * Sets the value of the findByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindByName(String value) {
        this.findByName = value;
    }

}
