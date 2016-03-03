package json;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBinterfaceTest
{

  public static void main(String[] args) throws JAXBException
  {
    Zoo zoo = new Zoo();
    Dog dog = new Dog();
    Cat cat = new Cat();
    cat.setAge(5);
    dog.setName("Dola");
    zoo.addAnimal(dog);
    zoo.addAnimal(cat);
    // TODO Auto-generated method stub
    JAXBContext jaxb = JAXBContext.newInstance(Zoo.class,Cat.class,Dog.class);
    Marshaller marshaller = jaxb.createMarshaller();
//    marshaller.setAdapter(new AnyAnimalAdapter());
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//    StringWriter result = new StringWriter();
    marshaller.marshal(zoo, System.out);
//    System.out.println(result.toString());
  }

}
