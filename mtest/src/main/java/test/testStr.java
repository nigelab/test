package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.cpcus.oxygen.utils.StringUtils;

import junit.framework.Assert;

public class testStr
{

  public static void main(String[] args) throws IOException
  {
    // TODO Auto-generated method stub
    String a = "GLOBAL DATA?REFR PHASE IN,GLOBAL DATA?HVAC PHASE IN";
    String b = "GLOBAL DATA?REFR PHASE IN,GLOBAL DATA?HVAC PHASE IN";
    Assert.assertEquals(a, b);

    List<List<String>> allRowsValues = new ArrayList<List<String>>()
    {
      {
        add(new ArrayList<String>()
        {
          {
            add("test str");
            add("str test ,$");
          }
        });
        add(new ArrayList<String>()
        {
          {
            add("test str1");
            add("str test1 ,$");
          }
        });
      }
    };
    List<String> allRowsValuesToList = new ArrayList<String>();
    for (List<String> oneRowsValues : allRowsValues)
    {
      allRowsValuesToList.add(StringUtils.joinByComma(oneRowsValues));
      System.out.println(allRowsValuesToList.toString());
      allRowsValuesToList.get(allRowsValuesToList.size() - 1).replace(" ,$", "");
    }
    System.out.println(allRowsValuesToList.toString());
    
    
    
    String fileName = "D:/rsttws.sql";
    File f = new File(fileName);

    InputStream input = null;
    BufferedReader b1 = null;
    try
    {
      input = new FileInputStream(f);
      b1 = new BufferedReader(new InputStreamReader(input));
      String value = b1.readLine();

      int count = 0;

      if (value != null)
      {
        while (value != null)
        {
          count++;
          value = b1.readLine();
        }
      }
      System.out.println("count="+count);
    }
    finally
    {
      b1.close();
      input.close();
    }


    System.out.println("count="+FileUtils.readLines(f).size());
  }

}
