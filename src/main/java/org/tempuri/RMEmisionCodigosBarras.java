
package org.tempuri;

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
 *         &lt;element name="idConcepto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idTipoCliente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idConcepto",
    "idTipoCliente",
    "cantidad"
})
@XmlRootElement(name = "RMEmisionCodigosBarras")
public class RMEmisionCodigosBarras {

    protected long idEntidad;
    protected long idConcepto;
    protected long idTipoCliente;
    protected int cantidad;

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
     * Gets the value of the idConcepto property.
     * 
     */
    public long getIdConcepto() {
        return idConcepto;
    }

    /**
     * Sets the value of the idConcepto property.
     * 
     */
    public void setIdConcepto(long value) {
        this.idConcepto = value;
    }

    /**
     * Gets the value of the idTipoCliente property.
     * 
     */
    public long getIdTipoCliente() {
        return idTipoCliente;
    }

    /**
     * Sets the value of the idTipoCliente property.
     * 
     */
    public void setIdTipoCliente(long value) {
        this.idTipoCliente = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

}
