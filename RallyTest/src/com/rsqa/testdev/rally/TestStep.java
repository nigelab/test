package com.rsqa.testdev.rally;

public class TestStep
{
  private String input;
  private String expectedResult;
  private String _ref;
  private int stepIndex;

  public String getInput()
  {
    return input;
  }

  public void setInput(String input)
  {
    this.input = input;
  }

  public String getExpectedResult()
  {
    return expectedResult;
  }

  public void setExpectedResult(String expectedResult)
  {
    this.expectedResult = expectedResult;
  }

  public String getRef()
  {
    return _ref;
  }

  public void setRef(String _ref)
  {
    this._ref = _ref;
  }

  public int getStepIndex()
  {
    return stepIndex;
  }

  public void setStepIndex(int stepIndex)
  {
    this.stepIndex = stepIndex;
  }
}
