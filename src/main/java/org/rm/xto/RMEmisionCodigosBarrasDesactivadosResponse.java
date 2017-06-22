
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
 *         &lt;element name="RMEmisionCodigosBarrasDesactivadosResult" type="{http://tempuri.org/}TCodigosBarras" minOccurs="0"/>
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
    "rmEmisionCodigosBarrasDesactivadosResult"
})
@XmlRootElement(name = "RMEmisionCodigosBarrasDesactivadosResponse")
public class RMEmisionCodigosBarrasDesactivadosResponse {

    @XmlElement(name = "RMEmisionCodigosBarrasDesactivadosResult")
    protected TCodigosBarras rmEmisionCodigosBarrasDesactivadosResult;

    /**
     * Obtiene el valor de la propiedad rmEmisionCodigosBarrasDesactivadosResult.
     * 
     * @return
     *     possible object is
     *     {@link TCodigosBarras }
     *     
     */
    public TCodigosBarras getRMEmisionCodigosBarrasDesactivadosResult() {
        return rmEmisionCodigosBarrasDesactivadosResult;
    }

    /**
     * Define el valor de la propiedad rmEmisionCodigosBarrasDesactivadosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TCodigosBarras }
     *     
     */
    public void setRMEmisionCodigosBarrasDesactivadosResult(TCodigosBarras value) {
        this.rmEmisionCodigosBarrasDesactivadosResult = value;
    }

}
