
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.rm;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2017-05-09T15:37:47.769+02:00
 * Generated source version: 2.4.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "SW_GesauroRM",
                      portName = "SW_GesauroRMSoap12",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "file:/C:/Users/desar/workspace/realmadrid/wsdl/rm.wsdl",
                      endpointInterface = "org.rm.SWGesauroRMSoap")
                      
public class SWGesauroRMSoapImpl implements SWGesauroRMSoap {

    private static final Logger LOG = Logger.getLogger(SWGesauroRMSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see org.rm.SWGesauroRMSoap#rmReemisionCodigosBarras(long  idEntidad ,)long  numOperacion )*
     */
    public org.rm.TCodigosBarras rmReemisionCodigosBarras(long idEntidad,long numOperacion) { 
        LOG.info("Executing operation rmReemisionCodigosBarras");
        System.out.println(idEntidad);
        System.out.println(numOperacion);
        try {
            org.rm.TCodigosBarras _return = new org.rm.TCodigosBarras();
            _return.setNumOperacion(7433644120788844199l);
            _return.setCantidad(8284237806810819962l);
            org.rm.ArrayOfBase64Binary _returnArrayImagenes = new org.rm.ArrayOfBase64Binary();
            java.util.List<byte[]> _returnArrayImagenesBase64Binary = new java.util.ArrayList<byte[]>();
            byte[] _returnArrayImagenesBase64BinaryVal1 = new byte[] {};
            _returnArrayImagenesBase64Binary.add(_returnArrayImagenesBase64BinaryVal1);
            _returnArrayImagenes.getBase64Binary().addAll(_returnArrayImagenesBase64Binary);
            _return.setArrayImagenes(_returnArrayImagenes);
            org.rm.ArrayOfString _returnArrayCodigos = new org.rm.ArrayOfString();
            java.util.List<java.lang.String> _returnArrayCodigosString = new java.util.ArrayList<java.lang.String>();
            java.lang.String _returnArrayCodigosStringVal1 = "_returnArrayCodigosStringVal-1310422108";
            _returnArrayCodigosString.add(_returnArrayCodigosStringVal1);
            _returnArrayCodigos.getString().addAll(_returnArrayCodigosString);
            _return.setArrayCodigos(_returnArrayCodigos);
            org.rm.ArrayOfString _returnArrayEntradas = new org.rm.ArrayOfString();
            java.util.List<java.lang.String> _returnArrayEntradasString = new java.util.ArrayList<java.lang.String>();
            java.lang.String _returnArrayEntradasStringVal1 = "_returnArrayEntradasStringVal43958325";
            _returnArrayEntradasString.add(_returnArrayEntradasStringVal1);
            _returnArrayEntradas.getString().addAll(_returnArrayEntradasString);
            _return.setArrayEntradas(_returnArrayEntradas);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.rm.SWGesauroRMSoap#rmEmisionCodigosBarrasDesactivados(long  idEntidad ,)long  idConcepto ,)long  idTipoCliente ,)int  cantidad )*
     */
    public org.rm.TCodigosBarras rmEmisionCodigosBarrasDesactivados(long idEntidad,long idConcepto,long idTipoCliente,int cantidad) { 
        LOG.info("Executing operation rmEmisionCodigosBarrasDesactivados");
        System.out.println(idEntidad);
        System.out.println(idConcepto);
        System.out.println(idTipoCliente);
        System.out.println(cantidad);
        try {
            org.rm.TCodigosBarras _return = new org.rm.TCodigosBarras();
            _return.setNumOperacion(71995291783632750l);
            _return.setCantidad(3799861130235367777l);
            org.rm.ArrayOfBase64Binary _returnArrayImagenes = new org.rm.ArrayOfBase64Binary();
            java.util.List<byte[]> _returnArrayImagenesBase64Binary = new java.util.ArrayList<byte[]>();
            byte[] _returnArrayImagenesBase64BinaryVal1 = new byte[] {};
            _returnArrayImagenesBase64Binary.add(_returnArrayImagenesBase64BinaryVal1);
            _returnArrayImagenes.getBase64Binary().addAll(_returnArrayImagenesBase64Binary);
            _return.setArrayImagenes(_returnArrayImagenes);
            org.rm.ArrayOfString _returnArrayCodigos = new org.rm.ArrayOfString();
            java.util.List<java.lang.String> _returnArrayCodigosString = new java.util.ArrayList<java.lang.String>();
            java.lang.String _returnArrayCodigosStringVal1 = "_returnArrayCodigosStringVal-1831526358";
            _returnArrayCodigosString.add(_returnArrayCodigosStringVal1);
            _returnArrayCodigos.getString().addAll(_returnArrayCodigosString);
            _return.setArrayCodigos(_returnArrayCodigos);
            org.rm.ArrayOfString _returnArrayEntradas = new org.rm.ArrayOfString();
            java.util.List<java.lang.String> _returnArrayEntradasString = new java.util.ArrayList<java.lang.String>();
            java.lang.String _returnArrayEntradasStringVal1 = "_returnArrayEntradasStringVal746645751";
            _returnArrayEntradasString.add(_returnArrayEntradasStringVal1);
            _returnArrayEntradas.getString().addAll(_returnArrayEntradasString);
            _return.setArrayEntradas(_returnArrayEntradas);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.rm.SWGesauroRMSoap#rmCodigoUsado(long  idEntidad ,)long  idEntrada )*
     */
    public boolean rmCodigoUsado(long idEntidad,long idEntrada) { 
        LOG.info("Executing operation rmCodigoUsado");
        System.out.println(idEntidad);
        System.out.println(idEntrada);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.rm.SWGesauroRMSoap#rmEmisionCodigosBarras(long  idEntidad ,)long  idConcepto ,)long  idTipoCliente ,)int  cantidad )*
     */
    public org.rm.TCodigosBarras rmEmisionCodigosBarras(long idEntidad,long idConcepto,long idTipoCliente,int cantidad) { 
        LOG.info("Executing operation rmEmisionCodigosBarras");
        System.out.println(idEntidad);
        System.out.println(idConcepto);
        System.out.println(idTipoCliente);
        System.out.println(cantidad);
        try {
            org.rm.TCodigosBarras _return = new org.rm.TCodigosBarras();
            _return.setNumOperacion(7206131602230573563l);
            _return.setCantidad(8401011399892741393l);
            org.rm.ArrayOfBase64Binary _returnArrayImagenes = new org.rm.ArrayOfBase64Binary();
            java.util.List<byte[]> _returnArrayImagenesBase64Binary = new java.util.ArrayList<byte[]>();
            byte[] _returnArrayImagenesBase64BinaryVal1 = new byte[] {};
            _returnArrayImagenesBase64Binary.add(_returnArrayImagenesBase64BinaryVal1);
            _returnArrayImagenes.getBase64Binary().addAll(_returnArrayImagenesBase64Binary);
            _return.setArrayImagenes(_returnArrayImagenes);
            org.rm.ArrayOfString _returnArrayCodigos = new org.rm.ArrayOfString();
            java.util.List<java.lang.String> _returnArrayCodigosString = new java.util.ArrayList<java.lang.String>();
            java.lang.String _returnArrayCodigosStringVal1 = "_returnArrayCodigosStringVal-1099236922";
            _returnArrayCodigosString.add(_returnArrayCodigosStringVal1);
            _returnArrayCodigos.getString().addAll(_returnArrayCodigosString);
            _return.setArrayCodigos(_returnArrayCodigos);
            org.rm.ArrayOfString _returnArrayEntradas = new org.rm.ArrayOfString();
            java.util.List<java.lang.String> _returnArrayEntradasString = new java.util.ArrayList<java.lang.String>();
            java.lang.String _returnArrayEntradasStringVal1 = "_returnArrayEntradasStringVal39313679";
            _returnArrayEntradasString.add(_returnArrayEntradasStringVal1);
            _returnArrayEntradas.getString().addAll(_returnArrayEntradasString);
            _return.setArrayEntradas(_returnArrayEntradas);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.rm.SWGesauroRMSoap#rmDesactivarEntrada(long  idEntidad ,)long  idEntrada )*
     */
    public boolean rmDesactivarEntrada(long idEntidad,long idEntrada) { 
        LOG.info("Executing operation rmDesactivarEntrada");
        System.out.println(idEntidad);
        System.out.println(idEntrada);
        try {
            boolean _return = true;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.rm.SWGesauroRMSoap#rmActivarEntrada(long  idEntidad ,)long  idEntrada )*
     */
    public boolean rmActivarEntrada(long idEntidad,long idEntrada) { 
        LOG.info("Executing operation rmActivarEntrada");
        System.out.println(idEntidad);
        System.out.println(idEntrada);
        try {
            boolean _return = true;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.rm.SWGesauroRMSoap#rmCancelacionCodigosBarras(long  idEntidad ,)long  numOperacion )*
     */
    public boolean rmCancelacionCodigosBarras(long idEntidad,long numOperacion) { 
        LOG.info("Executing operation rmCancelacionCodigosBarras");
        System.out.println(idEntidad);
        System.out.println(numOperacion);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.rm.SWGesauroRMSoap#rmCancelacionEntrada(long  idEntidad ,)long  idEntrada )*
     */
    public boolean rmCancelacionEntrada(long idEntidad,long idEntrada) { 
        LOG.info("Executing operation rmCancelacionEntrada");
        System.out.println(idEntidad);
        System.out.println(idEntrada);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
