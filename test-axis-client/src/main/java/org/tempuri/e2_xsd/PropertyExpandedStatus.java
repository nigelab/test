/**
 * PropertyExpandedStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.e2_xsd;

public class PropertyExpandedStatus  implements java.io.Serializable {
    private java.lang.String prop;

    private java.lang.String value;

    private boolean alarm;

    private boolean notice;

    private boolean fail;

    private boolean overriden;

    private java.lang.String ovtime;

    private int ovtype;

    private java.lang.String engUnits;

    private int dataType;

    public PropertyExpandedStatus() {
    }

    public PropertyExpandedStatus(
           java.lang.String prop,
           java.lang.String value,
           boolean alarm,
           boolean notice,
           boolean fail,
           boolean overriden,
           java.lang.String ovtime,
           int ovtype,
           java.lang.String engUnits,
           int dataType) {
           this.prop = prop;
           this.value = value;
           this.alarm = alarm;
           this.notice = notice;
           this.fail = fail;
           this.overriden = overriden;
           this.ovtime = ovtime;
           this.ovtype = ovtype;
           this.engUnits = engUnits;
           this.dataType = dataType;
    }


    /**
     * Gets the prop value for this PropertyExpandedStatus.
     * 
     * @return prop
     */
    public java.lang.String getProp() {
        return prop;
    }


    /**
     * Sets the prop value for this PropertyExpandedStatus.
     * 
     * @param prop
     */
    public void setProp(java.lang.String prop) {
        this.prop = prop;
    }


    /**
     * Gets the value value for this PropertyExpandedStatus.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this PropertyExpandedStatus.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the alarm value for this PropertyExpandedStatus.
     * 
     * @return alarm
     */
    public boolean isAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this PropertyExpandedStatus.
     * 
     * @param alarm
     */
    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }


    /**
     * Gets the notice value for this PropertyExpandedStatus.
     * 
     * @return notice
     */
    public boolean isNotice() {
        return notice;
    }


    /**
     * Sets the notice value for this PropertyExpandedStatus.
     * 
     * @param notice
     */
    public void setNotice(boolean notice) {
        this.notice = notice;
    }


    /**
     * Gets the fail value for this PropertyExpandedStatus.
     * 
     * @return fail
     */
    public boolean isFail() {
        return fail;
    }


    /**
     * Sets the fail value for this PropertyExpandedStatus.
     * 
     * @param fail
     */
    public void setFail(boolean fail) {
        this.fail = fail;
    }


    /**
     * Gets the overriden value for this PropertyExpandedStatus.
     * 
     * @return overriden
     */
    public boolean isOverriden() {
        return overriden;
    }


    /**
     * Sets the overriden value for this PropertyExpandedStatus.
     * 
     * @param overriden
     */
    public void setOverriden(boolean overriden) {
        this.overriden = overriden;
    }


    /**
     * Gets the ovtime value for this PropertyExpandedStatus.
     * 
     * @return ovtime
     */
    public java.lang.String getOvtime() {
        return ovtime;
    }


    /**
     * Sets the ovtime value for this PropertyExpandedStatus.
     * 
     * @param ovtime
     */
    public void setOvtime(java.lang.String ovtime) {
        this.ovtime = ovtime;
    }


    /**
     * Gets the ovtype value for this PropertyExpandedStatus.
     * 
     * @return ovtype
     */
    public int getOvtype() {
        return ovtype;
    }


    /**
     * Sets the ovtype value for this PropertyExpandedStatus.
     * 
     * @param ovtype
     */
    public void setOvtype(int ovtype) {
        this.ovtype = ovtype;
    }


    /**
     * Gets the engUnits value for this PropertyExpandedStatus.
     * 
     * @return engUnits
     */
    public java.lang.String getEngUnits() {
        return engUnits;
    }


    /**
     * Sets the engUnits value for this PropertyExpandedStatus.
     * 
     * @param engUnits
     */
    public void setEngUnits(java.lang.String engUnits) {
        this.engUnits = engUnits;
    }


    /**
     * Gets the dataType value for this PropertyExpandedStatus.
     * 
     * @return dataType
     */
    public int getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this PropertyExpandedStatus.
     * 
     * @param dataType
     */
    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyExpandedStatus)) return false;
        PropertyExpandedStatus other = (PropertyExpandedStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prop==null && other.getProp()==null) || 
             (this.prop!=null &&
              this.prop.equals(other.getProp()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            this.alarm == other.isAlarm() &&
            this.notice == other.isNotice() &&
            this.fail == other.isFail() &&
            this.overriden == other.isOverriden() &&
            ((this.ovtime==null && other.getOvtime()==null) || 
             (this.ovtime!=null &&
              this.ovtime.equals(other.getOvtime()))) &&
            this.ovtype == other.getOvtype() &&
            ((this.engUnits==null && other.getEngUnits()==null) || 
             (this.engUnits!=null &&
              this.engUnits.equals(other.getEngUnits()))) &&
            this.dataType == other.getDataType();
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
        if (getProp() != null) {
            _hashCode += getProp().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        _hashCode += (isAlarm() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNotice() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOverriden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOvtime() != null) {
            _hashCode += getOvtime().hashCode();
        }
        _hashCode += getOvtype();
        if (getEngUnits() != null) {
            _hashCode += getEngUnits().hashCode();
        }
        _hashCode += getDataType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyExpandedStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "PropertyExpandedStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "prop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "alarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "notice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "fail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overriden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "overriden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovtime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "ovtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "ovtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "engUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
