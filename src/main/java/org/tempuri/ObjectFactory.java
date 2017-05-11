
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthHeader_QNAME = new QName("http://tempuri.org/", "AuthHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RMReemisionCodigosBarrasResponse }
     * 
     */
    public RMReemisionCodigosBarrasResponse createRMReemisionCodigosBarrasResponse() {
        return new RMReemisionCodigosBarrasResponse();
    }

    /**
     * Create an instance of {@link TCodigosBarras }
     * 
     */
    public TCodigosBarras createTCodigosBarras() {
        return new TCodigosBarras();
    }

    /**
     * Create an instance of {@link AuthHeader }
     * 
     */
    public AuthHeader createAuthHeader() {
        return new AuthHeader();
    }

    /**
     * Create an instance of {@link RMEmisionCodigosBarras }
     * 
     */
    public RMEmisionCodigosBarras createRMEmisionCodigosBarras() {
        return new RMEmisionCodigosBarras();
    }

    /**
     * Create an instance of {@link RMDesactivarEntrada }
     * 
     */
    public RMDesactivarEntrada createRMDesactivarEntrada() {
        return new RMDesactivarEntrada();
    }

    /**
     * Create an instance of {@link RMCodigoUsado }
     * 
     */
    public RMCodigoUsado createRMCodigoUsado() {
        return new RMCodigoUsado();
    }

    /**
     * Create an instance of {@link RMCancelacionCodigosBarrasResponse }
     * 
     */
    public RMCancelacionCodigosBarrasResponse createRMCancelacionCodigosBarrasResponse() {
        return new RMCancelacionCodigosBarrasResponse();
    }

    /**
     * Create an instance of {@link RMActivarEntrada }
     * 
     */
    public RMActivarEntrada createRMActivarEntrada() {
        return new RMActivarEntrada();
    }

    /**
     * Create an instance of {@link RMActivarEntradaResponse }
     * 
     */
    public RMActivarEntradaResponse createRMActivarEntradaResponse() {
        return new RMActivarEntradaResponse();
    }

    /**
     * Create an instance of {@link RMCancelacionEntradaResponse }
     * 
     */
    public RMCancelacionEntradaResponse createRMCancelacionEntradaResponse() {
        return new RMCancelacionEntradaResponse();
    }

    /**
     * Create an instance of {@link RMCancelacionCodigosBarras }
     * 
     */
    public RMCancelacionCodigosBarras createRMCancelacionCodigosBarras() {
        return new RMCancelacionCodigosBarras();
    }

    /**
     * Create an instance of {@link RMEmisionCodigosBarrasDesactivadosResponse }
     * 
     */
    public RMEmisionCodigosBarrasDesactivadosResponse createRMEmisionCodigosBarrasDesactivadosResponse() {
        return new RMEmisionCodigosBarrasDesactivadosResponse();
    }

    /**
     * Create an instance of {@link RMReemisionCodigosBarras }
     * 
     */
    public RMReemisionCodigosBarras createRMReemisionCodigosBarras() {
        return new RMReemisionCodigosBarras();
    }

    /**
     * Create an instance of {@link RMCodigoUsadoResponse }
     * 
     */
    public RMCodigoUsadoResponse createRMCodigoUsadoResponse() {
        return new RMCodigoUsadoResponse();
    }

    /**
     * Create an instance of {@link RMDesactivarEntradaResponse }
     * 
     */
    public RMDesactivarEntradaResponse createRMDesactivarEntradaResponse() {
        return new RMDesactivarEntradaResponse();
    }

    /**
     * Create an instance of {@link RMEmisionCodigosBarrasDesactivados }
     * 
     */
    public RMEmisionCodigosBarrasDesactivados createRMEmisionCodigosBarrasDesactivados() {
        return new RMEmisionCodigosBarrasDesactivados();
    }

    /**
     * Create an instance of {@link RMEmisionCodigosBarrasResponse }
     * 
     */
    public RMEmisionCodigosBarrasResponse createRMEmisionCodigosBarrasResponse() {
        return new RMEmisionCodigosBarrasResponse();
    }

    /**
     * Create an instance of {@link RMCancelacionEntrada }
     * 
     */
    public RMCancelacionEntrada createRMCancelacionEntrada() {
        return new RMCancelacionEntrada();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfBase64Binary }
     * 
     */
    public ArrayOfBase64Binary createArrayOfBase64Binary() {
        return new ArrayOfBase64Binary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthHeader")
    public JAXBElement<AuthHeader> createAuthHeader(AuthHeader value) {
        return new JAXBElement<AuthHeader>(_AuthHeader_QNAME, AuthHeader.class, null, value);
    }

}
