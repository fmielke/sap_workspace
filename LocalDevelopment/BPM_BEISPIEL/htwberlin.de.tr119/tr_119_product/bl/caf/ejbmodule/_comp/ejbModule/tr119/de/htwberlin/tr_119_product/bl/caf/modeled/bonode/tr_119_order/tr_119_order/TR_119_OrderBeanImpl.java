package tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order;

@javax.ejb.Stateless(name="tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order.TR_119_Order")
@javax.ejb.Local(tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order.TR_119_OrderServiceLocal.class)
@javax.jws.WebService(endpointInterface="tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order.TR_119_OrderSEI", serviceName="TR_119_Order", portName="TR_119_OrderBindingPort", wsdlLocation="META-INF/wsdl/tr_119_product_bl_caf_modeled_TR_119_Order.wsdl", targetNamespace="http://www.sap.com/caf/htwberlin.de.tr119/tr_119_product.bl.caf/modeled/TR_119_Order")
@com.sap.engine.services.webservices.espbase.configuration.ann.rt.TransportBindingRT(AltPath="htwberlin.de.tr119_tr_119_product.bl.caf_TR_119_Order")
@javax.interceptor.Interceptors(com.sap.caf.rt.interceptors.LogInterceptor.class)
public class TR_119_OrderBeanImpl extends tr119.de.htwberlin.tr_119_product.bl.caf.modeled.bonode.tr_119_order.tr_119_order.TR_119_OrderBean { //$JL-SER$ - static final long serialVersionUID is not declared

	public TR_119_OrderBeanImpl() {

	}
}