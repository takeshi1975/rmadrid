
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
 *         &lt;element name="RMActivarEntradaResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "rmActivarEntradaResult"
})
@XmlRootElement(name = "RMActivarEntradaResponse")
public class RMActivarEntradaResponse {

    @XmlElement(name = "RMActivarEntradaResult")
    protected boolean rmActivarEntradaResult;

    /**
     * Gets the value of the rmActivarEntradaResult property.
     * 
     */
    public boolean isRMActivarEntradaResult() {
        return rmActivarEntradaResult;
    }

    /**
     * Sets the value of the rmActivarEntradaResult property.
     * 
     */
    public void setRMActivarEntradaResult(boolean value) {
        this.rmActivarEntradaResult = value;
    }

}
