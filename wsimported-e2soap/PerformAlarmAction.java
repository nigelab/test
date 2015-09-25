
package e2s;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alarmIdArray" type="{http://tempuri.org/e2.xsd}AlarmIdArray" minOccurs="0"/>
 *         &lt;element name="controller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "action",
    "alarmIdArray",
    "controller"
})
@XmlRootElement(name = "PerformAlarmAction", namespace = "http://tempuri.org/e2.xsd")
public class PerformAlarmAction {

    @XmlElement(namespace = "http://tempuri.org/e2.xsd")
    protected int action;
    @XmlElementRef(name = "alarmIdArray", namespace = "http://tempuri.org/e2.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<AlarmIdArray> alarmIdArray;
    @XmlElementRef(name = "controller", namespace = "http://tempuri.org/e2.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> controller;

    /**
     * Gets the value of the action property.
     * 
     */
    public int getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     */
    public void setAction(int value) {
        this.action = value;
    }

    /**
     * Gets the value of the alarmIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlarmIdArray }{@code >}
     *     
     */
    public JAXBElement<AlarmIdArray> getAlarmIdArray() {
        return alarmIdArray;
    }

    /**
     * Sets the value of the alarmIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlarmIdArray }{@code >}
     *     
     */
    public void setAlarmIdArray(JAXBElement<AlarmIdArray> value) {
        this.alarmIdArray = value;
    }

    /**
     * Gets the value of the controller property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getController() {
        return controller;
    }

    /**
     * Sets the value of the controller property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setController(JAXBElement<java.lang.String> value) {
        this.controller = value;
    }

}
