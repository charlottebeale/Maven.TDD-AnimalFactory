package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {

        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        dog.setName(givenName);

        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog milo = new Dog("", givenBirthDate, 0);

        String expected = "bark!";

        String actual = milo.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog milo = new Dog("", givenBirthDate, 0);

        Date expected = new Date();

        milo.setBirthDate(expected);

        Date actual = milo.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog milo = new Dog("", givenBirthDate, 0);

        Food food1 = new Food();
        int actual = milo.getNumberOfMealsEaten();
        int expected = actual + 1;

        milo.eat(food1);
        actual = milo.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void implementAnimalTest() {
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog milo = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertEquals(milo instanceof Animal);
    }
    @Test
    public void implementMammalTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog milo = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(Milo instanceof Mammal);
    }

}
