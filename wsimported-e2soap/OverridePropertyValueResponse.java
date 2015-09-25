
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
 *         &lt;element name="resultValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "resultValue"
})
@XmlRootElement(name = "OverridePropertyValueResponse", namespace = "http://tempuri.org/e2.xsd")
public class OverridePropertyValueResponse {

    @XmlElement(namespace = "http://tempuri.org/e2.xsd")
    protected int resultValue;

    /**
     * Gets the value of the resultValue property.
     * 
     */
    public int getResultValue() {
        return resultValue;
    }

    /**
     * Sets the value of the resultValue property.
     * 
     */
    public void setResultValue(int value) {
        this.resultValue = value;
    }

}
