package json;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringCompare
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Set<String> pages = new HashSet<String>();
    pages.add("homePage");
    pages.add("footPage");
    pages.add("sootPage");
    pages.add("sfotPage");
    pages.add("xoPage");

    StringBuilder builder = new StringBuilder();
    // pages.toArray();
    for (String name : pages)
    {
      if (builder.length() > 0)
      {
        builder.append(",").append(name);
      }
      else
      {
        builder.append(name);
      }
    }
    TreeSet<String> ts = new TreeSet<String>();
    for (String name : pages)
    {
//      name.compareTo(anotherString)
      ts.add(name);
    }
    String pagestr = builder.toString();
    //TreeSet<String> ts = (TreeSet<String>) pages;
    System.out.println(pages.toString());
    System.out.println(ts.toString());
    System.out.println(pagestr);
  }

}
