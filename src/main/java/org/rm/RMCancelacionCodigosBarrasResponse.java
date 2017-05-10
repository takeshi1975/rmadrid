
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
     * Gets the value of the rmCancelacionCodigosBarrasResult property.
     * 
     */
    public boolean isRMCancelacionCodigosBarrasResult() {
        return rmCancelacionCodigosBarrasResult;
    }

    /**
     * Sets the value of the rmCancelacionCodigosBarrasResult property.
     * 
     */
    public void setRMCancelacionCodigosBarrasResult(boolean value) {
        this.rmCancelacionCodigosBarrasResult = value;
    }

}
