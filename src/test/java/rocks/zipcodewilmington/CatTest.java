package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
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

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
@Test
    public void setNameTest() {
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat phelix = new Cat("", givenBirthDate, 0);

        String giveName = "Phelix";

        String expected = giveName;
        phelix.setName("Phelix");
        String actual = phelix.getName();

        Assert.assertEquals(expected, actual);
}

@Test
    public void speakTest(){
        String givenName = "Phelix";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat phelix = new Cat("", givenBirthDate, 0);

        Date expected = "meow!";

        String actual = phelix.speak();

        Assert.assertEquals(expected, actual);
}

@Test
    public void setBirthDateTest(){
        String givenName = "Phelix";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat phelix = new Cat("", givenBirthDate, 0);

        Date expected = new Date();

        phelix.setBirthDate(expected);

        Date actual = phelix.getBirthDate();

        Assert.assertEquals(expected, actual);
}

@Test
    public void eatTest(){
        String givenName = "Phelix";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat phelix = new Cat("", givenBirthDate, 0);

        Food food1 = new Food();
        int actual = phelix.getNumberOfMealsEaten();
        int expected = actual + 1;

        phelix.eat(food1);
        actual = phelix.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);

}

@Test
    public void implementAnimalTest() {
        String givenName = "Phelix";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat phelix = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertEquals(phelix instanceof Animal);
}
@Test
    public void implementMammalTest(){
        String givenName = "Phelix";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat phelix = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertEquals(phelix instanceof Mammal);
}

}
