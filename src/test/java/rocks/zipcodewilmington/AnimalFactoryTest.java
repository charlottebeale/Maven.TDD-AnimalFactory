package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDog() {
        String name = "Milo";
        Date birthDate = new Date();

        Dog animal = AminalFactory.createDog(name, birthDate);

        String expected = animal.getName();
        String actual = name;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCat() {
        String name = "Phelix";
        Date birthday = new Date;

        Cat animal = AnimalFactory.createCat(name, birthDate);

        String expected = animal.getName();
        String actual = name;

        Assert.assertEquals(expected, actual);
    }


}