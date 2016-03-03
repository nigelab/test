package json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileUtilTest
{

  public static void main(String[] args) throws IOException
  {
    // TODO Auto-generated method stub
    File file = new File("d:/xxx.txt");
    FileUtils.writeStringToFile(file, "asdgsaddhsd\n", "UTF-8", false);
    FileUtils.writeStringToFile(file, "a", "UTF-8", true);
    FileUtils.writeStringToFile(file, "s", "UTF-8", true);
    FileUtils.writeStringToFile(file, "s", "UTF-8", true);
    FileUtils.writeStringToFile(file, " x", "UTF-8", true);
    FileUtils.writeStringToFile(file, "sag", "UTF-8", true);
    
    FileUtils.write(file, "c\n", "UTF-8", true);
    FileUtils.write(file, "d", "UTF-8", true);
    FileUtils.write(file, "e", "UTF-8", true);
    FileUtils.write(file, "f", "UTF-8", true);
    FileUtils.write(file, "g", "UTF-8", true);
    
    List<String> lines = new ArrayList<>();
    lines.add("z");
    lines.add("x");
    lines.add("f");
    lines.add("h");
    lines.add("y");
    FileUtils.writeLines(file, "UTF-8", lines , true);
  }

}
