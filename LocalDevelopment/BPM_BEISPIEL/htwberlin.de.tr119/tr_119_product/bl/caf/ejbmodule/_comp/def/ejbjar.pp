<?xml version="1.0" encoding="UTF-8"?>
<public-part
		version="1.0.5"
		xmlns="http://xml.sap.com/2002/11/PublicPart"
		xmlns:IDX="urn:sap.com:PublicPart:1.0"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://xml.sap.com/2002/11/PublicPart ppdef.xsd">
	<name>ejbjar</name>
	<purpose>assembly</purpose>
	<entities>
		<entity>
			<name>htwberlin.de.tr119~tr_119_product~bl~caf~ejbmodule</name>
			<entity-type>EJB-JAR</entity-type>
		</entity>
	</entities>
	<access-control-list>
		<grant forwarding-allowed="false">
			<dc-ref>
				<name>tr_119_product/bl/caf/ear</name>
				<vendor>htwberlin.de.tr119</vendor>
			</dc-ref>
		</grant>
	</access-control-list>
</public-part>
