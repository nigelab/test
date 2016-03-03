package com.cpcus.oxygen;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.velocity.tools.generic.DateTool;

public class test
{

  public static void main(String[] args) throws ParseException
  {
    // TODO Auto-generated method stub
    DateFormat dateFormat = new SimpleDateFormat("'ProtocolName_'yyyyMMdd'_language.pkg'", Locale.US);
    String s = "ProtocolName_12232015_language.pkg";
    Date d = dateFormat.parse(s);
    System.out.println(d.getTime());

    Date da = new Date();
    long l = 1348521625663L;
    DateTool cdt = new DateTool();
    System.out.println(cdt.format("yyyy-M-d H:m:s",l));
  }

}
