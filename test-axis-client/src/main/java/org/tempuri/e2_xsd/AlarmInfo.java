/**
 * AlarmInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.e2_xsd;

public class AlarmInfo  implements java.io.Serializable {
    private int advid;

    private java.lang.String timestamp;

    private java.lang.String state;

    private java.lang.String source;

    private boolean alarm;

    private boolean notice;

    private boolean fail;

    private boolean acked;

    private boolean reset;

    private boolean rtn;

    private java.lang.String ackuser;

    private java.lang.String acktimestamp;

    private int priority;

    private java.lang.String rtntimestamp;

    private java.lang.String reportvalue;

    private java.lang.String limit;

    private java.lang.String engUnits;

    public AlarmInfo() {
    }

    public AlarmInfo(
           int advid,
           java.lang.String timestamp,
           java.lang.String state,
           java.lang.String source,
           boolean alarm,
           boolean notice,
           boolean fail,
           boolean acked,
           boolean reset,
           boolean rtn,
           java.lang.String ackuser,
           java.lang.String acktimestamp,
           int priority,
           java.lang.String rtntimestamp,
           java.lang.String reportvalue,
           java.lang.String limit,
           java.lang.String engUnits) {
           this.advid = advid;
           this.timestamp = timestamp;
           this.state = state;
           this.source = source;
           this.alarm = alarm;
           this.notice = notice;
           this.fail = fail;
           this.acked = acked;
           this.reset = reset;
           this.rtn = rtn;
           this.ackuser = ackuser;
           this.acktimestamp = acktimestamp;
           this.priority = priority;
           this.rtntimestamp = rtntimestamp;
           this.reportvalue = reportvalue;
           this.limit = limit;
           this.engUnits = engUnits;
    }


    /**
     * Gets the advid value for this AlarmInfo.
     * 
     * @return advid
     */
    public int getAdvid() {
        return advid;
    }


    /**
     * Sets the advid value for this AlarmInfo.
     * 
     * @param advid
     */
    public void setAdvid(int advid) {
        this.advid = advid;
    }


    /**
     * Gets the timestamp value for this AlarmInfo.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this AlarmInfo.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the state value for this AlarmInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this AlarmInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the source value for this AlarmInfo.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this AlarmInfo.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the alarm value for this AlarmInfo.
     * 
     * @return alarm
     */
    public boolean isAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this AlarmInfo.
     * 
     * @param alarm
     */
    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }


    /**
     * Gets the notice value for this AlarmInfo.
     * 
     * @return notice
     */
    public boolean isNotice() {
        return notice;
    }


    /**
     * Sets the notice value for this AlarmInfo.
     * 
     * @param notice
     */
    public void setNotice(boolean notice) {
        this.notice = notice;
    }


    /**
     * Gets the fail value for this AlarmInfo.
     * 
     * @return fail
     */
    public boolean isFail() {
        return fail;
    }


    /**
     * Sets the fail value for this AlarmInfo.
     * 
     * @param fail
     */
    public void setFail(boolean fail) {
        this.fail = fail;
    }


    /**
     * Gets the acked value for this AlarmInfo.
     * 
     * @return acked
     */
    public boolean isAcked() {
        return acked;
    }


    /**
     * Sets the acked value for this AlarmInfo.
     * 
     * @param acked
     */
    public void setAcked(boolean acked) {
        this.acked = acked;
    }


    /**
     * Gets the reset value for this AlarmInfo.
     * 
     * @return reset
     */
    public boolean isReset() {
        return reset;
    }


    /**
     * Sets the reset value for this AlarmInfo.
     * 
     * @param reset
     */
    public void setReset(boolean reset) {
        this.reset = reset;
    }


    /**
     * Gets the rtn value for this AlarmInfo.
     * 
     * @return rtn
     */
    public boolean isRtn() {
        return rtn;
    }


    /**
     * Sets the rtn value for this AlarmInfo.
     * 
     * @param rtn
     */
    public void setRtn(boolean rtn) {
        this.rtn = rtn;
    }


    /**
     * Gets the ackuser value for this AlarmInfo.
     * 
     * @return ackuser
     */
    public java.lang.String getAckuser() {
        return ackuser;
    }


    /**
     * Sets the ackuser value for this AlarmInfo.
     * 
     * @param ackuser
     */
    public void setAckuser(java.lang.String ackuser) {
        this.ackuser = ackuser;
    }


    /**
     * Gets the acktimestamp value for this AlarmInfo.
     * 
     * @return acktimestamp
     */
    public java.lang.String getAcktimestamp() {
        return acktimestamp;
    }


    /**
     * Sets the acktimestamp value for this AlarmInfo.
     * 
     * @param acktimestamp
     */
    public void setAcktimestamp(java.lang.String acktimestamp) {
        this.acktimestamp = acktimestamp;
    }


    /**
     * Gets the priority value for this AlarmInfo.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this AlarmInfo.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the rtntimestamp value for this AlarmInfo.
     * 
     * @return rtntimestamp
     */
    public java.lang.String getRtntimestamp() {
        return rtntimestamp;
    }


    /**
     * Sets the rtntimestamp value for this AlarmInfo.
     * 
     * @param rtntimestamp
     */
    public void setRtntimestamp(java.lang.String rtntimestamp) {
        this.rtntimestamp = rtntimestamp;
    }


    /**
     * Gets the reportvalue value for this AlarmInfo.
     * 
     * @return reportvalue
     */
    public java.lang.String getReportvalue() {
        return reportvalue;
    }


    /**
     * Sets the reportvalue value for this AlarmInfo.
     * 
     * @param reportvalue
     */
    public void setReportvalue(java.lang.String reportvalue) {
        this.reportvalue = reportvalue;
    }


    /**
     * Gets the limit value for this AlarmInfo.
     * 
     * @return limit
     */
    public java.lang.String getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this AlarmInfo.
     * 
     * @param limit
     */
    public void setLimit(java.lang.String limit) {
        this.limit = limit;
    }


    /**
     * Gets the engUnits value for this AlarmInfo.
     * 
     * @return engUnits
     */
    public java.lang.String getEngUnits() {
        return engUnits;
    }


    /**
     * Sets the engUnits value for this AlarmInfo.
     * 
     * @param engUnits
     */
    public void setEngUnits(java.lang.String engUnits) {
        this.engUnits = engUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlarmInfo)) return false;
        AlarmInfo other = (AlarmInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.advid == other.getAdvid() &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            this.alarm == other.isAlarm() &&
            this.notice == other.isNotice() &&
            this.fail == other.isFail() &&
            this.acked == other.isAcked() &&
            this.reset == other.isReset() &&
            this.rtn == other.isRtn() &&
            ((this.ackuser==null && other.getAckuser()==null) || 
             (this.ackuser!=null &&
              this.ackuser.equals(other.getAckuser()))) &&
            ((this.acktimestamp==null && other.getAcktimestamp()==null) || 
             (this.acktimestamp!=null &&
              this.acktimestamp.equals(other.getAcktimestamp()))) &&
            this.priority == other.getPriority() &&
            ((this.rtntimestamp==null && other.getRtntimestamp()==null) || 
             (this.rtntimestamp!=null &&
              this.rtntimestamp.equals(other.getRtntimestamp()))) &&
            ((this.reportvalue==null && other.getReportvalue()==null) || 
             (this.reportvalue!=null &&
              this.reportvalue.equals(other.getReportvalue()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.engUnits==null && other.getEngUnits()==null) || 
             (this.engUnits!=null &&
              this.engUnits.equals(other.getEngUnits())));
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
        _hashCode += getAdvid();
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        _hashCode += (isAlarm() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNotice() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAcked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReset() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRtn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAckuser() != null) {
            _hashCode += getAckuser().hashCode();
        }
        if (getAcktimestamp() != null) {
            _hashCode += getAcktimestamp().hashCode();
        }
        _hashCode += getPriority();
        if (getRtntimestamp() != null) {
            _hashCode += getRtntimestamp().hashCode();
        }
        if (getReportvalue() != null) {
            _hashCode += getReportvalue().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getEngUnits() != null) {
            _hashCode += getEngUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlarmInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "AlarmInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "advid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "source"));
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
        elemField.setFieldName("acked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "acked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "rtn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackuser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "ackuser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acktimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "acktimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtntimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "rtntimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "reportvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/e2.xsd", "engUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
