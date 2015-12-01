	
package tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order;

import static com.sap.caf.rt.util.JPAValuesConvertor.*;

@javax.persistence.Entity(name="tr119_de_htwberlin_tr_119_product_bl_caf_modeled_bonode_tr_119_order_tr_119_order_TR_119_OrderBO")
@javax.persistence.Table(name="TMP_TR__MOD_TR_119")

@com.sap.caf.rt.bol.da.jpa.annotations.CAFStructure(mainStructure=true, pojoClass=tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order.class, version="1.1.0" )
public class TR_119_OrderBO implements com.sap.caf.rt.bol.da.jpa.IPersistableBONode {


	private java.lang.String _key;
	private java.lang.String _createdBy;
	private java.sql.Timestamp _createdAt;
	private java.sql.Timestamp _modifiedAt;
	private java.lang.String _modifiedBy;
	private java.lang.String _productId;
	private java.lang.Integer _quantitiy;
	private java.lang.String _comment;



	public TR_119_OrderBO() {
	
	}
	
	@Deprecated
	public void setCreatedAt(java.util.Date _createdAt) {
		this._createdAt = new java.sql.Timestamp(_createdAt.getTime());
	}
	
	@Deprecated
	public void setModifiedAt(java.util.Date _modifiedAt){
		this._modifiedAt = new java.sql.Timestamp(_modifiedAt.getTime());
	}



	@javax.persistence.Id
	@javax.persistence.Column(name="OBJECTKEY")

	@com.sap.caf.rt.bol.da.jpa.annotations.CAFAttribute(name="key", properties={@com.sap.caf.rt.bol.da.jpa.annotations.CAFProperty(key="length", value="36"),@com.sap.caf.rt.bol.da.jpa.annotations.CAFProperty(key="mandatory", value="true")})
	public java.lang.String getKey() {
		return this._key;
	}
	
	
	
	public void setKey(java.lang.String _key) {
		if (_key != null && _key.trim().length() == 0) {
			this._key = null;
		} else {
			this._key = _key;
		}
	}
	
	@javax.persistence.Column(name="CREATEDBY")

	@com.sap.caf.rt.bol.da.jpa.annotations.CAFAttribute(name="createdBy", properties={@com.sap.caf.rt.bol.da.jpa.annotations.CAFProperty(key="length", value="32")})
	public java.lang.String getCreatedBy() {
		return this._createdBy;
	}
	
	
	
	public void setCreatedBy(java.lang.String _createdBy) {
		if (_createdBy != null && _createdBy.trim().length() == 0) {
			this._createdBy = null;
		} else {
			this._createdBy = _createdBy;
		}
	}
	
