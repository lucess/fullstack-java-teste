/**
 * AereoSeguimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class AereoSeguimento  implements java.io.Serializable {
    private java.lang.String origem;

    private java.util.Calendar dataSaida;

    private java.lang.String destino;

    private java.util.Calendar dataChegada;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVoo[] aereoVoo;

    private java.lang.String localizadorCia;

    private java.lang.Double milhas;

    private java.lang.String paisOrigem;

    private java.lang.String estadoOrigem;

    private java.lang.String paisDestino;

    private java.lang.String estadoDestino;

    private java.lang.String cidadeOrigem;

    private java.lang.String cidadeDestino;

    private java.util.Calendar dataCancelada;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusCancelamento statusCancelamento;

    private java.lang.Boolean seguimentoCancelado;

    public AereoSeguimento() {
    }

    public AereoSeguimento(
           java.lang.String origem,
           java.util.Calendar dataSaida,
           java.lang.String destino,
           java.util.Calendar dataChegada,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVoo[] aereoVoo,
           java.lang.String localizadorCia,
           java.lang.Double milhas,
           java.lang.String paisOrigem,
           java.lang.String estadoOrigem,
           java.lang.String paisDestino,
           java.lang.String estadoDestino,
           java.lang.String cidadeOrigem,
           java.lang.String cidadeDestino,
           java.util.Calendar dataCancelada,
           br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusCancelamento statusCancelamento,
           java.lang.Boolean seguimentoCancelado) {
           this.origem = origem;
           this.dataSaida = dataSaida;
           this.destino = destino;
           this.dataChegada = dataChegada;
           this.aereoVoo = aereoVoo;
           this.localizadorCia = localizadorCia;
           this.milhas = milhas;
           this.paisOrigem = paisOrigem;
           this.estadoOrigem = estadoOrigem;
           this.paisDestino = paisDestino;
           this.estadoDestino = estadoDestino;
           this.cidadeOrigem = cidadeOrigem;
           this.cidadeDestino = cidadeDestino;
           this.dataCancelada = dataCancelada;
           this.statusCancelamento = statusCancelamento;
           this.seguimentoCancelado = seguimentoCancelado;
    }


    /**
     * Gets the origem value for this AereoSeguimento.
     * 
     * @return origem
     */
    public java.lang.String getOrigem() {
        return origem;
    }


    /**
     * Sets the origem value for this AereoSeguimento.
     * 
     * @param origem
     */
    public void setOrigem(java.lang.String origem) {
        this.origem = origem;
    }


    /**
     * Gets the dataSaida value for this AereoSeguimento.
     * 
     * @return dataSaida
     */
    public java.util.Calendar getDataSaida() {
        return dataSaida;
    }


    /**
     * Sets the dataSaida value for this AereoSeguimento.
     * 
     * @param dataSaida
     */
    public void setDataSaida(java.util.Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }


    /**
     * Gets the destino value for this AereoSeguimento.
     * 
     * @return destino
     */
    public java.lang.String getDestino() {
        return destino;
    }


    /**
     * Sets the destino value for this AereoSeguimento.
     * 
     * @param destino
     */
    public void setDestino(java.lang.String destino) {
        this.destino = destino;
    }


    /**
     * Gets the dataChegada value for this AereoSeguimento.
     * 
     * @return dataChegada
     */
    public java.util.Calendar getDataChegada() {
        return dataChegada;
    }


    /**
     * Sets the dataChegada value for this AereoSeguimento.
     * 
     * @param dataChegada
     */
    public void setDataChegada(java.util.Calendar dataChegada) {
        this.dataChegada = dataChegada;
    }


    /**
     * Gets the aereoVoo value for this AereoSeguimento.
     * 
     * @return aereoVoo
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVoo[] getAereoVoo() {
        return aereoVoo;
    }


    /**
     * Sets the aereoVoo value for this AereoSeguimento.
     * 
     * @param aereoVoo
     */
    public void setAereoVoo(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVoo[] aereoVoo) {
        this.aereoVoo = aereoVoo;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVoo getAereoVoo(int i) {
        return this.aereoVoo[i];
    }

    public void setAereoVoo(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVoo _value) {
        this.aereoVoo[i] = _value;
    }


    /**
     * Gets the localizadorCia value for this AereoSeguimento.
     * 
     * @return localizadorCia
     */
    public java.lang.String getLocalizadorCia() {
        return localizadorCia;
    }


    /**
     * Sets the localizadorCia value for this AereoSeguimento.
     * 
     * @param localizadorCia
     */
    public void setLocalizadorCia(java.lang.String localizadorCia) {
        this.localizadorCia = localizadorCia;
    }


    /**
     * Gets the milhas value for this AereoSeguimento.
     * 
     * @return milhas
     */
    public java.lang.Double getMilhas() {
        return milhas;
    }


    /**
     * Sets the milhas value for this AereoSeguimento.
     * 
     * @param milhas
     */
    public void setMilhas(java.lang.Double milhas) {
        this.milhas = milhas;
    }


    /**
     * Gets the paisOrigem value for this AereoSeguimento.
     * 
     * @return paisOrigem
     */
    public java.lang.String getPaisOrigem() {
        return paisOrigem;
    }


    /**
     * Sets the paisOrigem value for this AereoSeguimento.
     * 
     * @param paisOrigem
     */
    public void setPaisOrigem(java.lang.String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }


    /**
     * Gets the estadoOrigem value for this AereoSeguimento.
     * 
     * @return estadoOrigem
     */
    public java.lang.String getEstadoOrigem() {
        return estadoOrigem;
    }


    /**
     * Sets the estadoOrigem value for this AereoSeguimento.
     * 
     * @param estadoOrigem
     */
    public void setEstadoOrigem(java.lang.String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }


    /**
     * Gets the paisDestino value for this AereoSeguimento.
     * 
     * @return paisDestino
     */
    public java.lang.String getPaisDestino() {
        return paisDestino;
    }


    /**
     * Sets the paisDestino value for this AereoSeguimento.
     * 
     * @param paisDestino
     */
    public void setPaisDestino(java.lang.String paisDestino) {
        this.paisDestino = paisDestino;
    }


    /**
     * Gets the estadoDestino value for this AereoSeguimento.
     * 
     * @return estadoDestino
     */
    public java.lang.String getEstadoDestino() {
        return estadoDestino;
    }


    /**
     * Sets the estadoDestino value for this AereoSeguimento.
     * 
     * @param estadoDestino
     */
    public void setEstadoDestino(java.lang.String estadoDestino) {
        this.estadoDestino = estadoDestino;
    }


    /**
     * Gets the cidadeOrigem value for this AereoSeguimento.
     * 
     * @return cidadeOrigem
     */
    public java.lang.String getCidadeOrigem() {
        return cidadeOrigem;
    }


    /**
     * Sets the cidadeOrigem value for this AereoSeguimento.
     * 
     * @param cidadeOrigem
     */
    public void setCidadeOrigem(java.lang.String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }


    /**
     * Gets the cidadeDestino value for this AereoSeguimento.
     * 
     * @return cidadeDestino
     */
    public java.lang.String getCidadeDestino() {
        return cidadeDestino;
    }


    /**
     * Sets the cidadeDestino value for this AereoSeguimento.
     * 
     * @param cidadeDestino
     */
    public void setCidadeDestino(java.lang.String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }


    /**
     * Gets the dataCancelada value for this AereoSeguimento.
     * 
     * @return dataCancelada
     */
    public java.util.Calendar getDataCancelada() {
        return dataCancelada;
    }


    /**
     * Sets the dataCancelada value for this AereoSeguimento.
     * 
     * @param dataCancelada
     */
    public void setDataCancelada(java.util.Calendar dataCancelada) {
        this.dataCancelada = dataCancelada;
    }


    /**
     * Gets the statusCancelamento value for this AereoSeguimento.
     * 
     * @return statusCancelamento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusCancelamento getStatusCancelamento() {
        return statusCancelamento;
    }


    /**
     * Sets the statusCancelamento value for this AereoSeguimento.
     * 
     * @param statusCancelamento
     */
    public void setStatusCancelamento(br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusCancelamento statusCancelamento) {
        this.statusCancelamento = statusCancelamento;
    }


    /**
     * Gets the seguimentoCancelado value for this AereoSeguimento.
     * 
     * @return seguimentoCancelado
     */
    public java.lang.Boolean getSeguimentoCancelado() {
        return seguimentoCancelado;
    }


    /**
     * Sets the seguimentoCancelado value for this AereoSeguimento.
     * 
     * @param seguimentoCancelado
     */
    public void setSeguimentoCancelado(java.lang.Boolean seguimentoCancelado) {
        this.seguimentoCancelado = seguimentoCancelado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AereoSeguimento)) return false;
        AereoSeguimento other = (AereoSeguimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.origem==null && other.getOrigem()==null) || 
             (this.origem!=null &&
              this.origem.equals(other.getOrigem()))) &&
            ((this.dataSaida==null && other.getDataSaida()==null) || 
             (this.dataSaida!=null &&
              this.dataSaida.equals(other.getDataSaida()))) &&
            ((this.destino==null && other.getDestino()==null) || 
             (this.destino!=null &&
              this.destino.equals(other.getDestino()))) &&
            ((this.dataChegada==null && other.getDataChegada()==null) || 
             (this.dataChegada!=null &&
              this.dataChegada.equals(other.getDataChegada()))) &&
            ((this.aereoVoo==null && other.getAereoVoo()==null) || 
             (this.aereoVoo!=null &&
              java.util.Arrays.equals(this.aereoVoo, other.getAereoVoo()))) &&
            ((this.localizadorCia==null && other.getLocalizadorCia()==null) || 
             (this.localizadorCia!=null &&
              this.localizadorCia.equals(other.getLocalizadorCia()))) &&
            ((this.milhas==null && other.getMilhas()==null) || 
             (this.milhas!=null &&
              this.milhas.equals(other.getMilhas()))) &&
            ((this.paisOrigem==null && other.getPaisOrigem()==null) || 
             (this.paisOrigem!=null &&
              this.paisOrigem.equals(other.getPaisOrigem()))) &&
            ((this.estadoOrigem==null && other.getEstadoOrigem()==null) || 
             (this.estadoOrigem!=null &&
              this.estadoOrigem.equals(other.getEstadoOrigem()))) &&
            ((this.paisDestino==null && other.getPaisDestino()==null) || 
             (this.paisDestino!=null &&
              this.paisDestino.equals(other.getPaisDestino()))) &&
            ((this.estadoDestino==null && other.getEstadoDestino()==null) || 
             (this.estadoDestino!=null &&
              this.estadoDestino.equals(other.getEstadoDestino()))) &&
            ((this.cidadeOrigem==null && other.getCidadeOrigem()==null) || 
             (this.cidadeOrigem!=null &&
              this.cidadeOrigem.equals(other.getCidadeOrigem()))) &&
            ((this.cidadeDestino==null && other.getCidadeDestino()==null) || 
             (this.cidadeDestino!=null &&
              this.cidadeDestino.equals(other.getCidadeDestino()))) &&
            ((this.dataCancelada==null && other.getDataCancelada()==null) || 
             (this.dataCancelada!=null &&
              this.dataCancelada.equals(other.getDataCancelada()))) &&
            ((this.statusCancelamento==null && other.getStatusCancelamento()==null) || 
             (this.statusCancelamento!=null &&
              this.statusCancelamento.equals(other.getStatusCancelamento()))) &&
            ((this.seguimentoCancelado==null && other.getSeguimentoCancelado()==null) || 
             (this.seguimentoCancelado!=null &&
              this.seguimentoCancelado.equals(other.getSeguimentoCancelado())));
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
        if (getOrigem() != null) {
            _hashCode += getOrigem().hashCode();
        }
        if (getDataSaida() != null) {
            _hashCode += getDataSaida().hashCode();
        }
        if (getDestino() != null) {
            _hashCode += getDestino().hashCode();
        }
        if (getDataChegada() != null) {
            _hashCode += getDataChegada().hashCode();
        }
        if (getAereoVoo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAereoVoo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAereoVoo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalizadorCia() != null) {
            _hashCode += getLocalizadorCia().hashCode();
        }
        if (getMilhas() != null) {
            _hashCode += getMilhas().hashCode();
        }
        if (getPaisOrigem() != null) {
            _hashCode += getPaisOrigem().hashCode();
        }
        if (getEstadoOrigem() != null) {
            _hashCode += getEstadoOrigem().hashCode();
        }
        if (getPaisDestino() != null) {
            _hashCode += getPaisDestino().hashCode();
        }
        if (getEstadoDestino() != null) {
            _hashCode += getEstadoDestino().hashCode();
        }
        if (getCidadeOrigem() != null) {
            _hashCode += getCidadeOrigem().hashCode();
        }
        if (getCidadeDestino() != null) {
            _hashCode += getCidadeDestino().hashCode();
        }
        if (getDataCancelada() != null) {
            _hashCode += getDataCancelada().hashCode();
        }
        if (getStatusCancelamento() != null) {
            _hashCode += getStatusCancelamento().hashCode();
        }
        if (getSeguimentoCancelado() != null) {
            _hashCode += getSeguimentoCancelado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AereoSeguimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoSeguimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSaida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSaida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataChegada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataChegada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereoVoo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereoVoo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoVoo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizadorCia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizadorCia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milhas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "milhas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paisOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paisOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paisDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paisDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidadeOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidadeDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCancelada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCancelada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/types", "statusCancelamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seguimentoCancelado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seguimentoCancelado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
