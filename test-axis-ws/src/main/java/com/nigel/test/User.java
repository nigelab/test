package com.nigel.test;

public class User
{
  private String name;

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String welcome()
  {
    return "Welcome, " + name;
  }
}
