
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
 *         &lt;element name="propIdArr" type="{http://tempuri.org/e2.xsd}PropIdArr" minOccurs="0"/>
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
    "propIdArr"
})
@XmlRootElement(name = "GetPropertyExpandedStatus", namespace = "http://tempuri.org/e2.xsd")
public class GetPropertyExpandedStatus {

    @XmlElementRef(name = "propIdArr", namespace = "http://tempuri.org/e2.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<PropIdArr> propIdArr;

    /**
     * Gets the value of the propIdArr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropIdArr }{@code >}
     *     
     */
    public JAXBElement<PropIdArr> getPropIdArr() {
        return propIdArr;
    }

    /**
     * Sets the value of the propIdArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropIdArr }{@code >}
     *     
     */
    public void setPropIdArr(JAXBElement<PropIdArr> value) {
        this.propIdArr = value;
    }

}
