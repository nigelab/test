package json;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AnimalAdapter extends XmlAdapter<Dog, Animal>
{

  @Override
  public Dog marshal(Animal v) throws Exception
  {
    // TODO Auto-generated method stub
    return (Dog) v;
  }

  @Override
  public Animal unmarshal(Dog v) throws Exception
  {
    // TODO Auto-generated method stub
    return v;
  }

}
