package json;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/*import com.cpcus.oxygen.beans.ActionXmlBean;
import com.cpcus.oxygen.beans.Operation;
import com.cpcus.oxygen.beans.TestCaseXmlBean;
import com.cpcus.oxygen.beans.VerificationXmlBean;
import com.cpcus.oxygen.beans.WaitXmlBean;*/

public class JXABTest2
{

  public static void main(String[] args) throws JAXBException
  {
    // TODO Auto-generated method stub
    interfaceExamples();
  }

  // Assuming the following JAXB context:
  public static void interfaceExamples() throws JAXBException
  {

   /* List<Operation> l = new ArrayList<Operation>();
    l.add(new ActionXmlBean());
    l.add(new VerificationXmlBean());
    l.add(new WaitXmlBean());

    // Object with generic list
    TestCaseXmlBean bean = new TestCaseXmlBean();
    bean.setOperations(l);

    JAXBContext jc = JAXBContext.newInstance(ActionXmlBean.class, VerificationXmlBean.class, WaitXmlBean.class, Operation.class, TestCaseXmlBean.class);

    TestCaseXmlBean retr = marshallUnmarshall(bean, jc);

    for (Operation s : retr.getOperations())
    {
      System.out.println(s.getClass().getSimpleName());// + " - " +
                                                       // s.getType());
    }
    System.out.println(" ");*/

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
