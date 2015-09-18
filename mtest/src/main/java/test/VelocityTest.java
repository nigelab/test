package test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Vector;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import com.cpcus.oxygen.utils.StringUtils;

public class VelocityTest
{
  public class User
  {
    private String name;
    private String position;
    private String title;

    public User(String name, String position, String title)
    {
      this.name = name;
      this.position = position;
      this.title = title;
    }

    public String getPosition()
    {
      return position;
    }

    public void setPosition(String position)
    {
      this.position = position;
    }

    public String getTitle()
    {
      return title;
    }

    public void setTitle(String title)
    {
      this.title = title;
    }

    public String getName()
    {
      return name;
    }

    public void setName(String name)
    {
      this.name = name;
    }
  }

  public static void main(String[] args) throws Exception
  {
    Velocity.init();

    VelocityContext ctx = new VelocityContext();

    Object[] objs = { "word", "GLOBAL" };

    ctx.put("names", objs);

    Vector v = new Vector();
    v.addElement("Shanghai");
    v.addElement("Beijing");
    ctx.put("citys", v);

    User u = new VelocityTest().new User("Nigel", "QA", "Sr.Eng");
    ctx.put("user", u);

    Template tem = null;
    tem = Velocity.getTemplate("hello.html.vm");
    StringWriter writer = new StringWriter();
    tem.merge(ctx, writer);

    System.out.println(writer.toString());

    PrintWriter filewriter = new PrintWriter(new FileOutputStream("target/hello.html"), true);
    filewriter.print(writer.toString());
    filewriter.close();
    FileInputStream in = new FileInputStream(new File("C:\\temp.jpg"));
    String value = "Wyk+HjAxHTAyNzg3MDUdODQwHTAxOR0wMDAwMDAwMDAwMDAwMD" + "AdRkRFQh0wMDAwMDAwHTA0MB0dMS8xHTUwLjVMQh1OHVcgMzR0aCBTdHJlZXQdQ"
        + "XVzdGluHVRYHSAeMDYdMTBaR0QwMDQdMTFaUmVjaXBpZW50IENvbXBhbnkgTmFtZR0" + "xMlo5MDEyNjM3OTA2HTE0WioqVEVTVCBMQUJFTCAtIERPIE5PVCBTSElQKiodMjNaTh0"
        + "yMlocWR0yMFogHDAdMjZaNjEzMxwdHgQ=";
    Base64 decoder = new Base64();
    // byte[] imgBytes = decoder.decode(value);
    // FileOutputStream osf = new FileOutputStream(new
    // File("C:\\yourImage.png"));
    //
    //
    // byte[] outbyte = new ByteArrayInputStream(in);
    // osf.write(imgBytes);
    // osf.flush();
    byte[] outbyte = IOUtils.toByteArray(in);
    byte[] aa = decoder.encode(outbyte);
    //System.out.println(Arrays.toString(aa));
    @SuppressWarnings("resource")
    FileOutputStream osf = new FileOutputStream(new File("C:\\testImage.jpg"));

    osf.write(aa);
    osf.flush();
    byte[] ff = FileUtils.readFileToByteArray(new File("C:\\temp.jpg"));
    byte[] ss = decoder.encodeBase64URLSafe(FileUtils.readFileToByteArray(new File("C:\\temp.jpg")));
    //System.out.println(Arrays.toString(ss));

    //System.out.println(StringUtils.getBase64String(new File("C:\\temp.jpg")));
  }

  public static String getBase64String() throws IOException
  {
    FileInputStream fis = new FileInputStream("C:\\test.jpg");
    byte[] b3 = IOUtils.toByteArray(fis);
    String base64String = new sun.misc.BASE64Encoder().encode(b3);
    return base64String;
    // output of base64String is amF2YS5pby5GaWxlSW5wdXRTdHJlYW1AMTdlMDYwMA==
  }

  public static void main2(String[] args) throws Exception
  {
    Velocity.init();

    VelocityContext ctx1 = new VelocityContext();

    ctx1.put("name", "world");
    ctx1.put("city", "GuangZhou");

    VelocityContext ctx2 = new VelocityContext(ctx1);
    ctx2.put("name", "GLOBAL");

    Template tem = null;
    tem = Velocity.getTemplate("hello2.html.vm");
    StringWriter writer = new StringWriter();
    tem.merge(ctx2, writer);

    System.out.println(writer.toString());
    PrintWriter filewriter = new PrintWriter(new FileOutputStream("target/hello2.html"), true);
    filewriter.print(writer.toString());
    filewriter.close();
  }
}