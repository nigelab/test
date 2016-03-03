/**
 * PropertyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.e2_xsd;

public class PropertyInfo  implements java.io.Serializable {
    private java.lang.String prop;

    private boolean resolved;

    private boolean visible;

    private int dataType;

    private java.lang.String engUnits;

    private boolean logAvailable;

    private boolean canOverride;

    public PropertyInfo() {
    }

    public PropertyInfo(
           java.lang.String prop,
           boolean resolved,
           boolean visible,
           int dataType,
           java.lang.String engUnits,
           boolean logAvailable,
           boolean canOverride) {
           this.prop = prop;
           this.resolved = resolved;
           this.visible = visible;
           this.dataType = dataType;
           this.engUnits = engUnits;
           this.logAvailable = logAvailable;
           this.canOverride = canOverride;
    }


    /**
     * Gets the prop value for this PropertyInfo.
     * 
     * @return prop
     */
    public java.lang.String getProp() {
        return prop;
    }


    /**
     * Sets the prop value for this PropertyInfo.
     * 
     * @param prop
     */
    public void setProp(java.lang.String prop) {
        this.prop = prop;
    }


    /**
     * Gets the resolved value for this PropertyInfo.
     * 
     * @return resolved
     */
    public boolean isResolved() {
        return resolved;
    }


    /**
     * Sets the resolved value for this PropertyInfo.
     * 
     * @param resolved
     */
    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }


    /**
     * Gets the visible value for this PropertyInfo.
     * 
     * @return visible
     */
    public boolean isVisible() {
        return visible;
    }


    /**
     * Sets the visible value for this PropertyInfo.
     * 
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }


    /**
     * Gets the dataType value for this PropertyInfo.
     * 
     * @return dataType
     */
    public int getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this PropertyInfo.
     * 
     * @param dataType
     */
    public void setDataType(int dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the engUnits value for this PropertyInfo.
     * 
     * @return engUnits
     */
    public java.lang.String getEngUnits() {
        return engUnits;
    }


    /**
     * Sets the engUnits value for this PropertyInfo.
     * 
     * @param engUnits
     */
    public void setEngUnits(java.lang.String engUnits) {
        this.engUnits = engUnits;
    }


    /**
     * Gets the logAvailable value for this PropertyInfo.
     * 
     * @return logAvailable
     */
    public boolean isLogAvailable() {
        return logAvailable;
    }


    /**
     * Sets the logAvailable value for this PropertyInfo.
     * 
     * @param logAvailable
     */
    public void setLogAvailable(boolean logAvailable) {
        this.logAvailable = logAvailable;
    }


    /**
     * Gets the canOverride value for this PropertyInfo.
     * 
     * @return canOverride
     */
    public boolean isCanOverride() {
        return canOverride;
    }


    /**
     * Sets the canOverride value for this PropertyInfo.
     * 
     * @param canOverride
     */
    public void setCanOverride(boolean canOverride) {
        this.canOverride = canOverride;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyInfo)) return false;
        PropertyInfo other = (PropertyInfo) obj;
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
            this.resolved == other.isResolved() &&
            this.visible == other.isVisible() &&
            this.dataType == other.getDataType() &&
            ((this.engUnits==null && other.getEngUnits()==null) || 
             (this.engUnits!=null &&
              this.engUnits.equals(other.getEngUnits()))) &&
            this.logAvailable == other.isLogAvailable() &&
            this.canOverride == other.isCanOverride();
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
        _hashCode += (isResolved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVisible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDataType();
        if (getEngUnits() != null) {
            _hashCode += getEngUnits().hashCode();
        }
        _hashCode += (isLogAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanOverride() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "PropertyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "prop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "resolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visible");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "visible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "dataType"));
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
        elemField.setFieldName("logAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "logAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "canOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
