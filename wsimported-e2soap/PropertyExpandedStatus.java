
package e2s;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyExpandedStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyExpandedStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alarm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="notice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overriden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ovtime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ovtype" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="engUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyExpandedStatus", namespace = "http://tempuri.org/e2.xsd", propOrder = {
    "prop",
    "value",
    "alarm",
    "notice",
    "fail",
    "overriden",
    "ovtime",
    "ovtype",
    "engUnits",
    "dataType"
})
public class PropertyExpandedStatus {

    @XmlElement(required = true)
    protected java.lang.String prop;
    @XmlElement(required = true)
    protected java.lang.String value;
    protected boolean alarm;
    protected boolean notice;
    protected boolean fail;
    protected boolean overriden;
    @XmlElement(required = true)
    protected java.lang.String ovtime;
    protected int ovtype;
    @XmlElement(required = true)
    protected java.lang.String engUnits;
    protected int dataType;

    /**
     * Gets the value of the prop property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getProp() {
        return prop;
    }

    /**
     * Sets the value of the prop property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setProp(java.lang.String value) {
        this.prop = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValue(java.lang.String value) {
        this.value = value;
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
     * Gets the value of the overriden property.
     * 
     */
    public boolean isOverriden() {
        return overriden;
    }

    /**
     * Sets the value of the overriden property.
     * 
     */
    public void setOverriden(boolean value) {
        this.overriden = value;
    }

    /**
     * Gets the value of the ovtime property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOvtime() {
        return ovtime;
    }

    /**
     * Sets the value of the ovtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOvtime(java.lang.String value) {
        this.ovtime = value;
    }

    /**
     * Gets the value of the ovtype property.
     * 
     */
    public int getOvtype() {
        return ovtype;
    }

    /**
     * Sets the value of the ovtype property.
     * 
     */
    public void setOvtype(int value) {
        this.ovtype = value;
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

    /**
     * Gets the value of the dataType property.
     * 
     */
    public int getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     */
    public void setDataType(int value) {
        this.dataType = value;
    }

}
