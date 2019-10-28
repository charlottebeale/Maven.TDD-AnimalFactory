package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;
/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

@Test
    public void addTest() {
    CatHouse.clear();

    String name = "Phelix";
    Date birthDate = new Date();

    CatHouse.add(AnimalFactory.createCat("Tiger", new Date()));
    CatHouse.add(AnimalFactory.createCat("Jaguar", new Date()));
    Cat animal = AnimalFactory.createCat(name, birthDate);
    CatHouse.add(animal);


    String expected = Cat.animal.getName();
    String actual = CatHouse.getCatById(animal.getId()).getName();

    Assert.assertEquals(expected, actual);
}

@Test
    public void removeTest() {
    CatHouse.clear();
    Cat max = AnimalFactory.createCat("Max", new Date());
    CatHouse.remove(max.getId());


    Integer expected = max.getId();
    Integer actual = CatHouse.getNumberOfCats();

    Assert.assertEquals(expected, actual);
}

@Test
    public void removeByCatTest() {
        CatHouse.clear();
        Cat max = AnimalFactory.createCat("Max", new Date());
        CatHouse.remove(max);

        Integer expected = max.getId();
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
}

@Test
    public void getCatByIdTest() {
    CatHouse.clear();
    Date birthDate = new Date();
    Cat max = AnimalFactory.createCat("Max", birthDate);

    int expected = max.getId();
    int actual = CatHouse.getNumberOfCats();

    Assert.assertEquals(expected, actual);
}

@Test
    public void getNumberOfCatsTest(){
    String name = "Emma";
    Date birthDate = new Date();
    Cat animal = AnimalFactory.createCat(name, birthDate);
    CatHouse.clear();

    CatHouse.add(animal);

    int expected = 1;
    int actual = CatHouse.getNumberOfCats();

    CatHouse.getNumberOfCats();

    Assert.assertEquals(expected, actual);
}


}

















