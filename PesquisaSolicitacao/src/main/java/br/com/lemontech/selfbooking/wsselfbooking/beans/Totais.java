/**
 * Totais.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans;

public class Totais  implements java.io.Serializable {
    private java.lang.Double totalSolicitacao;

    private java.lang.Double totalAereos;

    private java.lang.Double totalHoteis;

    private java.lang.Double totalCarros;

    private java.lang.Double totalOutros;

    private java.lang.Double totalFee;

    private java.lang.Double totalSeguros;

    private java.lang.Double totalTraslados;

    private java.lang.Double totalRodoviarios;

    public Totais() {
    }

    public Totais(
           java.lang.Double totalSolicitacao,
           java.lang.Double totalAereos,
           java.lang.Double totalHoteis,
           java.lang.Double totalCarros,
           java.lang.Double totalOutros,
           java.lang.Double totalFee,
           java.lang.Double totalSeguros,
           java.lang.Double totalTraslados,
           java.lang.Double totalRodoviarios) {
           this.totalSolicitacao = totalSolicitacao;
           this.totalAereos = totalAereos;
           this.totalHoteis = totalHoteis;
           this.totalCarros = totalCarros;
           this.totalOutros = totalOutros;
           this.totalFee = totalFee;
           this.totalSeguros = totalSeguros;
           this.totalTraslados = totalTraslados;
           this.totalRodoviarios = totalRodoviarios;
    }


    /**
     * Gets the totalSolicitacao value for this Totais.
     * 
     * @return totalSolicitacao
     */
    public java.lang.Double getTotalSolicitacao() {
        return totalSolicitacao;
    }


    /**
     * Sets the totalSolicitacao value for this Totais.
     * 
     * @param totalSolicitacao
     */
    public void setTotalSolicitacao(java.lang.Double totalSolicitacao) {
        this.totalSolicitacao = totalSolicitacao;
    }


    /**
     * Gets the totalAereos value for this Totais.
     * 
     * @return totalAereos
     */
    public java.lang.Double getTotalAereos() {
        return totalAereos;
    }


    /**
     * Sets the totalAereos value for this Totais.
     * 
     * @param totalAereos
     */
    public void setTotalAereos(java.lang.Double totalAereos) {
        this.totalAereos = totalAereos;
    }


    /**
     * Gets the totalHoteis value for this Totais.
     * 
     * @return totalHoteis
     */
    public java.lang.Double getTotalHoteis() {
        return totalHoteis;
    }


    /**
     * Sets the totalHoteis value for this Totais.
     * 
     * @param totalHoteis
     */
    public void setTotalHoteis(java.lang.Double totalHoteis) {
        this.totalHoteis = totalHoteis;
    }


    /**
     * Gets the totalCarros value for this Totais.
     * 
     * @return totalCarros
     */
    public java.lang.Double getTotalCarros() {
        return totalCarros;
    }


    /**
     * Sets the totalCarros value for this Totais.
     * 
     * @param totalCarros
     */
    public void setTotalCarros(java.lang.Double totalCarros) {
        this.totalCarros = totalCarros;
    }


    /**
     * Gets the totalOutros value for this Totais.
     * 
     * @return totalOutros
     */
    public java.lang.Double getTotalOutros() {
        return totalOutros;
    }


    /**
     * Sets the totalOutros value for this Totais.
     * 
     * @param totalOutros
     */
    public void setTotalOutros(java.lang.Double totalOutros) {
        this.totalOutros = totalOutros;
    }


    /**
     * Gets the totalFee value for this Totais.
     * 
     * @return totalFee
     */
    public java.lang.Double getTotalFee() {
        return totalFee;
    }


    /**
     * Sets the totalFee value for this Totais.
     * 
     * @param totalFee
     */
    public void setTotalFee(java.lang.Double totalFee) {
        this.totalFee = totalFee;
    }


    /**
     * Gets the totalSeguros value for this Totais.
     * 
     * @return totalSeguros
     */
    public java.lang.Double getTotalSeguros() {
        return totalSeguros;
    }


    /**
     * Sets the totalSeguros value for this Totais.
     * 
     * @param totalSeguros
     */
    public void setTotalSeguros(java.lang.Double totalSeguros) {
        this.totalSeguros = totalSeguros;
    }


    /**
     * Gets the totalTraslados value for this Totais.
     * 
     * @return totalTraslados
     */
    public java.lang.Double getTotalTraslados() {
        return totalTraslados;
    }


    /**
     * Sets the totalTraslados value for this Totais.
     * 
     * @param totalTraslados
     */
    public void setTotalTraslados(java.lang.Double totalTraslados) {
        this.totalTraslados = totalTraslados;
    }


    /**
     * Gets the totalRodoviarios value for this Totais.
     * 
     * @return totalRodoviarios
     */
    public java.lang.Double getTotalRodoviarios() {
        return totalRodoviarios;
    }


    /**
     * Sets the totalRodoviarios value for this Totais.
     * 
     * @param totalRodoviarios
     */
    public void setTotalRodoviarios(java.lang.Double totalRodoviarios) {
        this.totalRodoviarios = totalRodoviarios;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Totais)) return false;
        Totais other = (Totais) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalSolicitacao==null && other.getTotalSolicitacao()==null) || 
             (this.totalSolicitacao!=null &&
              this.totalSolicitacao.equals(other.getTotalSolicitacao()))) &&
            ((this.totalAereos==null && other.getTotalAereos()==null) || 
             (this.totalAereos!=null &&
              this.totalAereos.equals(other.getTotalAereos()))) &&
            ((this.totalHoteis==null && other.getTotalHoteis()==null) || 
             (this.totalHoteis!=null &&
              this.totalHoteis.equals(other.getTotalHoteis()))) &&
            ((this.totalCarros==null && other.getTotalCarros()==null) || 
             (this.totalCarros!=null &&
              this.totalCarros.equals(other.getTotalCarros()))) &&
            ((this.totalOutros==null && other.getTotalOutros()==null) || 
             (this.totalOutros!=null &&
              this.totalOutros.equals(other.getTotalOutros()))) &&
            ((this.totalFee==null && other.getTotalFee()==null) || 
             (this.totalFee!=null &&
              this.totalFee.equals(other.getTotalFee()))) &&
            ((this.totalSeguros==null && other.getTotalSeguros()==null) || 
             (this.totalSeguros!=null &&
              this.totalSeguros.equals(other.getTotalSeguros()))) &&
            ((this.totalTraslados==null && other.getTotalTraslados()==null) || 
             (this.totalTraslados!=null &&
              this.totalTraslados.equals(other.getTotalTraslados()))) &&
            ((this.totalRodoviarios==null && other.getTotalRodoviarios()==null) || 
             (this.totalRodoviarios!=null &&
              this.totalRodoviarios.equals(other.getTotalRodoviarios())));
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
        if (getTotalSolicitacao() != null) {
            _hashCode += getTotalSolicitacao().hashCode();
        }
        if (getTotalAereos() != null) {
            _hashCode += getTotalAereos().hashCode();
        }
        if (getTotalHoteis() != null) {
            _hashCode += getTotalHoteis().hashCode();
        }
        if (getTotalCarros() != null) {
            _hashCode += getTotalCarros().hashCode();
        }
        if (getTotalOutros() != null) {
            _hashCode += getTotalOutros().hashCode();
        }
        if (getTotalFee() != null) {
            _hashCode += getTotalFee().hashCode();
        }
        if (getTotalSeguros() != null) {
            _hashCode += getTotalSeguros().hashCode();
        }
        if (getTotalTraslados() != null) {
            _hashCode += getTotalTraslados().hashCode();
        }
        if (getTotalRodoviarios() != null) {
            _hashCode += getTotalRodoviarios().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Totais.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans", "totais"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAereos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAereos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHoteis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalHoteis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCarros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCarros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalOutros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSeguros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalSeguros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTraslados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalTraslados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRodoviarios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRodoviarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
