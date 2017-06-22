
package org.rm.xto;

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
     * Obtiene el valor de la propiedad numOperacion.
     * 
     */
    public long getNumOperacion() {
        return numOperacion;
    }

    /**
     * Define el valor de la propiedad numOperacion.
     * 
     */
    public void setNumOperacion(long value) {
        this.numOperacion = value;
    }

}
