package json;

import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

public class MapTest
{

  public static void main(String[] args) throws JAXBException
  {
    // TODO Auto-generated method stub
    HashMap m = new HashMap();
    m.put("abc",1);
    JAXBContext jaxb = JAXBContext.newInstance(MyHashMapType.class,MyHashMapEntryType.class);
    Marshaller marshaller = jaxb.createMarshaller();
//    marshaller.marshal(new JAXBElement(new QName("root"),HashMap.class,m),System.out);
    marshaller.marshal(new JAXBElement(new QName("root"),MyHashMapType.class,new MyHashMapType(m)),System.out);
  }

}
