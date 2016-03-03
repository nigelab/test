package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;

public class MyHashMapType {
	@XmlElement(name="variable")
	public List<MyHashMapEntryType> entry = new ArrayList<MyHashMapEntryType>();
    public MyHashMapType(Map<String,String> map) {
        for( Map.Entry<String,String> e : map.entrySet() )
            entry.add(new MyHashMapEntryType(e));
    }
    public MyHashMapType() {}

}
