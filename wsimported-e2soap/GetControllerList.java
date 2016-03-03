
package e2s;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="controllerType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "controllerType"
})
@XmlRootElement(name = "GetControllerList", namespace = "http://tempuri.org/e2.xsd")
public class GetControllerList {

    @XmlElement(namespace = "http://tempuri.org/e2.xsd")
    protected int controllerType;

    /**
     * Gets the value of the controllerType property.
     * 
     */
    public int getControllerType() {
        return controllerType;
    }

    /**
     * Sets the value of the controllerType property.
     * 
     */
    public void setControllerType(int value) {
        this.controllerType = value;
    }

}
