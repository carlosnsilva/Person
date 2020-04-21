//import org.junit.Assert;
import org.junit.Test;
//import org.mockito.Mockito;
import org.testng.*;
import org.openqa.selenium.*;

public class StayPlay {

    @Test
    public void Person1(){
        Person person_1 = new Person("test_name_1", 21, "Basket");

        Assert.assertEquals(person_1.StayPlay("Basket"), "True");
    }

    @Test
    public void Person2(){
        Person person_2 = new Person("test_name_2", 16, "Basket");

        Assert.assertEquals(person_2.StayPlay("Volei"), "False");
    }

    @Test
    public void Person3(){
        Person person_3 = new Person("test_name_3", 20, "Volei");

        Assert.assertEquals(person_3.StayPlay("Volei"), "True");
    }

    @Test
    public void Person4(){
        Person person_4 = new Person("test_name_4", 22, "Badminton");

        Assert.assertEquals(person_4.StayPlay("Badminton"), "True");
    }

    @Test
    public void Person5(){
        Person person_5 = new Person("test_name_5", 23, "Tenis");

        Assert.assertEquals(person_5.StayPlay("Badminton"), "False");
    }

    @Test
    public void Person6(){
        Person person_6 = new Person("test_name_6", 22, "Atletismo");

        Assert.assertEquals(person_6.StayPlay("Hockey"), "False");
    }

    @Test
    public void Person7(){
        Person person_7 = new Person("test_name_7", 22, "Futball");

        Assert.assertEquals(person_7.StayPlay("Jockey"), "False");
    }

    @Test
    public void Person8(){
        Person person_8 = new Person("test_name_8", 28, "Ski");

        Assert.assertEquals(person_8.StayPlay("Futball"), "False");
    }

    @Test
    public void Person9(){
        Person person_9 = new Person("test_name_9", 26, "Snowboard");

        Assert.assertEquals(person_9.StayPlay("Soccer"), "False");
    }
}
