/**
 * FinalizarSolicitacaoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.services.request;

public class FinalizarSolicitacaoRequest  implements java.io.Serializable {
    private int idSolicitacao;

    private java.lang.String controleClienteSolicitacao;

    /* Funcionario que concluiu a solicitacao */
    private br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionario;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.AereoFinalizar[] aereoFinalizar;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.HotelFinalizar[] hotelFinalizar;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.CarroFinalizar[] carroFinalizar;

    public FinalizarSolicitacaoRequest() {
    }

    public FinalizarSolicitacaoRequest(
           int idSolicitacao,
           java.lang.String controleClienteSolicitacao,
           br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionario,
           br.com.lemontech.selfbooking.wsselfbooking.beans.AereoFinalizar[] aereoFinalizar,
           br.com.lemontech.selfbooking.wsselfbooking.beans.HotelFinalizar[] hotelFinalizar,
           br.com.lemontech.selfbooking.wsselfbooking.beans.CarroFinalizar[] carroFinalizar) {
           this.idSolicitacao = idSolicitacao;
           this.controleClienteSolicitacao = controleClienteSolicitacao;
           this.funcionario = funcionario;
           this.aereoFinalizar = aereoFinalizar;
           this.hotelFinalizar = hotelFinalizar;
           this.carroFinalizar = carroFinalizar;
    }


    /**
     * Gets the idSolicitacao value for this FinalizarSolicitacaoRequest.
     * 
     * @return idSolicitacao
     */
    public int getIdSolicitacao() {
        return idSolicitacao;
    }


    /**
     * Sets the idSolicitacao value for this FinalizarSolicitacaoRequest.
     * 
     * @param idSolicitacao
     */
    public void setIdSolicitacao(int idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }


    /**
     * Gets the controleClienteSolicitacao value for this FinalizarSolicitacaoRequest.
     * 
     * @return controleClienteSolicitacao
     */
    public java.lang.String getControleClienteSolicitacao() {
        return controleClienteSolicitacao;
    }


    /**
     * Sets the controleClienteSolicitacao value for this FinalizarSolicitacaoRequest.
     * 
     * @param controleClienteSolicitacao
     */
    public void setControleClienteSolicitacao(java.lang.String controleClienteSolicitacao) {
        this.controleClienteSolicitacao = controleClienteSolicitacao;
    }


    /**
     * Gets the funcionario value for this FinalizarSolicitacaoRequest.
     * 
     * @return funcionario   * Funcionario que concluiu a solicitacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef getFuncionario() {
        return funcionario;
    }


    /**
     * Sets the funcionario value for this FinalizarSolicitacaoRequest.
     * 
     * @param funcionario   * Funcionario que concluiu a solicitacao
     */
    public void setFuncionario(br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef funcionario) {
        this.funcionario = funcionario;
    }


    /**
     * Gets the aereoFinalizar value for this FinalizarSolicitacaoRequest.
     * 
     * @return aereoFinalizar
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.AereoFinalizar[] getAereoFinalizar() {
        return aereoFinalizar;
    }


    /**
     * Sets the aereoFinalizar value for this FinalizarSolicitacaoRequest.
     * 
     * @param aereoFinalizar
     */
    public void setAereoFinalizar(br.com.lemontech.selfbooking.wsselfbooking.beans.AereoFinalizar[] aereoFinalizar) {
        this.aereoFinalizar = aereoFinalizar;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.AereoFinalizar getAereoFinalizar(int i) {
        return this.aereoFinalizar[i];
    }

    public void setAereoFinalizar(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.AereoFinalizar _value) {
        this.aereoFinalizar[i] = _value;
    }


    /**
     * Gets the hotelFinalizar value for this FinalizarSolicitacaoRequest.
     * 
     * @return hotelFinalizar
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.HotelFinalizar[] getHotelFinalizar() {
        return hotelFinalizar;
    }


    /**
     * Sets the hotelFinalizar value for this FinalizarSolicitacaoRequest.
     * 
     * @param hotelFinalizar
     */
    public void setHotelFinalizar(br.com.lemontech.selfbooking.wsselfbooking.beans.HotelFinalizar[] hotelFinalizar) {
        this.hotelFinalizar = hotelFinalizar;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.HotelFinalizar getHotelFinalizar(int i) {
        return this.hotelFinalizar[i];
    }

    public void setHotelFinalizar(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.HotelFinalizar _value) {
        this.hotelFinalizar[i] = _value;
    }


    /**
     * Gets the carroFinalizar value for this FinalizarSolicitacaoRequest.
     * 
     * @return carroFinalizar
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.CarroFinalizar[] getCarroFinalizar() {
        return carroFinalizar;
    }


    /**
     * Sets the carroFinalizar value for this FinalizarSolicitacaoRequest.
     * 
     * @param carroFinalizar
     */
    public void setCarroFinalizar(br.com.lemontech.selfbooking.wsselfbooking.beans.CarroFinalizar[] carroFinalizar) {
        this.carroFinalizar = carroFinalizar;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.CarroFinalizar getCarroFinalizar(int i) {
        return this.carroFinalizar[i];
    }

    public void setCarroFinalizar(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.CarroFinalizar _value) {
        this.carroFinalizar[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FinalizarSolicitacaoRequest)) return false;
        FinalizarSolicitacaoRequest other = (FinalizarSolicitacaoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idSolicitacao == other.getIdSolicitacao() &&
            ((this.controleClienteSolicitacao==null && other.getControleClienteSolicitacao()==null) || 
             (this.controleClienteSolicitacao!=null &&
              this.controleClienteSolicitacao.equals(other.getControleClienteSolicitacao()))) &&
            ((this.funcionario==null && other.getFuncionario()==null) || 
             (this.funcionario!=null &&
              this.funcionario.equals(other.getFuncionario()))) &&
            ((this.aereoFinalizar==null && other.getAereoFinalizar()==null) || 
             (this.aereoFinalizar!=null &&
              java.util.Arrays.equals(this.aereoFinalizar, other.getAereoFinalizar()))) &&
            ((this.hotelFinalizar==null && other.getHotelFinalizar()==null) || 
             (this.hotelFinalizar!=null &&
              java.util.Arrays.equals(this.hotelFinalizar, other.getHotelFinalizar()))) &&
            ((this.carroFinalizar==null && other.getCarroFinalizar()==null) || 
             (this.carroFinalizar!=null &&
              java.util.Arrays.equals(this.carroFinalizar, other.getCarroFinalizar())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getIdSolicitacao();
        if (getControleClienteSolicitacao() != null) {
            _hashCode += getControleClienteSolicitacao().hashCode();
        }
        if (getFuncionario() != null) {
            _hashCode += getFuncionario().hashCode();
        }
        if (getAereoFinalizar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAereoFinalizar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAereoFinalizar(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHotelFinalizar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHotelFinalizar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHotelFinalizar(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCarroFinalizar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarroFinalizar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarroFinalizar(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FinalizarSolicitacaoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "finalizarSolicitacaoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controleClienteSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controleClienteSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "funcionarioRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereoFinalizar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereoFinalizar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "aereoFinalizar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelFinalizar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hotelFinalizar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "hotelFinalizar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carroFinalizar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carroFinalizar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "carroFinalizar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
