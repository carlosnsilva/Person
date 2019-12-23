import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;



public class Test_Person {
    @Test

    public void playTest_1() {

        Person person = new Person("aaa", 21);
        Person person1 = Mockito.spy(person);

        Mockito.doReturn(true).when(person1).runInGround("ground");

        Assert.assertTrue(person1.isPlay());

    }

    @Test

    public void playTest_2(){

        Person person_2 = new Person("bbb", 20);
        Person person2 = Mockito.spy(person_2);

        Mockito.doReturn(true).when(person2).runInGround("ground");

        Assert.assertTrue(person2.isPlay());

    }

    @Test

    public void playTest_3(){

        Person person_3 = new Person("ccc", 22);
        Person person3 = Mockito.spy(person_3);

        Mockito.doReturn(true).when(person3).runInGround("not_ground");

        Assert.assertTrue(person3.isPlay());

    }

    @Test

    public void playTest_4(){

        Person person_4 = new Person("ddd",25);
        Person person4 = Mockito.spy(person_4);

        Mockito.doReturn(true).when(person4).runInGround("not_ground");

        Assert.assertTrue(person4.isPlay());


    }

}
