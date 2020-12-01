
package Offer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Aqua_web", targetNamespace = "http://aqua/", wsdlLocation = "http://localhost:8080/Aquamachine_extension/Aqua_web?WSDL")
public class AquaWeb_Service
    extends Service
{

    private final static URL AQUAWEB_WSDL_LOCATION;
    private final static WebServiceException AQUAWEB_EXCEPTION;
    private final static QName AQUAWEB_QNAME = new QName("http://aqua/", "Aqua_web");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Aquamachine_extension/Aqua_web?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AQUAWEB_WSDL_LOCATION = url;
        AQUAWEB_EXCEPTION = e;
    }

    public AquaWeb_Service() {
        super(__getWsdlLocation(), AQUAWEB_QNAME);
    }

    public AquaWeb_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), AQUAWEB_QNAME, features);
    }

    public AquaWeb_Service(URL wsdlLocation) {
        super(wsdlLocation, AQUAWEB_QNAME);
    }

    public AquaWeb_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AQUAWEB_QNAME, features);
    }

    public AquaWeb_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AquaWeb_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AquaWeb
     */
    @WebEndpoint(name = "Aqua_webPort")
    public AquaWeb getAquaWebPort() {
        return super.getPort(new QName("http://aqua/", "Aqua_webPort"), AquaWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AquaWeb
     */
    @WebEndpoint(name = "Aqua_webPort")
    public AquaWeb getAquaWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://aqua/", "Aqua_webPort"), AquaWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AQUAWEB_EXCEPTION!= null) {
            throw AQUAWEB_EXCEPTION;
        }
        return AQUAWEB_WSDL_LOCATION;
    }

}
