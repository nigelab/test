package json;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class GetTree
{
  private static final Logger LOG = LoggerFactory.getLogger(GetTree.class);
  public static void main(String[] args) throws IOException
  {
    // TODO Auto-generated method stub
    Map<Path, Node> tree = new GetTree().getTree();
    Map<String, String> treenew = new HashMap<String, String>();
    List<Node> list = new ArrayList<Node>();
    for (Entry<Path, Node> entry : tree.entrySet())
    {
      treenew.put(entry.getKey().getFileName().toString(), entry.getValue().toString());
      list.add(entry.getValue());
      LOG.error("path={},id={},pid={},name={}",entry.getKey(),entry.getValue().getId(),entry.getValue().getPid(),entry.getValue().getName());
    }
    Gson GSON = new Gson();//Builder().enableComplexMapKeySerialization().create();  ;
//    tree
//    GSON.toJson(tree.values());
    String json = GSON.toJson(list);
//    JSONObject jsonObject = JSONObject.getNames(tree); 
    LOG.error(json);
  }

  private Map<Path, Node> getTree() throws IOException
  {
    final Map<Path, Node> tree = new HashMap<Path, Node>();
    final Path path = Paths.get("D:", "VOCS.PRO");
    Files.walkFileTree(path, new SimpleFileVisitor<Path>()
    {
      int id = 0;

      @Override
      public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException
      {
        // �����ļ���֮ǰ����
//        System.out.println("pathcount=" + path.getNameCount() + " dircount=" + dir.getNameCount());
        if (!dir.equals(path))
        {
          Path subPath = dir.subpath(path.getNameCount(), dir.getNameCount());
          Node node =new Node();
          /*
           * if(!dir.getParent().equals(parent)){ pid = node.getId(); }
           */
          node.setId(++id).setName(subPath.getFileName().toString());// .setPid(pid);
          tree.put(subPath, node);
          // parent = dir.getParent();
          if (subPath.getParent() == null)
          {
            node.setPid(0);
          }
          else
          {
            node.setPid(tree.get(subPath.getParent()).getId());
          }
          System.out.println("preDir=" + dir + " sub=" + subPath.getFileName() + " parent=" + subPath.getParent() + " pid=" + node.getPid()
              + " id=" + node.getId());
        }
        return FileVisitResult.CONTINUE;

      }
      /*
       * @Override public FileVisitResult visitFile(Object file,
       * BasicFileAttributes attrs) throws IOException { // �����ļ����� //
       * System.out.println("vfile="+file); return FileVisitResult.CONTINUE; }
       * 
       * @Override public FileVisitResult visitFileFailed(Object file,
       * IOException exc) throws IOException { // �����ļ�ʧ��ʱ���� return
       * FileVisitResult.CONTINUE; }
       * 
       * @Override public FileVisitResult postVisitDirectory(Object dir,
       * IOException exc) throws IOException { // �����ļ���֮�����
       * System.out.println("postDir=" + dir); return FileVisitResult.CONTINUE;
       * }
       */

    });
    return tree;
  }

  public class Node
  {
    private int id;
    private int pid;
    private String name;
    /*private Path path;*/
    private String comment;

    public int getId()
    {
      return id;
    }

    public Node setId(int id)
    {
      this.id = id;
      return this;
    }

    /*
     * public Node setId() { this.id++; return this; }
     */
    public int getPid()
    {
      return pid;
    }

    public Node setPid(int pid)
    {
      this.pid = pid;
      return this;
    }

    public String getName()
    {
      return name;
    }

    public Node setName(String name)
    {
      this.name = name;
      return this;
    }

    public String getComment()
    {
      return comment;
    }

    public Node setComment(String comment)
    {
      this.comment = comment;
      return this;
    }

    /*public Path getPath()
    {
      return path;
    }

    public void setPath(Path path)
    {
      this.path = path;
    }*/
    
    /*public String toString(){
      return this.name+":"+this.id;
    }*/
  }

  public void EncryptFile(String path)
  {
    File f = new File(path);
    if (f.isDirectory())
    {
      File[] fList = f.listFiles();// ��ȡĿ¼���ļ��б�
      int count = fList.length;
      for (int j = 0; j < count; j++)
      {
        if (fList[j].isDirectory())
        {
          this.EncryptFile(path + "\\" + fList[j].getName());// ��ΪĿ¼��ݹ�
        }
        else
        {

        }
      }
    }
  }
}
