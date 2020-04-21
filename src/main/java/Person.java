public class Person {

    private String name;
    private int age;
    private String play;

    public Person(String name, int age, String play) {
        this.name = name;
        this.age = age;
        this.play = play;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String getPlay() {
        return play;
    }

    public String StayPlay(String play) {

        if (play.equals(getPlay())) {
            return "True";

        }

        else{
            return "False";
        }
    }

}