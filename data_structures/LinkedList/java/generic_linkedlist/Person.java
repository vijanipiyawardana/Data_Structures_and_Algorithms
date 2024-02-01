import java.util.Comparator;

// make sure Person implements Comparable interface in order to use it as a Node
public class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // return "Person [name=" + name + "]";
        return name;
    }

    // to compare two objects
    @Override
    public int compareTo(Person person) {
        return Comparator.comparing(Person::getName)
                .thenComparingInt(Person::getAge).compare(this, person);
    }

}
