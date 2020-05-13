public class Person {
    protected String firstName;
    protected String lastName;
    protected String middleName;

    public Person() {}

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
    }

    protected String getFullName() {
        return String.format("%s %s %s", firstName, middleName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        Person other = (Person) obj;
        return firstName.equals(other.firstName);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode();
    }
}
