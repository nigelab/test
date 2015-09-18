package json;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlAdapter;

abstract class AbstractAnimalImpl implements Animal
{

  static abstract class Adapter extends XmlAdapter<List<AbstractAnimalImpl>, List<Animal>>
  {
    public Animal unmarshal(AbstractAnimalImpl v)
    {
      return v;
    }

    public AbstractAnimalImpl marshal(Animal v)
    {
      return (AbstractAnimalImpl) v;
    }
  }
}