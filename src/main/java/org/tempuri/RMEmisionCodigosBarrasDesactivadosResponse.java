
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the rmEmisionCodigosBarrasDesactivadosResult property.
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
     * Sets the value of the rmEmisionCodigosBarrasDesactivadosResult property.
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