	@javax.persistence.Column(name="CREATEDAT")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)

	@com.sap.caf.rt.bol.da.jpa.annotations.CAFAttribute(name="createdAt", properties={})
	public java.sql.Timestamp getCreatedAt() {
		return this._createdAt;
	}
	
	
	
	public void setCreatedAt(java.sql.Timestamp _createdAt) {
		this._createdAt = _createdAt;
	}
	
	@javax.persistence.Column(name="MODIFIEDAT")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)

	@com.sap.caf.rt.bol.da.jpa.annotations.CAFAttribute(name="modifiedAt", properties={})
	public java.sql.Timestamp getModifiedAt() {
		return this._modifiedAt;
	}
	
	
	
	public void setModifiedAt(java.sql.Timestamp _modifiedAt) {
		this._modifiedAt = _modifiedAt;
	}
	
	@javax.persistence.Column(name="MODIFIEDBY")

	@com.sap.caf.rt.bol.da.jpa.annotations.CAFAttribute(name="modifiedBy", properties={@com.sap.caf.rt.bol.da.jpa.annotations.CAFProperty(key="length", value="32")})
	public java.lang.String getModifiedBy() {
		return this._modifiedBy;
	}
	
	
	
	public void setModifiedBy(java.lang.String _modifiedBy) {
		if (_modifiedBy != null && _modifiedBy.trim().length() == 0) {
			this._modifiedBy = null;
		} else {
			this._modifiedBy = _modifiedBy;
		}
	}
	
	@javax.persistence.Column(name="PRODUCTID")

	@com.sap.caf.rt.bol.da.jpa.annotations.CAFAttribute(name="productId", properties={@com.sap.caf.rt.bol.da.jpa.annotations.CAFProperty(key="length", value="30")})
	public java.lang.String getProductId() {
		return this._productId;
	}
	
	
	
	public void setProductId(java.lang.String _productId) {
		if (_productId != null && _productId.trim().length() == 0) {
			this._productId = null;
		} else {
			this._productId = _productId;
		}
	}
	
	@javax.persistence.Column(name="QUANTITIY")

	@com.sap.caf.rt.bol.da.jpa.annotations.CAFAttribute(name="quantitiy", properties={})
	public java.lang.Integer getQuantitiy() {
		return this._quantitiy;
	}
	
	
	
	public void setQuantitiy(java.lang.Integer _quantitiy) {
		this._quantitiy = _quantitiy;
	}
	
	@javax.persistence.Column(name="COMMENT")

	@com.sap.caf.rt.bol.da.jpa.annotations.CAFAttribute(name="comment", properties={@com.sap.caf.rt.bol.da.jpa.annotations.CAFProperty(key="length", value="256")})
	public java.lang.String getComment() {
		return this._comment;
	}
	
	
	
	public void setComment(java.lang.String _comment) {
		if (_comment != null && _comment.trim().length() == 0) {
			this._comment = null;
		} else {
			this._comment = _comment;
		}
	}
	

	public Object getAttribute(java.lang.String name) {
		if ("key".equals(name))
			return getKey();
		if ("createdBy".equals(name))
			return getCreatedBy();
		if ("createdAt".equals(name))
			return getCreatedAt();
		if ("modifiedAt".equals(name))
			return getModifiedAt();
		if ("modifiedBy".equals(name))
			return getModifiedBy();
		if ("productId".equals(name))
			return getProductId();
		if ("quantitiy".equals(name))
			return getQuantitiy();
		if ("comment".equals(name))
			return getComment();
		return null;
	}
	
	public void setAttribute(java.lang.String name, java.lang.Object value) {
		if ("key".equals(name)) {
	
			setKey( convertToJPAValue(value,java.lang.String.class,"key") );
		} else if ("createdBy".equals(name)) {
	
			setCreatedBy( convertToJPAValue(value,java.lang.String.class,"createdBy") );
		} else if ("createdAt".equals(name)) {
	
			setCreatedAt( convertToJPAValue(value,java.sql.Timestamp.class,"createdAt") );
		} else if ("modifiedAt".equals(name)) {
	
			setModifiedAt( convertToJPAValue(value,java.sql.Timestamp.class,"modifiedAt") );
		} else if ("modifiedBy".equals(name)) {
	
			setModifiedBy( convertToJPAValue(value,java.lang.String.class,"modifiedBy") );
		} else if ("productId".equals(name)) {
	
			setProductId( convertToJPAValue(value,java.lang.String.class,"productId") );
		} else if ("quantitiy".equals(name)) {
	
			setQuantitiy( convertToJPAValue(value,java.lang.Integer.class,"quantitiy") );
		} else if ("comment".equals(name)) {
	
			setComment( convertToJPAValue(value,java.lang.String.class,"comment") );
		}
	}
	
	public Object getAttribute(Object structure, String name) {
		tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order struct = (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order) structure;
		
		if ("key".equals(name))
			return struct.getKey();
		
		if ("createdBy".equals(name))
			return struct.getCreatedBy();
		
		if ("createdAt".equals(name))
			return struct.getCreatedAt();
		
		if ("modifiedAt".equals(name))
			return struct.getModifiedAt();
		
		if ("modifiedBy".equals(name))
			return struct.getModifiedBy();
		
		if ("productId".equals(name))
			return struct.getProductId();
		
		if ("quantitiy".equals(name))
			return struct.getQuantitiy();
		
		if ("comment".equals(name))
			return struct.getComment();
		

		return null;
	}
	
	public void setAttribute(Object structure, String name, Object value) {
		tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order struct = (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order) structure;
		if ("key".equals(name)) {
	
	
			struct.setKey(convertFromJPAValue(value, java.lang.String.class) );
	
		} else if ("createdBy".equals(name)) {
	
	
			struct.setCreatedBy(convertFromJPAValue(value, java.lang.String.class) );
	
		} else if ("createdAt".equals(name)) {
	
	
			struct.setCreatedAt(convertFromJPAValue(value, javax.xml.datatype.XMLGregorianCalendar.class) );
	
		} else if ("modifiedAt".equals(name)) {
	
	
			struct.setModifiedAt(convertFromJPAValue(value, javax.xml.datatype.XMLGregorianCalendar.class) );
	
		} else if ("modifiedBy".equals(name)) {
	
	
			struct.setModifiedBy(convertFromJPAValue(value, java.lang.String.class) );
	
		} else if ("productId".equals(name)) {
	
	
			struct.setProductId(convertFromJPAValue(value, java.lang.String.class) );
	
		} else if ("quantitiy".equals(name)) {
	
	
			struct.setQuantitiy(convertFromJPAValue(value, java.lang.Integer.class) );
	
		} else if ("comment".equals(name)) {
	
	
			struct.setComment(convertFromJPAValue(value, java.lang.String.class) );
	
		}
	}

	@javax.persistence.Transient
	@java.lang.SuppressWarnings("unchecked")
	public java.util.Map getLanguageDependentAttributes() {	
		return java.util.Collections.EMPTY_MAP;
	}
}