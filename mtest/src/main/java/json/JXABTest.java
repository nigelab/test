package json;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JXABTest
{

  public static void main(String[] args) throws JAXBException
  {
    // TODO Auto-generated method stub
    interfaceExamples();
  }

  // Assuming the following JAXB context:
  public static void interfaceExamples() throws JAXBException
  {

    List<Vehicle> l = new ArrayList<Vehicle>();
    l.add(new Bus("Large bus"));
    l.add(new Bus("Small bus"));
    l.add(new Car("Ferrari"));

    // Object with generic list
    ObjectWithListOfVehicles owgl = new ObjectWithListOfVehicles();
    owgl.setList(l);

    JAXBContext jc = JAXBContext.newInstance(Bus.class, Car.class, ObjectWithListOfVehicles.class);

    ObjectWithListOfVehicles retr = marshallUnmarshall(owgl, jc);

//    for (Vehicle s : retr.getList())
//    {
//      System.out.println(s.getClass().getSimpleName() + " - " + s.getType());
//    }
//    System.out.println(" ");

  }

  public static <O> O marshallUnmarshall(O o, JAXBContext jc) throws JAXBException
  {

    // Creating a Marshaller
    Marshaller jaxbMarshaller = jc.createMarshaller();
    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

    StringWriter result = new StringWriter();
    jaxbMarshaller.marshal(o, result);

    // Printing XML
    String xml = result.toString();
    System.out.println(xml);

    // Creating an Unmarshaller
    Unmarshaller jaxbUnmarshaller = jc.createUnmarshaller();
    StringReader sr = new StringReader(xml);

    O retr = (O) jaxbUnmarshaller.unmarshal(sr);

    return retr;

  }
}
