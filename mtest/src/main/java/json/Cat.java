package json;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;

@XmlRootElement
public class Cat implements Animal//extends AbstractAnimalImpl
{
  private int age;

  @XmlElement
  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  /*static class Adapter extends XmlAdapter<Cat, Animal>
  {
    public Animal unmarshal(Cat v)
    {
      return v;
    }

    public Cat marshal(Animal v)
    {
      return (Cat) v;
    }
  }*/
}
