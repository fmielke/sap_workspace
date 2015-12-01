package tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order;

public abstract class TR_119_OrderBean extends com.sap.caf.rt.bol.BusinessObjectNodeServiceBase implements TR_119_OrderServiceLocal { //$JL-SER$ - static final long serialVersionUID is not declared

	public static final java.lang.String _objectGuid = "4295750c-83a4-11e5-abf7-00ffc49d1489";
	public static final java.lang.String _PROVIDER = "htwberlin.de.tr119";
	public static final java.lang.String _APPLICATION = "tr_119_product.bl.caf";
	public static final java.lang.String _BO_SRV_NAME = "TR_119_Order";
	public static final java.lang.String _NAMESPACE = "http://www.sap.com/caf/htwberlin.de.tr119";
	public static final java.lang.String _FULLY_QUALIFIED_NAME = "tr_119_product.bl.caf.modeled.TR_119_Order";	
	public static final java.lang.String _OBJECT_NAME = "htwberlin.de.tr119/http://www.sap.com/caf/htwberlin.de.tr119:tr_119_product.bl.caf/TR_119_Order";
	public static final java.lang.String _OBJECT_TYPE = "htwberlin.de.tr119/http://www.sap.com/caf/htwberlin.de.tr119:tr_119_product.bl.caf/tr_119_product.bl.caf.modeled.TR_119_Order";
	protected static final java.lang.String _JARM_REQUEST = "XAP:BO:" + _OBJECT_NAME;
	
    protected static final com.sap.tc.logging.Location _location = com.sap.tc.logging.Location.getLocation(tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order.TR_119_OrderBean.class);    

	protected com.sap.caf.rt.bol.da.IDataAccessService _dataAccessService;
	
	@javax.persistence.PersistenceContext(unitName="htwberlin.de.tr119.tr_119_product.bl.caf")
	protected javax.persistence.EntityManager _entityManager;


	public TR_119_OrderBean(){
	}
    
