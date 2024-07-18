public class Person 
{
	private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to get the name
    public String getName() {
        return name;
    }

    // Public method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Public method to get the age
    public int getAge() {
        return age;
    }

    // Public method to set the age
    public void setAge(int age) {
        if (age > 0) { // A simple validation
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John Doe", 30);

        // Accessing private fields through public methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying private fields through public methods
        person.setName("Jane Doe");
        person.setAge(25);

        // Displaying updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
