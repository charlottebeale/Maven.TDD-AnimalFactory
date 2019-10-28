package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();

        DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addTest() {
        DogHouse.clear();

        String name = "Milo";
        Date birthDate = new Date();

        DogHouse.add(AnimalFactory.createDog("Tiger", new Date()));
        DogHouse.add(AnimalFactory.createDog("Jaguar", new Date()));
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);


        String expected = ((Dog) animal).getName();
        String actual = DogHouse.getDogById(animal.getId()).getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        DogHouse.clear();
        Dog max = AnimalFactory.createDog("Max", new Date());
        DogHouse.remove(max.getId());


        Integer expected = max.getId();
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByDogTest() {
        DogHouse.clear();
        Dog max = AnimalFactory.createDog("Max", new Date());
        DogHouse.remove(max);

        Integer expected = max.getId();
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogsByIdTest() {
        DogHouse.clear();
        Date birthDate = new Date();
        Dog max = AnimalFactory.createDog("Max", birthDate);

        int expected = max.getId();
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest(){
        String name = "Emma";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        DogHouse.add(animal);

        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();

        DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }


}
