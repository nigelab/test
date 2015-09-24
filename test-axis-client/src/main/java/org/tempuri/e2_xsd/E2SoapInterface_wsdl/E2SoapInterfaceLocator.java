/**
 * E2SoapInterfaceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.e2_xsd.E2SoapInterface_wsdl;

public class E2SoapInterfaceLocator extends org.apache.axis.client.Service implements org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterface {

/**
 * gSOAP 2.7.13 generated service definition
 */

    public E2SoapInterfaceLocator() {
    }


    public E2SoapInterfaceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public E2SoapInterfaceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for E2SoapInterface
    private java.lang.String E2SoapInterface_address = "http://10.161.92.140/soap";

    public java.lang.String getE2SoapInterfaceAddress() {
        return E2SoapInterface_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String E2SoapInterfaceWSDDServiceName = "E2SoapInterface";

    public java.lang.String getE2SoapInterfaceWSDDServiceName() {
        return E2SoapInterfaceWSDDServiceName;
    }

    public void setE2SoapInterfaceWSDDServiceName(java.lang.String name) {
        E2SoapInterfaceWSDDServiceName = name;
    }

    public org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfacePortType getE2SoapInterface() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(E2SoapInterface_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getE2SoapInterface(endpoint);
    }

    public org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfacePortType getE2SoapInterface(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfaceStub _stub = new org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfaceStub(portAddress, this);
            _stub.setPortName(getE2SoapInterfaceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setE2SoapInterfaceEndpointAddress(java.lang.String address) {
        E2SoapInterface_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfacePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfaceStub _stub = new org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfaceStub(new java.net.URL(E2SoapInterface_address), this);
                _stub.setPortName(getE2SoapInterfaceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("E2SoapInterface".equals(inputPortName)) {
            return getE2SoapInterface();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/e2.xsd/E2SoapInterface.wsdl", "E2SoapInterface");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd/E2SoapInterface.wsdl", "E2SoapInterface"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("E2SoapInterface".equals(portName)) {
            setE2SoapInterfaceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
