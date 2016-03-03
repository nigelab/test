package com.rsqa.testdev.rally;

import java.util.List;

public class TestCaseStep
{
  private List<TestStep> steps;
  private String _ref;

  public String getRef()
  {
    return _ref;
  }

  public void setRef(String _ref)
  {
    this._ref = _ref;
  }

  public List<TestStep> getSteps()
  {
    return steps;
  }

  public void setSteps(List<TestStep> steps)
  {
    this.steps = steps;
  }
}
