package Parcial;

public class PersonaImpl implements Person {
    private String name;
    protected String lastName;
    private int age;

    public PersonaImpl(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
this.lastName = lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setLastName(int age) {
this.age = age;
    }

    @Override
    public String toString() {
        return "Data "+ "\n" +
                "name: " + name + "\n" +
                "lastName: " + lastName + "\n" +
                "age: " + age;
    }
}
