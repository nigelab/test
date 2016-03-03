package test;

public class Decorator implements Action
{
  private Action action;

  public Decorator(Action action)
  {
    this.action = action;
  }

  public Action getAction()
  {
    return action;
  }

  public void setAction(Action action)
  {
    this.action = action;
  }

  @Override
  public void sampleOperation()
  {
    // TODO Auto-generated method stub
    action.sampleOperation();
  }
}
