package com.cpcus.oxygen;

public class InstanceofTest
{
  public static void main(String[] args)
  {
    A a = null;
    B b = null;
    boolean res;
    System.out.println("instanceoftest test case 1: ------------------");
    res = a instanceof A;
    System.out.println("a instanceof A: " + res);

    res = b instanceof A;
    System.out.println("b instanceof B: " + res);
    System.out.println("\ninstanceoftest test case 2: ------------------");

    a = new B();
    b = new B();
    res = a instanceof A;
    System.out.println("a instanceof A: " + res);
    res = a instanceof B;
    System.out.println("a instanceof B: " + res);
    res = b instanceof A;
    System.out.println("b instanceof A: " + res);
    res = b instanceof B;
    System.out.println("b instanceof B: " + res);
    System.out.println("\ninstanceoftest test case 3: ------------------");

    B b2 = (B) new C();
    res = b2 instanceof A;
    System.out.println("b2 instanceof A: " + res);
    res = b2 instanceof B;
    System.out.println("b2 instanceof B: " + res);
    res = b2 instanceof C;
    System.out.println("b2 instanceof C: " + res);

    C c = new C();
    res = a instanceof java.lang.Object;
    System.out.println("a instanceof Object: " + res);
    res = b instanceof java.lang.Object;
    System.out.println("b instanceof Object: " + res);
    res = c instanceof java.lang.Object;
    System.out.println("c instanceof Object: " + res);

    B b3 = (B) new Object();
    res = b3.getClass().equals(java.lang.Object.class);
    System.out.println("c instanceof Object: " + res);
  }
  
  private void getAnnotation(Class<?> type){
    if(type instanceof java.lang.Object){
      
    }
  }
}