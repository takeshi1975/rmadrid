
package org.rm;

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
     * Gets the value of the rmEmisionCodigosBarrasResult property.
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
     * Sets the value of the rmEmisionCodigosBarrasResult property.
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
