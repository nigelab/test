package json;

public class StringArrayTest
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    String[] paramarray = new String[1];
    paramarray[0] = "GOGOGO";
    Object[] newparameters = new Object[1];
    newparameters[0] = paramarray;
    
    System.out.println(((String[])newparameters[0])[0]);
  }

}
