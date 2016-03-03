package json;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;

@XmlRootElement
public class Dog implements Animal//extends AbstractAnimalImpl
{
  private String name;

  @XmlElement
  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  /*static class Adapter extends XmlAdapter<Dog, Animal>
  {
    public Animal unmarshal(Dog v)
    {
      return v;
    }

    public Dog marshal(Animal v)
    {
      return (Dog) v;
    }
  }*/
}
