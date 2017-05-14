
package org.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlRootElement(name = "RMEmisionCodigosBarrasDesactivados")
public class RMEmisionCodigosBarrasDesactivados {

    protected long idEntidad;
    protected long idConcepto;
    protected long idTipoCliente;
    protected int cantidad;

    /**
     * Obtiene el valor de la propiedad idEntidad.
     * 
     */
    public long getIdEntidad() {
        return idEntidad;
    }

    /**
     * Define el valor de la propiedad idEntidad.
     * 
     */
    public void setIdEntidad(long value) {
        this.idEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idConcepto.
     * 
     */
    public long getIdConcepto() {
        return idConcepto;
    }

    /**
     * Define el valor de la propiedad idConcepto.
     * 
     */
    public void setIdConcepto(long value) {
        this.idConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoCliente.
     * 
     */
    public long getIdTipoCliente() {
        return idTipoCliente;
    }

    /**
     * Define el valor de la propiedad idTipoCliente.
     * 
     */
    public void setIdTipoCliente(long value) {
        this.idTipoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

}
