package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2017-05-11T16:46:44.241+02:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "SW_GesauroRM", 
                  wsdlLocation = "file:/C:/Users/desar/AppData/Local/Temp/tempdir5606328237087359086.tmp/rm_1.wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class SWGesauroRM extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "SW_GesauroRM");
    public final static QName SWGesauroRMSoap12 = new QName("http://tempuri.org/", "SW_GesauroRMSoap12");
    public final static QName SWGesauroRMSoap = new QName("http://tempuri.org/", "SW_GesauroRMSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/desar/AppData/Local/Temp/tempdir5606328237087359086.tmp/rm_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SWGesauroRM.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/desar/AppData/Local/Temp/tempdir5606328237087359086.tmp/rm_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SWGesauroRM(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SWGesauroRM(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SWGesauroRM() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SWGesauroRM(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SWGesauroRM(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SWGesauroRM(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SWGesauroRMSoap
     */
    @WebEndpoint(name = "SW_GesauroRMSoap12")
    public SWGesauroRMSoap getSWGesauroRMSoap12() {
        return super.getPort(SWGesauroRMSoap12, SWGesauroRMSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SWGesauroRMSoap
     */
    @WebEndpoint(name = "SW_GesauroRMSoap12")
    public SWGesauroRMSoap getSWGesauroRMSoap12(WebServiceFeature... features) {
        return super.getPort(SWGesauroRMSoap12, SWGesauroRMSoap.class, features);
    }
    /**
     *
     * @return
     *     returns SWGesauroRMSoap
     */
    @WebEndpoint(name = "SW_GesauroRMSoap")
    public SWGesauroRMSoap getSWGesauroRMSoap() {
        return super.getPort(SWGesauroRMSoap, SWGesauroRMSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SWGesauroRMSoap
     */
    @WebEndpoint(name = "SW_GesauroRMSoap")
    public SWGesauroRMSoap getSWGesauroRMSoap(WebServiceFeature... features) {
        return super.getPort(SWGesauroRMSoap, SWGesauroRMSoap.class, features);
    }

}