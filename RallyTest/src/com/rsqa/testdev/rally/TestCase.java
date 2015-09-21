package com.rsqa.testdev.rally;

public class TestCase
{
  private String name;
  private String notes;
  private String objective;
  private String type;
  private String method;
  private String priority;
  private String preConditions;
  private String postConditions;
  private UserBean owner;
  private TestFolder testFolder;
  private WorkProduct workProduct;

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getNotes()
  {
    return notes;
  }

  public void setNotes(String notes)
  {
    this.notes = notes;
  }

  public String getObjective()
  {
    return objective;
  }

  public void setObjective(String objective)
  {
    this.objective = objective;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public String getMethod()
  {
    return method;
  }

  public void setMethod(String method)
  {
    this.method = method;
  }

  public String getPriority()
  {
    return priority;
  }

  public void setPriority(String priority)
  {
    this.priority = priority;
  }

  public String getPreConditions()
  {
    return preConditions;
  }

  public void setPreConditions(String preConditions)
  {
    this.preConditions = preConditions;
  }

  public String getPostConditions()
  {
    return postConditions;
  }

  public void setPostConditions(String postConditions)
  {
    this.postConditions = postConditions;
  }

  public UserBean getOwner()
  {
    return owner;
  }

  public void setOwner(UserBean owner)
  {
    this.owner = owner;
  }

  public TestFolder getTestFolder()
  {
    return testFolder;
  }

  public void setTestFolder(TestFolder testFolder)
  {
    this.testFolder = testFolder;
  }

  public WorkProduct getWorkProduct()
  {
    return workProduct;
  }

  public void setWorkProduct(WorkProduct workProduct)
  {
    this.workProduct = workProduct;
  }

}
