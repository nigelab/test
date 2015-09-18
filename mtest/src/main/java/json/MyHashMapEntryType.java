package json;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class MyHashMapEntryType {
	@XmlAttribute // @XmlElement and @XmlValue are also fine
    public String key;

	@XmlAttribute // @XmlElement and @XmlValue are also fine
    public String value;

    public MyHashMapEntryType() {}
    public MyHashMapEntryType(Entry<String, String> e) {
       key = e.getKey();
       value = e.getValue();
    }
}
