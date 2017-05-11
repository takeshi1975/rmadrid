
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TCodigosBarras complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public long getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(long value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the arrayImagenes property.
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
     * Sets the value of the arrayImagenes property.
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
     * Gets the value of the arrayCodigos property.
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
     * Sets the value of the arrayCodigos property.
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
     * Gets the value of the arrayEntradas property.
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
     * Sets the value of the arrayEntradas property.
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
