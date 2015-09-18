package beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest
{

  public static void main(String[] args)
  {

    Hashtable<String, ArrayList<String>> archivedProjectTable = new Hashtable<String, ArrayList<String>>();

    archivedProjectTable.put("2014", new ArrayList<String>()
    {
      {
        add("4s");
        add("4a");
        add("4b");
        add("4x");
      }
    });
    archivedProjectTable.put("2015", new ArrayList<String>()
    {
      {
        add("5s");
        add("5a");
        add("5b");
        add("5x");
      }
    });
    archivedProjectTable.put("2013", new ArrayList<String>()
    {
      {
        add("3gs");
        add("3a");
        add("3b");
        add("3x");
      }
    });
    archivedProjectTable.put("2012", new ArrayList<String>()
    {
      {
        add("2");
        add("2a");
        add("2b");
        add("2x");
      }
    });

    sortArchiveProjects(archivedProjectTable);

  }

  private static Map<String, List<String>> sortArchiveProjects(Hashtable<String, ArrayList<String>> archivedProjectTable)
  {
    List<Map.Entry<String, ArrayList<String>>> infoIds = new ArrayList<Map.Entry<String, ArrayList<String>>>(archivedProjectTable.entrySet());
    Map<String, List<String>> archivedProjectMap = new LinkedHashMap<String, List<String>>();
    Collections.sort(infoIds, new Comparator<Map.Entry<String, ArrayList<String>>>()
    {
      public int compare(Map.Entry<String, ArrayList<String>> o1, Map.Entry<String, ArrayList<String>> o2)
      {
        // return (o2.getValue() - o1.getValue());
        return (o2.getKey()).toString().compareTo(o1.getKey());
      }
    });
    for (int i = 0; i < infoIds.size(); i++)
    {
      archivedProjectMap.put(infoIds.get(i).getKey(), infoIds.get(i).getValue());
    }

    for (Entry<String, List<String>> entry : archivedProjectMap.entrySet())
    {
      System.out.println(entry);
    }
    return archivedProjectMap;
  }

}
