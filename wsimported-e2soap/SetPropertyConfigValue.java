
package e2s;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="propValueArray" type="{http://tempuri.org/e2.xsd}PropertyValueArray" minOccurs="0"/>
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
    "propValueArray"
})
@XmlRootElement(name = "SetPropertyConfigValue", namespace = "http://tempuri.org/e2.xsd")
public class SetPropertyConfigValue {

    @XmlElementRef(name = "propValueArray", namespace = "http://tempuri.org/e2.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PropertyValueArray> propValueArray;

    /**
     * Gets the value of the propValueArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropertyValueArray }{@code >}
     *     
     */
    public JAXBElement<PropertyValueArray> getPropValueArray() {
        return propValueArray;
    }

    /**
     * Sets the value of the propValueArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropertyValueArray }{@code >}
     *     
     */
    public void setPropValueArray(JAXBElement<PropertyValueArray> value) {
        this.propValueArray = value;
    }

}
