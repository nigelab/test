package com.cpcus.oxygen;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cpcus.oxygen.task.support.TestVariable;

public class StringTest
{
  private static final Logger LOG = LoggerFactory.getLogger(StringTest.class);
  public static void main(String[] args)
  {
    final Pattern NEW_VARIABLE_PATTERN = Pattern.compile("\\$\\{([A-Za-z0-9\\.]+)\\}");
    final Pattern VARIABLE_PATTERN = Pattern.compile("^@([A-Za-z0-9]+)");
//    final Pattern MERGE_VARIABLE_PATTERN = Pattern.compile("^@([A-Za-z0-9]+).*\\$\\{([A-Za-z0-9\\.]+)\\}");
    // TODO Auto-generated method stub
    /*
     * if ("00:00:05".matches("^[0-9]{2}:[0-9]{2}:[0-9]{2}$")) {
     * System.out.println("Matches!"); } else {
     * System.out.println("Not Match!"); }
     */
    Map<String, String> map = new HashMap<>();
    map.put("var1", "${var3}");
    map.put("var2", "value2");
    map.put("var3", "value3");

    String value = "@var1-cvbner${var2}sadgsad23";
    Matcher matcher1 = VARIABLE_PATTERN.matcher(value);
    StringBuffer buffer1 = new StringBuffer();

    while (matcher1.find())
    {
      String convertedValue = map.get(matcher1.group(1));
//      convertedValue.re
      
      convertedValue = convertedValue.replaceAll("\\$", "\\\\\\$");
      
      matcher1.appendReplacement(buffer1, convertedValue);
    }
    matcher1.appendTail(buffer1);

    Matcher matcher2 = NEW_VARIABLE_PATTERN.matcher(buffer1.toString());
    StringBuffer buffer2 = new StringBuffer();

    while (matcher2.find())
    {
      String convertedValue = map.get(matcher2.group(1));
      convertedValue = convertedValue.replaceAll("\\$", "\\\\\\$");
      matcher2.appendReplacement(buffer2, convertedValue);
    }
    matcher2.appendTail(buffer2);
    /*
     * if (value.matches("^@([A-Za-z0-9]+).*\\$\\{([A-Za-z0-9\\.]+)\\}.*")) {
     * System.out.println("Matches!"); } else {
     * System.out.println("Not Match!"); }
     */

    
    System.out.println("SRC=" + value + "\n" + "NEW=" + buffer2.toString());
    
    
    
    final String regex = "(.*)\\.(.*)@emrsn";
    final Pattern p = Pattern.compile(regex);
    String scmUserName = "nigel.zheng@emrsn";
    final Matcher m = p.matcher(scmUserName);
    if (m.find()) {
      LOG.debug("Extracted user {} using regex {} and return {}", scmUserName, regex, m.group(1));
      if(m.groupCount()>1){
        LOG.debug("last name={}", m.group(2));
      }
    }
    
    String s = "";
    if(s instanceof java.lang.Object){
      LOG.debug("s instanceof Object");
    }
    if(!s.getClass().getSimpleName().equals("Object")){
      LOG.debug("s simplename={} not Object",s.getClass().getSimpleName());
    }
  }

}
