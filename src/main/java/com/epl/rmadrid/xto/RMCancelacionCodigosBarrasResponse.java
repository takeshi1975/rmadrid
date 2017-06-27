
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
 *         &lt;element name="RMCancelacionCodigosBarrasResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmCancelacionCodigosBarrasResult"
})
@XmlRootElement(name = "RMCancelacionCodigosBarrasResponse")
public class RMCancelacionCodigosBarrasResponse {

    @XmlElement(name = "RMCancelacionCodigosBarrasResult")
    protected boolean rmCancelacionCodigosBarrasResult;

    /**
     * Obtiene el valor de la propiedad rmCancelacionCodigosBarrasResult.
     * 
     */
    public boolean isRMCancelacionCodigosBarrasResult() {
        return rmCancelacionCodigosBarrasResult;
    }

    /**
     * Define el valor de la propiedad rmCancelacionCodigosBarrasResult.
     * 
     */
    public void setRMCancelacionCodigosBarrasResult(boolean value) {
        this.rmCancelacionCodigosBarrasResult = value;
    }

}
