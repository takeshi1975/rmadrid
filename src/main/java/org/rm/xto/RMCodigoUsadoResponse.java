
package org.rm.xto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMCodigoUsadoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rmCodigoUsadoResult"
})
@XmlRootElement(name = "RMCodigoUsadoResponse")
public class RMCodigoUsadoResponse {

    @XmlElement(name = "RMCodigoUsadoResult")
    protected boolean rmCodigoUsadoResult;

    /**
     * Obtiene el valor de la propiedad rmCodigoUsadoResult.
     * 
     */
    public boolean isRMCodigoUsadoResult() {
        return rmCodigoUsadoResult;
    }

    /**
     * Define el valor de la propiedad rmCodigoUsadoResult.
     * 
     */
    public void setRMCodigoUsadoResult(boolean value) {
        this.rmCodigoUsadoResult = value;
    }

}