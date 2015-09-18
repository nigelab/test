package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.cpcus.oxygen.beans.Operation;


public abstract class MapAdapterX extends XmlAdapter<MapAdapterX.Converter, List<Operation>>  {
    @XmlType(name = "Converter")  
    @XmlAccessorType(XmlAccessType.FIELD)  
    public static class Converter {
        @XmlTransient
        private List<MapEntry> entries = new ArrayList<MapEntry>();  

        public void addEntry(MapEntry entry) {  
            entries.add(entry);  
        }  

//      @XmlElementWrapper(name = "tableMaps")
        @XmlElement(name = "entry")
        public List<MapEntry> getEntries() {  
            return entries;  
        }  

        public static class MapEntry {  

            private String key;  

            private List<Operation> value;  

            public MapEntry() {  
                super();  
            }  

            /*public MapEntry(Map.Entry<String, List<Table>> entry) {  
                super();  
                this.key = entry.getKey();  
                this.value = entry.getValue();  
            }  

            public MapEntry(String key, List<Table> value) {  
                super();  
                this.key = key;  
                this.value = value;  
            }  

            @XmlElement(name="srcTableName")
            public String getKey() {  
                return key;  
            }  

            public void setKey(String key) {  
                this.key = key;  
            }  

            @XmlElementWrapper(name = "sTables")
            @XmlElement(name = "table")
            public List<Table> getValue() {  
                return value;  
            }  

            public void setValue(List<Table> value) {  
                this.value = value;  
            }  */
        }  
    }

    /*@Override
    public Map<String, List<Table>> unmarshal(Converter v) throws Exception {
        Map<String, List<Table>> result = new HashMap<String, List<Table>>();  
        for (Converter.MapEntry e : v.getEntries()) {  
            result.put(e.getKey(), e.getValue());  
        }  
        return result;  
    }

    @Override
    public Converter marshal(Map<String, List<Table>> map) throws Exception {
        Converter convertor = new Converter();  
        for (Map.Entry<String, List<Table>> entry : map.entrySet()) {  
            Converter.MapEntry e = new Converter.MapEntry(entry);  
            convertor.addEntry(e);  
        }  
        return convertor;  
    }*/
}
