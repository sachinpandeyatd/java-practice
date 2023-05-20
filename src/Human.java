public class Human {
    String name;
    int age;
    String gender;
    static int population;

    public Human() {
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        Human.population += 1;
    }

    @Override
    public String toString() {
        return "I am " + name + ", and my age is " + age;
    }
}
