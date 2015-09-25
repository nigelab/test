
package e2s;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * gSOAP 2.7.13 generated service definition
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "E2SoapInterface", targetNamespace = "http://tempuri.org/e2.xsd/E2SoapInterface.wsdl", wsdlLocation = "file:/D:/Project/E2SoapInterface.wsdl")
public class E2SoapInterface
    extends Service
{

    private final static URL E2SOAPINTERFACE_WSDL_LOCATION;
    private final static WebServiceException E2SOAPINTERFACE_EXCEPTION;
    private final static QName E2SOAPINTERFACE_QNAME = new QName("http://tempuri.org/e2.xsd/E2SoapInterface.wsdl", "E2SoapInterface");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Project/E2SoapInterface.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        E2SOAPINTERFACE_WSDL_LOCATION = url;
        E2SOAPINTERFACE_EXCEPTION = e;
    }

    public E2SoapInterface() {
        super(__getWsdlLocation(), E2SOAPINTERFACE_QNAME);
    }

    public E2SoapInterface(WebServiceFeature... features) {
        super(__getWsdlLocation(), E2SOAPINTERFACE_QNAME, features);
    }

    public E2SoapInterface(URL wsdlLocation) {
        super(wsdlLocation, E2SOAPINTERFACE_QNAME);
    }

    public E2SoapInterface(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, E2SOAPINTERFACE_QNAME, features);
    }

    public E2SoapInterface(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public E2SoapInterface(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns E2SoapInterfacePortType
     */
    @WebEndpoint(name = "E2SoapInterface")
    public E2SoapInterfacePortType getE2SoapInterface() {
        return super.getPort(new QName("http://tempuri.org/e2.xsd/E2SoapInterface.wsdl", "E2SoapInterface"), E2SoapInterfacePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns E2SoapInterfacePortType
     */
    @WebEndpoint(name = "E2SoapInterface")
    public E2SoapInterfacePortType getE2SoapInterface(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/e2.xsd/E2SoapInterface.wsdl", "E2SoapInterface"), E2SoapInterfacePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (E2SOAPINTERFACE_EXCEPTION!= null) {
            throw E2SOAPINTERFACE_EXCEPTION;
        }
        return E2SOAPINTERFACE_WSDL_LOCATION;
    }

}
