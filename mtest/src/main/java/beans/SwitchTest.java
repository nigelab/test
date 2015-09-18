package beans;

public class SwitchTest
{

  public static void main(String[] args)
  {
    String info = "A";
    String res = null;
    // TODO Auto-generated method stub
    switch (info)
    {
      case "A":
      case "B":
        res = info+"x";
        break;
      case "C":
        res = "C";
        break;

    }
    
    System.out.println(res);
  }

}
