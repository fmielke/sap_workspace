
package tr119.de.htwberlin.tr_119_product.bl.caf.modeled;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TR_119_Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TR_119_Order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.sap.com/caf/sap.com/caf.core/services}Id"/>
 *         &lt;element name="createdBy" type="{http://www.sap.com/caf/sap.com/caf.core/services}UserId" minOccurs="0"/>
 *         &lt;element name="createdAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="modifiedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="modifiedBy" type="{http://www.sap.com/caf/sap.com/caf.core/services}UserId" minOccurs="0"/>
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
@XmlType(name = "TR_119_Order", propOrder = {
    "key",
    "createdBy",
    "createdAt",
    "modifiedAt",
    "modifiedBy",
    "productId",
    "quantitiy",
    "comment"
})
public class TR_119_Order implements com.sap.caf.rt.bol.IBusinessObjectNodeBase, java.io.Serializable {

    @XmlElement(required = true)
    protected String key;
    protected String createdBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedAt;
    protected String modifiedBy;
    protected String productId;
    protected Integer quantitiy;
    protected String comment;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the modifiedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedAt() {
        return modifiedAt;
    }

    /**
     * Sets the value of the modifiedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedAt(XMLGregorianCalendar value) {
        this.modifiedAt = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedBy(String value) {
        this.modifiedBy = value;
    }

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

	private static final transient java.lang.String[] _CAF_PROPERTY_NAMES = new java.lang.String[] {
			"key", "createdBy", "createdAt", "modifiedAt", "modifiedBy",
			"productId", "quantitiy", "comment" };
	@javax.xml.bind.annotation.XmlTransient
	private java.lang.String __caf_object_type;

	@javax.xml.bind.annotation.XmlTransient
	public java.lang.String getObjectType() {
		return __caf_object_type;
	}

	/**
	 * Specifies the object type.
	 * @param objectType  - the object type value.
	 * @see #getObjectType
	 */
	public void setObjectType(java.lang.String objectType) {
		this.__caf_object_type = objectType;
	}

	/**
	 * Returns structure properties' names
	 * @return  properties names
	 */
	@javax.xml.bind.annotation.XmlTransient
	public java.lang.String[] getPropertyList() {
		return _CAF_PROPERTY_NAMES;
	}

	@java.lang.SuppressWarnings("unchecked")
	public java.lang.Object getProperty(java.lang.String _propertyName) {
		if (_propertyName.equals("key"))
			return getKey();
		if (_propertyName.equals("createdBy"))
			return getCreatedBy();
		if (_propertyName.equals("createdAt"))
			return getCreatedAt();
		if (_propertyName.equals("modifiedAt"))
			return getModifiedAt();
		if (_propertyName.equals("modifiedBy"))
			return getModifiedBy();
		if (_propertyName.equals("productId"))
			return getProductId();
		if (_propertyName.equals("quantitiy"))
			return getQuantitiy();
		if (_propertyName.equals("comment"))
			return getComment();
		return null;
	}

	@java.lang.SuppressWarnings("unchecked")
	public void setProperty(java.lang.String _propertyName,
			java.lang.Object _value) {
		if (_propertyName.equals("key"))
			setKey((java.lang.String) _value);
		else if (_propertyName.equals("createdBy"))
			setCreatedBy((java.lang.String) _value);
		else if (_propertyName.equals("createdAt"))
			setCreatedAt((javax.xml.datatype.XMLGregorianCalendar) _value);
		else if (_propertyName.equals("modifiedAt"))
			setModifiedAt((javax.xml.datatype.XMLGregorianCalendar) _value);
		else if (_propertyName.equals("modifiedBy"))
			setModifiedBy((java.lang.String) _value);
		else if (_propertyName.equals("productId"))
			setProductId((java.lang.String) _value);
		else if (_propertyName.equals("quantitiy"))
			setQuantitiy((java.lang.Integer) _value);
		else if (_propertyName.equals("comment"))
			setComment((java.lang.String) _value);
	}

	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order other = (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order) obj;
		if (getKey() == null) {
			return false;
		} else if (!getKey().equals(other.getKey()))
			return false;
		return true;
	}

	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result
				+ ((getKey() == null) ? 0 : getKey().hashCode());
		return result;
	}

	private final static long serialVersionUID = 1455977861L;

}
