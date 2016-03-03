package json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatternTest
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
//    Pattern P = Pattern.compile("@([A-Za-z0-9]+)");
    String teststr = "application/ahu";
    Pattern P = Pattern.compile("^"+teststr+"/*(\\w+)/*$");
    Matcher m = P.matcher("application/ahu/generaltempcombinemethod/");
    if (m.find())
    {
      LOG.error("{},{}",m.groupCount(),m.group(1));
      
    }else{
      LOG.error("Not match");
    }
  }

  private static final Logger LOG = LoggerFactory.getLogger(PatternTest.class);
}
