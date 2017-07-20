/**
 * AereoVoo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

public class AereoVoo  implements java.io.Serializable {
    private java.lang.Integer idAereoVoo;

    private java.lang.String origem;

    private java.util.Calendar dataSaida;

    private java.lang.String destino;

    private java.util.Calendar dataChegada;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Cia cia;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Cia ciaOperacao;

    private java.lang.String aeronave;

    private java.lang.String numeroVoo;

    private java.lang.Double milhas;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheParada[] aereoDetalheParada;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVooAssento[] assento;

    private br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheBaseTarifa aereoDetalheBaseTarifa;

    private java.lang.Integer idClasse;

    private java.lang.String localizadorCia;

    private java.lang.String tipoVoo;

    public AereoVoo() {
    }

    public AereoVoo(
           java.lang.Integer idAereoVoo,
           java.lang.String origem,
           java.util.Calendar dataSaida,
           java.lang.String destino,
           java.util.Calendar dataChegada,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Cia cia,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Cia ciaOperacao,
           java.lang.String aeronave,
           java.lang.String numeroVoo,
           java.lang.Double milhas,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheParada[] aereoDetalheParada,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVooAssento[] assento,
           br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheBaseTarifa aereoDetalheBaseTarifa,
           java.lang.Integer idClasse,
           java.lang.String localizadorCia,
           java.lang.String tipoVoo) {
           this.idAereoVoo = idAereoVoo;
           this.origem = origem;
           this.dataSaida = dataSaida;
           this.destino = destino;
           this.dataChegada = dataChegada;
           this.cia = cia;
           this.ciaOperacao = ciaOperacao;
           this.aeronave = aeronave;
           this.numeroVoo = numeroVoo;
           this.milhas = milhas;
           this.aereoDetalheParada = aereoDetalheParada;
           this.assento = assento;
           this.aereoDetalheBaseTarifa = aereoDetalheBaseTarifa;
           this.idClasse = idClasse;
           this.localizadorCia = localizadorCia;
           this.tipoVoo = tipoVoo;
    }


    /**
     * Gets the idAereoVoo value for this AereoVoo.
     * 
     * @return idAereoVoo
     */
    public java.lang.Integer getIdAereoVoo() {
        return idAereoVoo;
    }


    /**
     * Sets the idAereoVoo value for this AereoVoo.
     * 
     * @param idAereoVoo
     */
    public void setIdAereoVoo(java.lang.Integer idAereoVoo) {
        this.idAereoVoo = idAereoVoo;
    }


    /**
     * Gets the origem value for this AereoVoo.
     * 
     * @return origem
     */
    public java.lang.String getOrigem() {
        return origem;
    }


    /**
     * Sets the origem value for this AereoVoo.
     * 
     * @param origem
     */
    public void setOrigem(java.lang.String origem) {
        this.origem = origem;
    }


    /**
     * Gets the dataSaida value for this AereoVoo.
     * 
     * @return dataSaida
     */
    public java.util.Calendar getDataSaida() {
        return dataSaida;
    }


    /**
     * Sets the dataSaida value for this AereoVoo.
     * 
     * @param dataSaida
     */
    public void setDataSaida(java.util.Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }


    /**
     * Gets the destino value for this AereoVoo.
     * 
     * @return destino
     */
    public java.lang.String getDestino() {
        return destino;
    }


    /**
     * Sets the destino value for this AereoVoo.
     * 
     * @param destino
     */
    public void setDestino(java.lang.String destino) {
        this.destino = destino;
    }


    /**
     * Gets the dataChegada value for this AereoVoo.
     * 
     * @return dataChegada
     */
    public java.util.Calendar getDataChegada() {
        return dataChegada;
    }


    /**
     * Sets the dataChegada value for this AereoVoo.
     * 
     * @param dataChegada
     */
    public void setDataChegada(java.util.Calendar dataChegada) {
        this.dataChegada = dataChegada;
    }


    /**
     * Gets the cia value for this AereoVoo.
     * 
     * @return cia
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Cia getCia() {
        return cia;
    }


    /**
     * Sets the cia value for this AereoVoo.
     * 
     * @param cia
     */
    public void setCia(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Cia cia) {
        this.cia = cia;
    }


    /**
     * Gets the ciaOperacao value for this AereoVoo.
     * 
     * @return ciaOperacao
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Cia getCiaOperacao() {
        return ciaOperacao;
    }


    /**
     * Sets the ciaOperacao value for this AereoVoo.
     * 
     * @param ciaOperacao
     */
    public void setCiaOperacao(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Cia ciaOperacao) {
        this.ciaOperacao = ciaOperacao;
    }


    /**
     * Gets the aeronave value for this AereoVoo.
     * 
     * @return aeronave
     */
    public java.lang.String getAeronave() {
        return aeronave;
    }


    /**
     * Sets the aeronave value for this AereoVoo.
     * 
     * @param aeronave
     */
    public void setAeronave(java.lang.String aeronave) {
        this.aeronave = aeronave;
    }


    /**
     * Gets the numeroVoo value for this AereoVoo.
     * 
     * @return numeroVoo
     */
    public java.lang.String getNumeroVoo() {
        return numeroVoo;
    }


    /**
     * Sets the numeroVoo value for this AereoVoo.
     * 
     * @param numeroVoo
     */
    public void setNumeroVoo(java.lang.String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }


    /**
     * Gets the milhas value for this AereoVoo.
     * 
     * @return milhas
     */
    public java.lang.Double getMilhas() {
        return milhas;
    }


    /**
     * Sets the milhas value for this AereoVoo.
     * 
     * @param milhas
     */
    public void setMilhas(java.lang.Double milhas) {
        this.milhas = milhas;
    }


    /**
     * Gets the aereoDetalheParada value for this AereoVoo.
     * 
     * @return aereoDetalheParada
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheParada[] getAereoDetalheParada() {
        return aereoDetalheParada;
    }


    /**
     * Sets the aereoDetalheParada value for this AereoVoo.
     * 
     * @param aereoDetalheParada
     */
    public void setAereoDetalheParada(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheParada[] aereoDetalheParada) {
        this.aereoDetalheParada = aereoDetalheParada;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheParada getAereoDetalheParada(int i) {
        return this.aereoDetalheParada[i];
    }

    public void setAereoDetalheParada(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheParada _value) {
        this.aereoDetalheParada[i] = _value;
    }


    /**
     * Gets the assento value for this AereoVoo.
     * 
     * @return assento
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVooAssento[] getAssento() {
        return assento;
    }


    /**
     * Sets the assento value for this AereoVoo.
     * 
     * @param assento
     */
    public void setAssento(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVooAssento[] assento) {
        this.assento = assento;
    }

    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVooAssento getAssento(int i) {
        return this.assento[i];
    }

    public void setAssento(int i, br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoVooAssento _value) {
        this.assento[i] = _value;
    }


    /**
     * Gets the aereoDetalheBaseTarifa value for this AereoVoo.
     * 
     * @return aereoDetalheBaseTarifa
     */
    public br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheBaseTarifa getAereoDetalheBaseTarifa() {
        return aereoDetalheBaseTarifa;
    }


    /**
     * Sets the aereoDetalheBaseTarifa value for this AereoVoo.
     * 
     * @param aereoDetalheBaseTarifa
     */
    public void setAereoDetalheBaseTarifa(br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoDetalheBaseTarifa aereoDetalheBaseTarifa) {
        this.aereoDetalheBaseTarifa = aereoDetalheBaseTarifa;
    }


    /**
     * Gets the idClasse value for this AereoVoo.
     * 
     * @return idClasse
     */
    public java.lang.Integer getIdClasse() {
        return idClasse;
    }


    /**
     * Sets the idClasse value for this AereoVoo.
     * 
     * @param idClasse
     */
    public void setIdClasse(java.lang.Integer idClasse) {
        this.idClasse = idClasse;
    }


    /**
     * Gets the localizadorCia value for this AereoVoo.
     * 
     * @return localizadorCia
     */
    public java.lang.String getLocalizadorCia() {
        return localizadorCia;
    }


    /**
     * Sets the localizadorCia value for this AereoVoo.
     * 
     * @param localizadorCia
     */
    public void setLocalizadorCia(java.lang.String localizadorCia) {
        this.localizadorCia = localizadorCia;
    }


    /**
     * Gets the tipoVoo value for this AereoVoo.
     * 
     * @return tipoVoo
     */
    public java.lang.String getTipoVoo() {
        return tipoVoo;
    }


    /**
     * Sets the tipoVoo value for this AereoVoo.
     * 
     * @param tipoVoo
     */
    public void setTipoVoo(java.lang.String tipoVoo) {
        this.tipoVoo = tipoVoo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AereoVoo)) return false;
        AereoVoo other = (AereoVoo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idAereoVoo==null && other.getIdAereoVoo()==null) || 
             (this.idAereoVoo!=null &&
              this.idAereoVoo.equals(other.getIdAereoVoo()))) &&
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
            ((this.cia==null && other.getCia()==null) || 
             (this.cia!=null &&
              this.cia.equals(other.getCia()))) &&
            ((this.ciaOperacao==null && other.getCiaOperacao()==null) || 
             (this.ciaOperacao!=null &&
              this.ciaOperacao.equals(other.getCiaOperacao()))) &&
            ((this.aeronave==null && other.getAeronave()==null) || 
             (this.aeronave!=null &&
              this.aeronave.equals(other.getAeronave()))) &&
            ((this.numeroVoo==null && other.getNumeroVoo()==null) || 
             (this.numeroVoo!=null &&
              this.numeroVoo.equals(other.getNumeroVoo()))) &&
            ((this.milhas==null && other.getMilhas()==null) || 
             (this.milhas!=null &&
              this.milhas.equals(other.getMilhas()))) &&
            ((this.aereoDetalheParada==null && other.getAereoDetalheParada()==null) || 
             (this.aereoDetalheParada!=null &&
              java.util.Arrays.equals(this.aereoDetalheParada, other.getAereoDetalheParada()))) &&
            ((this.assento==null && other.getAssento()==null) || 
             (this.assento!=null &&
              java.util.Arrays.equals(this.assento, other.getAssento()))) &&
            ((this.aereoDetalheBaseTarifa==null && other.getAereoDetalheBaseTarifa()==null) || 
             (this.aereoDetalheBaseTarifa!=null &&
              this.aereoDetalheBaseTarifa.equals(other.getAereoDetalheBaseTarifa()))) &&
            ((this.idClasse==null && other.getIdClasse()==null) || 
             (this.idClasse!=null &&
              this.idClasse.equals(other.getIdClasse()))) &&
            ((this.localizadorCia==null && other.getLocalizadorCia()==null) || 
             (this.localizadorCia!=null &&
              this.localizadorCia.equals(other.getLocalizadorCia()))) &&
            ((this.tipoVoo==null && other.getTipoVoo()==null) || 
             (this.tipoVoo!=null &&
              this.tipoVoo.equals(other.getTipoVoo())));
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
        if (getIdAereoVoo() != null) {
            _hashCode += getIdAereoVoo().hashCode();
        }
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
        if (getCia() != null) {
            _hashCode += getCia().hashCode();
        }
        if (getCiaOperacao() != null) {
            _hashCode += getCiaOperacao().hashCode();
        }
        if (getAeronave() != null) {
            _hashCode += getAeronave().hashCode();
        }
        if (getNumeroVoo() != null) {
            _hashCode += getNumeroVoo().hashCode();
        }
        if (getMilhas() != null) {
            _hashCode += getMilhas().hashCode();
        }
        if (getAereoDetalheParada() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAereoDetalheParada());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAereoDetalheParada(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAereoDetalheBaseTarifa() != null) {
            _hashCode += getAereoDetalheBaseTarifa().hashCode();
        }
        if (getIdClasse() != null) {
            _hashCode += getIdClasse().hashCode();
        }
        if (getLocalizadorCia() != null) {
            _hashCode += getLocalizadorCia().hashCode();
        }
        if (getTipoVoo() != null) {
            _hashCode += getTipoVoo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AereoVoo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoVoo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAereoVoo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idAereoVoo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("cia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "cia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciaOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ciaOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "cia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aeronave");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aeronave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroVoo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroVoo"));
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
        elemField.setFieldName("aereoDetalheParada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereoDetalheParada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoDetalheParada"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoVooAssento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aereoDetalheBaseTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aereoDetalheBaseTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo", "aereoDetalheBaseTarifa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idClasse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idClasse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizadorCia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizadorCia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoVoo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoVoo"));
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
