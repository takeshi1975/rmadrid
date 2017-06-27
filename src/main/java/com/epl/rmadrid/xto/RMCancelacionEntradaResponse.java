
package com.epl.rmadrid.xto;

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
 *         &lt;element name="RMCancelacionEntradaResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmCancelacionEntradaResult"
})
@XmlRootElement(name = "RMCancelacionEntradaResponse")
public class RMCancelacionEntradaResponse {

    @XmlElement(name = "RMCancelacionEntradaResult")
    protected boolean rmCancelacionEntradaResult;

    /**
     * Obtiene el valor de la propiedad rmCancelacionEntradaResult.
     * 
     */
    public boolean isRMCancelacionEntradaResult() {
        return rmCancelacionEntradaResult;
    }

    /**
     * Define el valor de la propiedad rmCancelacionEntradaResult.
     * 
     */
    public void setRMCancelacionEntradaResult(boolean value) {
        this.rmCancelacionEntradaResult = value;
    }

}
