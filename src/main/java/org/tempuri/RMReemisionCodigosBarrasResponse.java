
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
 *         &lt;element name="RMReemisionCodigosBarrasResult" type="{http://tempuri.org/}TCodigosBarras" minOccurs="0"/>
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
    "rmReemisionCodigosBarrasResult"
})
@XmlRootElement(name = "RMReemisionCodigosBarrasResponse")
public class RMReemisionCodigosBarrasResponse {

    @XmlElement(name = "RMReemisionCodigosBarrasResult")
    protected TCodigosBarras rmReemisionCodigosBarrasResult;

    /**
     * Gets the value of the rmReemisionCodigosBarrasResult property.
     * 
     * @return
     *     possible object is
     *     {@link TCodigosBarras }
     *     
     */
    public TCodigosBarras getRMReemisionCodigosBarrasResult() {
        return rmReemisionCodigosBarrasResult;
    }

    /**
     * Sets the value of the rmReemisionCodigosBarrasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCodigosBarras }
     *     
     */
    public void setRMReemisionCodigosBarrasResult(TCodigosBarras value) {
        this.rmReemisionCodigosBarrasResult = value;
    }

}