	@javax.annotation.PostConstruct
    protected void _init() {
    	_objectName = _OBJECT_NAME;
        try {
			java.util.Map<String, Object> _properties = new java.util.HashMap<String, Object>();
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.ENTITY_MANAGER_PROPERTY, _entityManager);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.SESSION_CONTEXT_PROPERTY, sessionContext);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.BO_NODE_PERSISTENT_CLASS_PROPERTY, tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order.TR_119_OrderBO.class);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.BO_NODE_PROVIDER_PROPERTY, _PROVIDER);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.BO_NODE_APPLICATION_PROPERTY, _APPLICATION);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.BO_NODE_SERVICE_NAME_PROPERTY, _BO_SRV_NAME);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.BO_NODE_NAMESPACE_PROPERTY, _NAMESPACE);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.BO_NODE_FULLY_QUALIFIED_NAME, _FULLY_QUALIFIED_NAME);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.BO_NODE_OBJECT_NAME_PROPERTY, _OBJECT_NAME);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.BO_NODE_OBJECT_TYPE_PROPERTY, _OBJECT_TYPE);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.BO_NODE_GUID_PROPERTY, _objectGuid);
			_properties.put(com.sap.caf.rt.bol.da.DataAccessFactory.BO_NODE_MAIN_STRUCT_CLASS_PROPERTY, tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order.class);

			_dataAccessService = com.sap.caf.rt.bol.da.DataAccessFactory.getDataAccessService(com.sap.caf.rt.bol.da.DataAccessFactory.DATASOURCE_JPA, _properties);
        } catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
            _location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in PostConstruct", _e);
            throw new javax.ejb.EJBException(_e);
        }
    }
    
    @javax.annotation.PreDestroy
    protected void _destroy() {
		_dataAccessService.destroy();
    }
    
	public tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order create(java.lang.String productId,java.lang.Integer quantitiy,java.lang.String comment) throws com.sap.caf.rt.exception.CAFCreateException{
		java.lang.String _method = _JARM_REQUEST + ":create(java.lang.String,java.lang.Integer,java.lang.String,)";
		java.lang.String _user = sessionContext.getCallerPrincipal().getName();
		tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _boNodeStructure = null;
        
		try {
			tr119.de.htwberlin.tr_119_product.bl.caf.modeled.ObjectFactory _objectFactory = new tr119.de.htwberlin.tr_119_product.bl.caf.modeled.ObjectFactory();
	        _boNodeStructure = _objectFactory.createTR_119_Order();
	        _boNodeStructure.setObjectType(_OBJECT_TYPE);

			_boNodeStructure.setProperty("productId", productId);
			_boNodeStructure.setProperty("quantitiy", quantitiy);
			_boNodeStructure.setProperty("comment", comment);

			_dataAccessService.create(_boNodeStructure);
			return _boNodeStructure;
		}
		catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
			sessionContext.setRollbackOnly();
	        _location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in {0}. Error message is: {1}", new Object[] {_method, _e.getMessage()}, _e);
            throw new com.sap.caf.rt.exception.CAFCreateException(_location, _e);
        }

	}

	@com.sap.ejb.annotations.ExcludeFromImport
	public java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> createMultiple(java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order.CreateMultiple.TR_119_OrdercreateMultipleInput> tR_119_OrdercreateMultipleInput) throws com.sap.caf.rt.exception.CAFCreateException{
		if (tR_119_OrdercreateMultipleInput == null) {
			throw new com.sap.caf.rt.exception.CAFCreateException(_location, "BO_CRUD_NULL_ARGUMENT", new String[]{"tR_119_OrdercreateMultipleInput"});
		}
		java.lang.String _method = _JARM_REQUEST + ":createMultiple(java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order.CreateMultiple.TR_119_OrdercreateMultipleInput>)";
		java.lang.String _user = sessionContext.getCallerPrincipal().getName();
		java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> _boNodeStructures = new java.util.ArrayList<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order>();
        
		try {
			tr119.de.htwberlin.tr_119_product.bl.caf.modeled.ObjectFactory _objectFactory = new tr119.de.htwberlin.tr_119_product.bl.caf.modeled.ObjectFactory();
			
			for (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order.CreateMultiple.TR_119_OrdercreateMultipleInput _instanceData : tR_119_OrdercreateMultipleInput) {
	        	tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _boNodeStructure = _objectFactory.createTR_119_Order();
	        	_boNodeStructure.setObjectType(_OBJECT_TYPE);
	        	
				_boNodeStructure.setProperty("productId", _instanceData.getProductId());
				_boNodeStructure.setProperty("quantitiy", _instanceData.getQuantitiy());
				_boNodeStructure.setProperty("comment", _instanceData.getComment());
				

				_boNodeStructures.add(_boNodeStructure);
			}

			_dataAccessService.create(_boNodeStructures);
			return _boNodeStructures;
		}
		catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
			sessionContext.setRollbackOnly();
	        _location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in {0}. Error message is: {1}", new Object[] {_method, _e.getMessage()}, _e);
            throw new com.sap.caf.rt.exception.CAFCreateException(_location, _e);
        }

	}

	public tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order read(java.lang.String key) throws com.sap.caf.rt.exception.CAFRetrieveException{
		if (key == null) {
			throw new com.sap.caf.rt.exception.CAFRetrieveException(_location, "BO_CRUD_NULL_ARGUMENT", new String[]{"key"});
		}
		java.lang.String _method = _JARM_REQUEST + ":read(java.lang.String,)";
		java.lang.String _user = sessionContext.getCallerPrincipal().getName();
		try {
		    tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _boNodeStructure;
	      	_boNodeStructure = (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order) _dataAccessService.load(key);
	      	if (_boNodeStructure == null) {
	      		throw new com.sap.caf.rt.exception.CAFRetrieveException(_location, "BO_NOT_EXIST",  new Object[] {key});
	      	}
	      	_boNodeStructure.setObjectType(_OBJECT_TYPE);

			return _boNodeStructure;
		}
		catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
	        _location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in {0}. Error message is: {1}", new Object[] {_method, _e.getMessage()}, _e);		
            throw new com.sap.caf.rt.exception.CAFRetrieveException(_location, _e);
        }
        
	}

	public void update(tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order input) throws com.sap.caf.rt.exception.CAFUpdateException,com.sap.caf.rt.exception.CAFLockException{
		if (input == null) {
			throw new com.sap.caf.rt.exception.CAFUpdateException(_location, "BO_CRUD_NULL_ARGUMENT", new String[]{"input"});
		}
		java.lang.String _method = _JARM_REQUEST + ":update(tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order)";
		java.lang.String _user = sessionContext.getCallerPrincipal().getName();
		 
		lock(input.getKey(), com.sap.caf.rt.bol.IBusinessObjectNodeServiceBase.MODE_WRITE);
		
		try {
			tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _currentlyInStore = read(input.getKey());
			if (!almostEqual(_currentlyInStore.getModifiedAt(), input.getModifiedAt())) {
				throw new com.sap.caf.rt.exception.CAFOptimisticLockException(_location, "EXCEPTION_OPTIMISTIC_LOCK_FAILED", new Object[]{_OBJECT_TYPE, input.getKey(), _currentlyInStore.getModifiedAt(), input.getModifiedAt()});
			}
			input.setObjectType(_OBJECT_TYPE);
			
			_dataAccessService.store(input);
		} catch (com.sap.caf.rt.exception.CAFRetrieveException _e) {
		    throw new com.sap.caf.rt.exception.CAFUpdateException(_location, "BO_UPDATE", _e);
		} catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
			sessionContext.setRollbackOnly();
			_location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in {0}. Error message is: {1}", new Object[] {_method, _e.getMessage()}, _e);
			throw new com.sap.caf.rt.exception.CAFUpdateException(_location, "BO_UPDATE", _e);
		} finally {
			unlock(input.getKey(), com.sap.caf.rt.bol.IBusinessObjectNodeServiceBase.MODE_WRITE);
		}
	}

	public void updateMultiple(java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> input) throws com.sap.caf.rt.exception.CAFUpdateException,com.sap.caf.rt.exception.CAFLockException{
		if (input == null) {
			throw new com.sap.caf.rt.exception.CAFUpdateException(_location, "BO_CRUD_NULL_ARGUMENT", new String[]{"input"});
		}
		java.lang.String _method = _JARM_REQUEST + ":updateMultiple(java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order>)";
		java.lang.String _user = sessionContext.getCallerPrincipal().getName();
		 
    	java.lang.String _boNodeStructureKeys[] = new java.lang.String[input.size()];
    	int _i = 0;
		for (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _boNodeStructure : input) {
			_boNodeStructureKeys[_i] = _boNodeStructure.getKey();
			_i++;
		}
		lock(_boNodeStructureKeys, com.sap.caf.rt.bol.IBusinessObjectNodeServiceBase.MODE_WRITE);

		try {
			for (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _boNodeStructure : input) {
				tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _currentlyInStore = read(_boNodeStructure.getKey());
				if (!almostEqual(_currentlyInStore.getModifiedAt(), _boNodeStructure.getModifiedAt())) {
					throw new com.sap.caf.rt.exception.CAFOptimisticLockException(_location, "EXCEPTION_OPTIMISTIC_LOCK_FAILED", new Object[]{_OBJECT_TYPE, _boNodeStructure.getKey(), _currentlyInStore.getModifiedAt(), _boNodeStructure.getModifiedAt()});
				}
				_boNodeStructure.setObjectType(_OBJECT_TYPE);
			}
			
			_dataAccessService.store(input);
		} catch (com.sap.caf.rt.exception.CAFRetrieveException _e) {
		    throw new com.sap.caf.rt.exception.CAFUpdateException(_location, "BO_UPDATE", _e);
		} catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
			sessionContext.setRollbackOnly();
			_location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in {0}. Error message is: {1}", new Object[] {_method, _e.getMessage()}, _e);
			throw new com.sap.caf.rt.exception.CAFUpdateException(_location, "BO_UPDATE", _e);
		} finally {
			unlock(_boNodeStructureKeys, com.sap.caf.rt.bol.IBusinessObjectNodeServiceBase.MODE_WRITE);
		}
	}

	public void delete(tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order input) throws com.sap.caf.rt.exception.CAFDeleteException,com.sap.caf.rt.exception.CAFLockException{
		if (input == null) {
			throw new com.sap.caf.rt.exception.CAFDeleteException(_location, "BO_CRUD_NULL_ARGUMENT", new String[]{"input"});
		}
		java.lang.String _method = _JARM_REQUEST + ":delete(tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order)";
		java.lang.String _user = sessionContext.getCallerPrincipal().getName();

		lock(input.getKey(), com.sap.caf.rt.bol.IBusinessObjectNodeServiceBase.MODE_WRITE);

		try {		
			input.setObjectType(_OBJECT_TYPE);
			 _dataAccessService.remove(input);
			com.sap.caf.rt.security.acl.CAFPermission.removeInheritedPermissionByInheriting(input.getKey());				 
        } catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
	        sessionContext.setRollbackOnly();
        	_location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in {0}. Error message is: {1}", new Object[] {_method, _e.getMessage()}, _e);
            throw new com.sap.caf.rt.exception.CAFDeleteException(_location, "BO_DELETE", _e);
        } catch (com.sap.caf.rt.exception.CAFPermissionException _e) {
	        sessionContext.setRollbackOnly();
            throw new com.sap.caf.rt.exception.CAFDeleteException(_location, "BO_DELETE", _e);
		} finally {
			unlock(input.getKey(), com.sap.caf.rt.bol.IBusinessObjectNodeServiceBase.MODE_WRITE);
		}
	}

	public void deleteMultiple(java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> input) throws com.sap.caf.rt.exception.CAFDeleteException,com.sap.caf.rt.exception.CAFLockException{
		if (input == null) {
			throw new com.sap.caf.rt.exception.CAFDeleteException(_location, "BO_CRUD_NULL_ARGUMENT", new String[]{"input"});
		}
		java.lang.String _method = _JARM_REQUEST + ":deleteMultiple(java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order>)";
		java.lang.String _user = sessionContext.getCallerPrincipal().getName();
 
    	java.lang.String _boNodeStructureKeys[] = new java.lang.String[input.size()];
    	int _i = 0;
		for (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _boNodeStructure : input) {
			_boNodeStructureKeys[_i] = _boNodeStructure.getKey();
			_i++;
		}
		lock(_boNodeStructureKeys, com.sap.caf.rt.bol.IBusinessObjectNodeServiceBase.MODE_WRITE);

		try {
			for (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _boNodeStructure : input) {
				_boNodeStructure.setObjectType(_OBJECT_TYPE);
			}

			_dataAccessService.remove(input);
			for (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _boNodeStructure : input) {
				com.sap.caf.rt.security.acl.CAFPermission.removeInheritedPermissionByInheriting(_boNodeStructure.getKey());
			}				 
        } catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
	        sessionContext.setRollbackOnly();
        	_location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in {0}. Error message is: {1}", new Object[] {_method, _e.getMessage()}, _e);
            throw new com.sap.caf.rt.exception.CAFDeleteException(_location, "BO_DELETE", _e);
        } catch (com.sap.caf.rt.exception.CAFPermissionException _e) {
	        sessionContext.setRollbackOnly();
            throw new com.sap.caf.rt.exception.CAFDeleteException(_location, "BO_DELETE", _e);
		} finally {
			unlock(_boNodeStructureKeys, com.sap.caf.rt.bol.IBusinessObjectNodeServiceBase.MODE_WRITE);
		}
	}


	@java.lang.SuppressWarnings("unchecked")
	public java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> findAll() throws com.sap.caf.rt.exception.CAFFindException{
		java.lang.String _method = _JARM_REQUEST + ":findAll(void)";
		java.lang.String _user = sessionContext.getCallerPrincipal().getName();
		
        try {
            java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> _retval = (java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order>) _dataAccessService.query(new com.sap.caf.rt.bol.util.QueryFilter[0], "findAll" );
			for (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _item : _retval) {
				_item.setObjectType(_OBJECT_TYPE);
			}
			return _retval;
        } catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
        	_location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in {0}. Error message is: {1}", new Object[] {_method, _e.getMessage()}, _e);
            throw new com.sap.caf.rt.exception.CAFFindException(_location, "BO_FIND", _e);
        }
	}








	@javax.ejb.TransactionAttribute (javax.ejb.TransactionAttributeType.REQUIRED)
	@java.lang.SuppressWarnings("unchecked")
	public java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> findByMultipleParameters(java.util.List<com.sap.caf.rt.bol.util.QueryFilter> queryFilters, java.lang.Boolean implCheck, java.lang.String findByName) throws com.sap.caf.rt.exception.CAFFindException {
		java.lang.String _method = _JARM_REQUEST + ":findByMultipleParameters(java.util.List<com.sap.caf.rt.bol.util.QueryFilter>, boolean, String)";
		java.lang.String _user = sessionContext.getCallerPrincipal().getName();

		com.sap.caf.rt.bol.util.QueryFilter[] queryFiltersArray = null;
		if (queryFilters != null) {
			queryFiltersArray = new com.sap.caf.rt.bol.util.QueryFilter[queryFilters.size()];
			queryFilters.toArray(queryFiltersArray);
		}

		try {
    	    java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> _retval = (java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order>) _dataAccessService.query(queryFiltersArray, findByName );
			for (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _item : _retval) {
				_item.setObjectType(_OBJECT_TYPE);
			}
        	return  _retval;
        } catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
        	_location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in {0}. Error message is: {1}", new Object[] {_method, _e.getMessage()}, _e);
            throw new com.sap.caf.rt.exception.CAFFindException(_location, "BO_FIND", _e);
        }
	} 
	
	
	@javax.ejb.TransactionAttribute (javax.ejb.TransactionAttributeType.REQUIRED)
	@java.lang.SuppressWarnings("unchecked")
	public java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> findByMultipleParameters(java.util.List<com.sap.caf.rt.bol.util.QueryFilter> queryFilters, com.sap.caf.rt.bol.util.OrderBy orderBy, com.sap.caf.rt.bol.util.Paging paging, java.lang.String findByName) throws com.sap.caf.rt.exception.CAFFindException {
		java.lang.String _method = _JARM_REQUEST + ":findByMultipleParameters(java.util.List<com.sap.caf.rt.bol.util.QueryFilter>, boolean, String)";
		java.lang.String _user = sessionContext.getCallerPrincipal().getName();

		com.sap.caf.rt.bol.util.QueryFilter[] queryFiltersArray = null;
		if (queryFilters != null) {
			queryFiltersArray = new com.sap.caf.rt.bol.util.QueryFilter[queryFilters.size()];
			queryFilters.toArray(queryFiltersArray);
		}

		try {
    	    java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order> _retval = (java.util.List<tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order>) _dataAccessService.query(queryFiltersArray, orderBy, paging, findByName );   	    
			for (tr119.de.htwberlin.tr_119_product.bl.caf.modeled.TR_119_Order _item : _retval) {
				_item.setObjectType(_OBJECT_TYPE);
			}
        	return  _retval;
        } catch (com.sap.caf.rt.exception.CAFDataAccessException _e) {
			_location.traceThrowableT(com.sap.tc.logging.Severity.ERROR, "Error in {0}. Error message is: {1}", new Object[] {_method, _e.getMessage()}, _e);
            throw new com.sap.caf.rt.exception.CAFFindException(_location, "BO_FIND", _e);
        }
	} 
	
}