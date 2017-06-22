
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
 *         &lt;element name="idEntrada" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "idEntrada"
})
@XmlRootElement(name = "RMActivarEntrada")
public class RMActivarEntrada {

    protected long idEntidad;
    protected long idEntrada;

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
     * Obtiene el valor de la propiedad idEntrada.
     * 
     */
    public long getIdEntrada() {
        return idEntrada;
    }

    /**
     * Define el valor de la propiedad idEntrada.
     * 
     */
    public void setIdEntrada(long value) {
        this.idEntrada = value;
    }

}
