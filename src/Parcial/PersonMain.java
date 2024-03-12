package Parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList =new ArrayList<>();
        PersonaImpl persona1 = new PersonaImpl("Juan jose","Ordoñez",12);
        personList.add(persona1);
        PersonaImpl persona2 = new PersonaImpl("Arle","Perez",40);
        personList.add(persona2);


        Optional<Person> findPerson = personList.stream().filter(person -> person.getName().equals("Juan Jose")).findFirst();
        personList.set(0, new PersonaImpl("Juan jose","Ordoñez",20));
        personList.removeIf(person -> person.getName().equals("Arle"));

        personList.forEach(System.out::println);
}
}
