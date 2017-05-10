
package org.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idEntidad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numOperacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "idEntidad",
    "numOperacion"
})
@XmlRootElement(name = "RMReemisionCodigosBarras")
public class RMReemisionCodigosBarras {

    protected long idEntidad;
    protected long numOperacion;

    /**
     * Gets the value of the idEntidad property.
     * 
     */
    public long getIdEntidad() {
        return idEntidad;
    }

    /**
     * Sets the value of the idEntidad property.
     * 
     */
    public void setIdEntidad(long value) {
        this.idEntidad = value;
    }

    /**
     * Gets the value of the numOperacion property.
     * 
     */
    public long getNumOperacion() {
        return numOperacion;
    }

    /**
     * Sets the value of the numOperacion property.
     * 
     */
    public void setNumOperacion(long value) {
        this.numOperacion = value;
    }

}
