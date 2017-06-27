
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
 *         &lt;element name="RMEmisionCodigosBarrasResult" type="{http://tempuri.org/}TCodigosBarras" minOccurs="0"/>
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
    "rmEmisionCodigosBarrasResult"
})
@XmlRootElement(name = "RMEmisionCodigosBarrasResponse")
public class RMEmisionCodigosBarrasResponse {

    @XmlElement(name = "RMEmisionCodigosBarrasResult")
    protected TCodigosBarras rmEmisionCodigosBarrasResult;

    /**
     * Obtiene el valor de la propiedad rmEmisionCodigosBarrasResult.
     * 
     * @return
     *     possible object is
     *     {@link TCodigosBarras }
     *     
     */
    public TCodigosBarras getRMEmisionCodigosBarrasResult() {
        return rmEmisionCodigosBarrasResult;
    }

    /**
     * Define el valor de la propiedad rmEmisionCodigosBarrasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TCodigosBarras }
     *     
     */
    public void setRMEmisionCodigosBarrasResult(TCodigosBarras value) {
        this.rmEmisionCodigosBarrasResult = value;
    }

}
