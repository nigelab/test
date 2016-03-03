package com.nigel.rest;

public class Book
{
  private Integer id;
  private String name;
  private double price;

  // æ— å‚æ•°çš„æ„é?å™?
  public Book(int i, String string, int j)
  {
    this.id = i;
    this.setName(string);
    this.setPrice(j);
  }

  public Book()
  {
    // TODO Auto-generated constructor stub
  }

  // id å±æ?çš?setter å’?getter æ–¹æ³•
  public void setId(Integer id)
  {
    this.id = id;
  }

  public Integer getId()
  {
    return this.id;
  }
  // çœç•¥ name å’?price çš?setter å’?getter æ–¹æ³•

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }
}
