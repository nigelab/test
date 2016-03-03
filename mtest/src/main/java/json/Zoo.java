package json;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Zoo
{
  private List<Animal> animals = new ArrayList<Animal>();

  @XmlElementWrapper
  @XmlAnyElement
  public List<Animal> getAnimals()
  {
    return (ArrayList<Animal>) animals;
  }

  public void setAnimals(List<Animal> animals)
  {
    this.animals = animals;
  }

  public void addAnimal(Animal animal)
  {
    this.animals.add(animal);
  }

}
