import java.util.*;

class Person {
    private String lastName;
    private String firstName;
    private String mobileNumber;

    public Person(String lastName, String firstName, String mobileNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.mobileNumber = mobileNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + mobileNumber;
    }
}

public class PersonClass {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Chander", "Singh", "789456132"));
        persons.add(new Person("Chander", "Veer", "789456132"));
        persons.add(new Person("Anil", "Dutt", "123456789"));
        persons.add(new Person("Bablu", "Rathi", "456123789"));
        persons.add(new Person("Chander", "Veer", "229456132"));
        persons.add(new Person("Devander", "Jangid", "489456132"));
        persons.add(new Person("Devander", "Pal", "909456132"));
        persons.add(new Person("Devander", "Pal", "78456132"));

        // Custom comparator
        Comparator<Person> comparator = Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getMobileNumber);

        // Sort the list
        persons.sort(comparator);

        // Print sorted list
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
