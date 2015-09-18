package json;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.cpcus.oxygen.beans.ElementXmlBean;
import com.cpcus.oxygen.beans.PageXmlBean;
import com.cpcus.oxygen.beans.WidgetXmlBean;
import com.cpcus.oxygen.utils.AtmProperties;
import com.cpcus.oxygen.utils.SystemConsts;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Jsontest
{
  private static final Gson GSON = new Gson();
  private static URL testcaseXmlFolder;

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    PageXmlBean p = new PageXmlBean();
    p.setName("testpage");
    // p.setType("PropertyPage");
    WidgetXmlBean w = new WidgetXmlBean();
    w.setName("testWidget");
    w.setType("SLink");
    ElementXmlBean element = new ElementXmlBean();
    element.setIdentifier("button");
    element.setSelector("#testLink");
    w.addElement(element);
    p.putWidget(w);
    WidgetXmlBean w1 = new WidgetXmlBean();
    w1.setName("testWidget1");
    w1.setType("SLink");
    ElementXmlBean element1 = new ElementXmlBean();
    element1.setIdentifier("button");
    element1.setSelector("#testLink");
    w1.addElement(element1);
    ElementXmlBean element2 = new ElementXmlBean();
    element2.setIdentifier("button");
    element2.setSelector("#testLink");
    w1.addElement(element2);
    p.putWidget(w1);
    Gson g = new GsonBuilder().setExclusionStrategies(new ExclusionStrategy()
    {

      @Override
      public boolean shouldSkipClass(Class<?> arg0)
      {
        return false;
      }

      @Override
      public boolean shouldSkipField(FieldAttributes attr)
      {
        return attr.getName().equals("widgets");
      }

    }).create();
    String s = g.toJson(p);// .fromJson(content, PageXmlBean.class);

    System.out.println(s);

    try
    {
      File f = Paths.get(Paths.get(getTestCaseFolder().toURI()).toString(), p.getName() + ".xml").toFile();
      FileOutputStream file = new FileOutputStream(f);

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      JAXBContext jaxb = JAXBContext.newInstance(PageXmlBean.class);
      Marshaller marshaller = jaxb.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      marshaller.marshal(p, file);
      System.out.println(out.toString());
    }
    catch (Exception e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  static URL getTestCaseFolder()
  {
    if (testcaseXmlFolder == null)
    {
      String path = AtmProperties.getInstance().getProperty("testcase.location");
      if (path != null && !"".equals(path.trim()))
      {
        try
        {
          testcaseXmlFolder = new File(AtmProperties.getInstance().getProperty("testcase.location")).toURI().toURL();
        }
        catch (IOException e)
        {
          testcaseXmlFolder = SystemConsts.DEFAULT_TESTCASE_FOLDER;
        }
      }
      else
      {
        testcaseXmlFolder = SystemConsts.DEFAULT_TESTCASE_FOLDER;
      }
    }
    return testcaseXmlFolder;
  }

}
