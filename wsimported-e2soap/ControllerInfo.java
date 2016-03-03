
package e2s;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControllerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControllerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subnet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="node" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControllerInfo", namespace = "http://tempuri.org/e2.xsd", propOrder = {
    "name",
    "type",
    "model",
    "revision",
    "subnet",
    "node"
})
public class ControllerInfo {

    @XmlElement(required = true)
    protected java.lang.String name;
    protected int type;
    @XmlElement(required = true)
    protected java.lang.String model;
    @XmlElement(required = true)
    protected java.lang.String revision;
    protected int subnet;
    protected int node;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setName(java.lang.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setModel(java.lang.String value) {
        this.model = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRevision(java.lang.String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the subnet property.
     * 
     */
    public int getSubnet() {
        return subnet;
    }

    /**
     * Sets the value of the subnet property.
     * 
     */
    public void setSubnet(int value) {
        this.subnet = value;
    }

    /**
     * Gets the value of the node property.
     * 
     */
    public int getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     */
    public void setNode(int value) {
        this.node = value;
    }

}
