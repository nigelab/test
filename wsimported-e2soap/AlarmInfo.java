
package e2s;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlarmInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="notice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="acked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reset" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rtn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ackuser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acktimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rtntimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportvalue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="engUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmInfo", namespace = "http://tempuri.org/e2.xsd", propOrder = {
    "advid",
    "timestamp",
    "state",
    "source",
    "alarm",
    "notice",
    "fail",
    "acked",
    "reset",
    "rtn",
    "ackuser",
    "acktimestamp",
    "priority",
    "rtntimestamp",
    "reportvalue",
    "limit",
    "engUnits"
})
public class AlarmInfo {

    protected int advid;
    @XmlElement(required = true)
    protected java.lang.String timestamp;
    @XmlElement(required = true)
    protected java.lang.String state;
    @XmlElement(required = true)
    protected java.lang.String source;
    protected boolean alarm;
    protected boolean notice;
    protected boolean fail;
    protected boolean acked;
    protected boolean reset;
    protected boolean rtn;
    @XmlElement(required = true)
    protected java.lang.String ackuser;
    @XmlElement(required = true)
    protected java.lang.String acktimestamp;
    protected int priority;
    @XmlElement(required = true)
    protected java.lang.String rtntimestamp;
    @XmlElement(required = true)
    protected java.lang.String reportvalue;
    @XmlElement(required = true)
    protected java.lang.String limit;
    @XmlElement(required = true)
    protected java.lang.String engUnits;

    /**
     * Gets the value of the advid property.
     * 
     */
    public int getAdvid() {
        return advid;
    }

    /**
     * Sets the value of the advid property.
     * 
     */
    public void setAdvid(int value) {
        this.advid = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTimestamp(java.lang.String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setState(java.lang.String value) {
        this.state = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSource(java.lang.String value) {
        this.source = value;
    }

    /**
     * Gets the value of the alarm property.
     * 
     */
    public boolean isAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     */
    public void setAlarm(boolean value) {
        this.alarm = value;
    }

    /**
     * Gets the value of the notice property.
     * 
     */
    public boolean isNotice() {
        return notice;
    }

    /**
     * Sets the value of the notice property.
     * 
     */
    public void setNotice(boolean value) {
        this.notice = value;
    }

    /**
     * Gets the value of the fail property.
     * 
     */
    public boolean isFail() {
        return fail;
    }

    /**
     * Sets the value of the fail property.
     * 
     */
    public void setFail(boolean value) {
        this.fail = value;
    }

    /**
     * Gets the value of the acked property.
     * 
     */
    public boolean isAcked() {
        return acked;
    }

    /**
     * Sets the value of the acked property.
     * 
     */
    public void setAcked(boolean value) {
        this.acked = value;
    }

    /**
     * Gets the value of the reset property.
     * 
     */
    public boolean isReset() {
        return reset;
    }

    /**
     * Sets the value of the reset property.
     * 
     */
    public void setReset(boolean value) {
        this.reset = value;
    }

    /**
     * Gets the value of the rtn property.
     * 
     */
    public boolean isRtn() {
        return rtn;
    }

    /**
     * Sets the value of the rtn property.
     * 
     */
    public void setRtn(boolean value) {
        this.rtn = value;
    }

    /**
     * Gets the value of the ackuser property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAckuser() {
        return ackuser;
    }

    /**
     * Sets the value of the ackuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAckuser(java.lang.String value) {
        this.ackuser = value;
    }

    /**
     * Gets the value of the acktimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAcktimestamp() {
        return acktimestamp;
    }

    /**
     * Sets the value of the acktimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAcktimestamp(java.lang.String value) {
        this.acktimestamp = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the rtntimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRtntimestamp() {
        return rtntimestamp;
    }

    /**
     * Sets the value of the rtntimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRtntimestamp(java.lang.String value) {
        this.rtntimestamp = value;
    }

    /**
     * Gets the value of the reportvalue property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getReportvalue() {
        return reportvalue;
    }

    /**
     * Sets the value of the reportvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setReportvalue(java.lang.String value) {
        this.reportvalue = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLimit(java.lang.String value) {
        this.limit = value;
    }

    /**
     * Gets the value of the engUnits property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEngUnits() {
        return engUnits;
    }

    /**
     * Sets the value of the engUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEngUnits(java.lang.String value) {
        this.engUnits = value;
    }

}
