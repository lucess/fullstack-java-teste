/**
 * AereoBilhete.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class AereoBilhete  implements java.io.Serializable {
    private java.lang.Integer[] idPassageiroRef;

    private java.lang.String bilhete;

    private java.lang.String bilheteOriginal;

    private java.lang.Boolean isLocalizador;

    private java.lang.String numeroRecibo;

    private java.lang.String tourCode;

    public AereoBilhete() {
    }

    public AereoBilhete(
           java.lang.Integer[] idPassageiroRef,
           java.lang.String bilhete,
           java.lang.String bilheteOriginal,
           java.lang.Boolean isLocalizador,
           java.lang.String numeroRecibo,
           java.lang.String tourCode) {
           this.idPassageiroRef = idPassageiroRef;
           this.bilhete = bilhete;
           this.bilheteOriginal = bilheteOriginal;
           this.isLocalizador = isLocalizador;
           this.numeroRecibo = numeroRecibo;
           this.tourCode = tourCode;
    }


    /**
     * Gets the idPassageiroRef value for this AereoBilhete.
     * 
     * @return idPassageiroRef
     */
    public java.lang.Integer[] getIdPassageiroRef() {
        return idPassageiroRef;
    }


    /**
     * Sets the idPassageiroRef value for this AereoBilhete.
     * 
     * @param idPassageiroRef
     */
    public void setIdPassageiroRef(java.lang.Integer[] idPassageiroRef) {
        this.idPassageiroRef = idPassageiroRef;
    }

    public java.lang.Integer getIdPassageiroRef(int i) {
        return this.idPassageiroRef[i];
    }

    public void setIdPassageiroRef(int i, java.lang.Integer _value) {
        this.idPassageiroRef[i] = _value;
    }


    /**
     * Gets the bilhete value for this AereoBilhete.
     * 
     * @return bilhete
     */
    public java.lang.String getBilhete() {
        return bilhete;
    }


    /**
     * Sets the bilhete value for this AereoBilhete.
     * 
     * @param bilhete
     */
    public void setBilhete(java.lang.String bilhete) {
        this.bilhete = bilhete;
    }


    /**
     * Gets the bilheteOriginal value for this AereoBilhete.
     * 
     * @return bilheteOriginal
     */
    public java.lang.String getBilheteOriginal() {
        return bilheteOriginal;
    }


    /**
     * Sets the bilheteOriginal value for this AereoBilhete.
     * 
     * @param bilheteOriginal
     */
    public void setBilheteOriginal(java.lang.String bilheteOriginal) {
        this.bilheteOriginal = bilheteOriginal;
    }


    /**
     * Gets the isLocalizador value for this AereoBilhete.
     * 
     * @return isLocalizador
     */
    public java.lang.Boolean getIsLocalizador() {
        return isLocalizador;
    }


    /**
     * Sets the isLocalizador value for this AereoBilhete.
     * 
     * @param isLocalizador
     */
    public void setIsLocalizador(java.lang.Boolean isLocalizador) {
        this.isLocalizador = isLocalizador;
    }


    /**
     * Gets the numeroRecibo value for this AereoBilhete.
     * 
     * @return numeroRecibo
     */
    public java.lang.String getNumeroRecibo() {
        return numeroRecibo;
    }


    /**
     * Sets the numeroRecibo value for this AereoBilhete.
     * 
     * @param numeroRecibo
     */
    public void setNumeroRecibo(java.lang.String numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }


    /**
     * Gets the tourCode value for this AereoBilhete.
     * 
     * @return tourCode
     */
    public java.lang.String getTourCode() {
        return tourCode;
    }


    /**
     * Sets the tourCode value for this AereoBilhete.
     * 
     * @param tourCode
     */
    public void setTourCode(java.lang.String tourCode) {
        this.tourCode = tourCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AereoBilhete)) return false;
        AereoBilhete other = (AereoBilhete) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idPassageiroRef==null && other.getIdPassageiroRef()==null) || 
             (this.idPassageiroRef!=null &&
              java.util.Arrays.equals(this.idPassageiroRef, other.getIdPassageiroRef()))) &&
            ((this.bilhete==null && other.getBilhete()==null) || 
             (this.bilhete!=null &&
              this.bilhete.equals(other.getBilhete()))) &&
            ((this.bilheteOriginal==null && other.getBilheteOriginal()==null) || 
             (this.bilheteOriginal!=null &&
              this.bilheteOriginal.equals(other.getBilheteOriginal()))) &&
            ((this.isLocalizador==null && other.getIsLocalizador()==null) || 
             (this.isLocalizador!=null &&
              this.isLocalizador.equals(other.getIsLocalizador()))) &&
            ((this.numeroRecibo==null && other.getNumeroRecibo()==null) || 
             (this.numeroRecibo!=null &&
              this.numeroRecibo.equals(other.getNumeroRecibo()))) &&
            ((this.tourCode==null && other.getTourCode()==null) || 
             (this.tourCode!=null &&
              this.tourCode.equals(other.getTourCode())));
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
        if (getIdPassageiroRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdPassageiroRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdPassageiroRef(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBilhete() != null) {
            _hashCode += getBilhete().hashCode();
        }
        if (getBilheteOriginal() != null) {
            _hashCode += getBilheteOriginal().hashCode();
        }
        if (getIsLocalizador() != null) {
            _hashCode += getIsLocalizador().hashCode();
        }
        if (getNumeroRecibo() != null) {
            _hashCode += getNumeroRecibo().hashCode();
        }
        if (getTourCode() != null) {
            _hashCode += getTourCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AereoBilhete.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoBilhete"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPassageiroRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPassageiroRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilhete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bilhete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilheteOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bilheteOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLocalizador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isLocalizador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRecibo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroRecibo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tourCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tourCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
