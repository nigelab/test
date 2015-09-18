package json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class parrtenTest
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Pattern VARIABLE_PATTERN = Pattern.compile("[^\\w]+@([A-Za-z0-9]+)");
    String s = "@abc";
    Matcher m = VARIABLE_PATTERN.matcher(s);
    System.out.println("count="+m.groupCount());        
    while (m.find()){
      for(int i=0;i<=m.groupCount();i++){
        System.out.println(i+"#"+m.group(i));        
      }
    }
  }

}
