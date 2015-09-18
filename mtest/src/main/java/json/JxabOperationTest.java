package json;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;

/*import com.cpcus.oxygen.beans.ActionXmlBean;
import com.cpcus.oxygen.beans.TestCaseXmlBean;
import com.cpcus.oxygen.beans.VerificationXmlBean;
import com.cpcus.oxygen.beans.WaitXmlBean;
*/
public class JxabOperationTest
{
  public static void main(String[] args) throws JAXBException
  {
/*    TestCaseXmlBean bean = new TestCaseXmlBean();
    WaitXmlBean wait = new WaitXmlBean();
    ActionXmlBean action = new ActionXmlBean();
    VerificationXmlBean verification = new VerificationXmlBean();
    bean.addOperation(action);
    bean.addOperation(wait);
    bean.addOperation(verification);
    // TODO Auto-generated method stub
    JAXBContext jaxb = JAXBContext.newInstance(TestCaseXmlBean.class, WaitXmlBean.class, ActionXmlBean.class, VerificationXmlBean.class);
    Marshaller marshaller = jaxb.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.marshal(bean, System.out);
    // System.out.println(result.toString());
*/  }
}
