package test;

import java.io.IOException;

import javax.xml.bind.DatatypeConverter;

import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

public class TestCodec
{
  public static void main(String[] args) throws IOException
  {
    String text = "Test BASE64Encoder vs Base64";

    String encoded = new BASE64Encoder().encode(text.getBytes("UTF-8"));
    byte[] result = new BASE64Decoder().decodeBuffer(encoded);

    String encoded1 = DatatypeConverter.printBase64Binary(result);
    byte[] result1 = DatatypeConverter.parseBase64Binary(encoded1);

    byte[] encoded2 = Base64.encodeBase64(text.getBytes("UTF-8"));
    byte[] result2 = Base64.decodeBase64(encoded2);

    System.out.println(new String(result, "UTF-8"));
    System.out.println(new String(result1, "UTF-8"));
    System.out.println(new String(result2, "UTF-8"));
  }
}