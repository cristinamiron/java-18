package homework3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> personList = new TreeSet<>();
        personList.add(new Person("Ana", 22));
        personList.add(new Person("Marius", 29));
        personList.add(new Person("Cosmin", 25));
        personList.add(new Person("Raul", 27));

        for (Person person : personList) {
            System.out.println("Person name is:" + " " + person.getName() + " " + "and person age is:" + " " + person.getAge());
        }

        List<Hobby> hobbies = new ArrayList<>();
        hobbies.add(new Hobby("cycling", 4, "France"));
        hobbies.add(new Hobby("swimming", 1, "Hungary"));
        hobbies.add(new Hobby("hyking", 2, "Greece"));
        hobbies.add(new Hobby("reading", 10, "Romania"));

        for (Hobby hobby: hobbies) {
            System.out.println(hobbies);
        }

        Map<Person, List<Hobby>> personToHobby = new LinkedHashMap<>();
        personToHobby.put((Person) personList, hobbies);

        System.out.println(personToHobby);
    }


}







