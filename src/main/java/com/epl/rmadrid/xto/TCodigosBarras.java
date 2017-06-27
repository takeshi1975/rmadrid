
package com.epl.rmadrid.xto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TCodigosBarras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TCodigosBarras">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numOperacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArrayImagenes" type="{http://tempuri.org/}ArrayOfBase64Binary" minOccurs="0"/>
 *         &lt;element name="ArrayCodigos" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ArrayEntradas" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCodigosBarras", propOrder = {
    "numOperacion",
    "cantidad",
    "arrayImagenes",
    "arrayCodigos",
    "arrayEntradas"
})
public class TCodigosBarras {

    protected long numOperacion;
    protected long cantidad;
    @XmlElement(name = "ArrayImagenes")
    protected ArrayOfBase64Binary arrayImagenes;
    @XmlElement(name = "ArrayCodigos")
    protected ArrayOfString arrayCodigos;
    @XmlElement(name = "ArrayEntradas")
    protected ArrayOfString arrayEntradas;

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

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public long getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(long value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayImagenes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBase64Binary }
     *     
     */
    public ArrayOfBase64Binary getArrayImagenes() {
        return arrayImagenes;
    }

    /**
     * Define el valor de la propiedad arrayImagenes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBase64Binary }
     *     
     */
    public void setArrayImagenes(ArrayOfBase64Binary value) {
        this.arrayImagenes = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayCodigos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getArrayCodigos() {
        return arrayCodigos;
    }

    /**
     * Define el valor de la propiedad arrayCodigos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setArrayCodigos(ArrayOfString value) {
        this.arrayCodigos = value;
    }

    /**
     * Obtiene el valor de la propiedad arrayEntradas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getArrayEntradas() {
        return arrayEntradas;
    }

    /**
     * Define el valor de la propiedad arrayEntradas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setArrayEntradas(ArrayOfString value) {
        this.arrayEntradas = value;
    }

}
