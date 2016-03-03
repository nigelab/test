
package e2s;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resolved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="engUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canOverride" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyInfo", namespace = "http://tempuri.org/e2.xsd", propOrder = {
    "prop",
    "resolved",
    "visible",
    "dataType",
    "engUnits",
    "logAvailable",
    "canOverride"
})
public class PropertyInfo {

    @XmlElement(required = true)
    protected java.lang.String prop;
    protected boolean resolved;
    protected boolean visible;
    protected int dataType;
    @XmlElement(required = true)
    protected java.lang.String engUnits;
    protected boolean logAvailable;
    protected boolean canOverride;

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
     * Gets the value of the resolved property.
     * 
     */
    public boolean isResolved() {
        return resolved;
    }

    /**
     * Sets the value of the resolved property.
     * 
     */
    public void setResolved(boolean value) {
        this.resolved = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
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
     * Gets the value of the logAvailable property.
     * 
     */
    public boolean isLogAvailable() {
        return logAvailable;
    }

    /**
     * Sets the value of the logAvailable property.
     * 
     */
    public void setLogAvailable(boolean value) {
        this.logAvailable = value;
    }

    /**
     * Gets the value of the canOverride property.
     * 
     */
    public boolean isCanOverride() {
        return canOverride;
    }

    /**
     * Sets the value of the canOverride property.
     * 
     */
    public void setCanOverride(boolean value) {
        this.canOverride = value;
    }

}
