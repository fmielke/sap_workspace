package tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order;

public interface TR_119_OrderService {

	/**
	 * create
	 * @param  productId  
	 * @param  quantitiy  
	 * @param  comment  
	 * @return  
	 * @throws  com.sap.caf.rt.exception.CAFCreateException  
	 */		 
	public tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order create(java.lang.String productId,java.lang.Integer quantitiy,java.lang.String comment) throws com.sap.caf.rt.exception.CAFCreateException;

	/**
	 * createMultiple
	 * @param  tR_119_OrdercreateMultipleInput  
	 * @return  
	 * @throws  com.sap.caf.rt.exception.CAFCreateException  
	 */		 
	public java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> createMultiple(java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order.CreateMultiple.TR_119_OrdercreateMultipleInput> tR_119_OrdercreateMultipleInput) throws com.sap.caf.rt.exception.CAFCreateException;

	/**
	 * read
	 * @param  key  
	 * @return  
	 * @throws  com.sap.caf.rt.exception.CAFRetrieveException  
	 */		 
	public tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order read(java.lang.String key) throws com.sap.caf.rt.exception.CAFRetrieveException;

	/**
	 * update
	 * @param  input  
	 * @throws  com.sap.caf.rt.exception.CAFUpdateException  
	 * @throws  com.sap.caf.rt.exception.CAFLockException  
	 */		 
	public void update(tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order input) throws com.sap.caf.rt.exception.CAFUpdateException,com.sap.caf.rt.exception.CAFLockException;

	/**
	 * updateMultiple
	 * @param  input  
	 * @throws  com.sap.caf.rt.exception.CAFUpdateException  
	 * @throws  com.sap.caf.rt.exception.CAFLockException  
	 */		 
	public void updateMultiple(java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> input) throws com.sap.caf.rt.exception.CAFUpdateException,com.sap.caf.rt.exception.CAFLockException;

	/**
	 * delete
	 * @param  input  
	 * @throws  com.sap.caf.rt.exception.CAFDeleteException  
	 * @throws  com.sap.caf.rt.exception.CAFLockException  
	 */		 
	public void delete(tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order input) throws com.sap.caf.rt.exception.CAFDeleteException,com.sap.caf.rt.exception.CAFLockException;

	/**
	 * deleteMultiple
	 * @param  input  
	 * @throws  com.sap.caf.rt.exception.CAFDeleteException  
	 * @throws  com.sap.caf.rt.exception.CAFLockException  
	 */		 
	public void deleteMultiple(java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> input) throws com.sap.caf.rt.exception.CAFDeleteException,com.sap.caf.rt.exception.CAFLockException;
	
	/**
	 * This method is a generic query operation. It works with a collection of arbitrary query filters.
	 * These query filters may refer to any subset of the BO node's attributes, and may be combined with various logic operators.
	 * <br> This query operation works only for locally persisted BO nodes.
	 * @param mapNameToFilter a list of {@link com.sap.caf.rt.bol.util.QueryFilter}s
	 * @param implCheck must always be set to <code>true</code>
	 * @param findByName must always be set to <code>""</code>
	 * @return a list of BO node instances which fulfill the criteria of <code>mapNameToFilter</code>
	 * @deprecated This method is deprecated because its direct use is discouraged.
	 */
	@Deprecated	 
	public java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> findByMultipleParameters(java.util.List<com.sap.caf.rt.bol.util.QueryFilter> mapNameToFilter,java.lang.Boolean implCheck,java.lang.String findByName) throws com.sap.caf.rt.exception.CAFFindException;

	/**
	 * findAll
	 * @return  Output
	 * @throws  com.sap.caf.rt.exception.CAFFindException  
	 */		 
	public java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> findAll() throws com.sap.caf.rt.exception.CAFFindException;

	/**
	 * This method is a generic query operation. It works with a collection of arbitrary query filters.
	 * These query filters may refer to any subset of the BO node's attributes, and may be combined with various logic operators.
	 * <br> This query operation works only for locally persisted BO nodes.
	 * @param queryFilters a list of {@link com.sap.caf.rt.bol.util.QueryFilter}s
	 * @param orderBy specifies the order which must be applied to the returned collection of BO nodes
	 * @param paging specifies the paging which must be applied to the returned collection of BO nodes
	 * @param findByName must always be set to <code>""</code>
	 * @return a list of BO node instances which fulfill the criteria of <code>queryFilters</code>
	 * @deprecated This method is deprecated because its direct use is discouraged.
	 */
	 @Deprecated
	public java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> findByMultipleParameters(java.util.List<com.sap.caf.rt.bol.util.QueryFilter> queryFilters, com.sap.caf.rt.bol.util.OrderBy orderBy, com.sap.caf.rt.bol.util.Paging paging, java.lang.String findByName) throws com.sap.caf.rt.exception.CAFFindException;
	



}