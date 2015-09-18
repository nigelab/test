package json;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AnyAnimalAdapter extends XmlAdapter<Object,Object> {
  public Object unmarshal(Object v) { return v; }
  public Object marshal(Object v) { return v; }
}