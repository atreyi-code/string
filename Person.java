public class Person {
    // Attributes (Fields)
    private String name;
    private int age;
    private String gender;

    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        Person p1 = new Person("Atreyi", 25, "Female");
        p1.displayInfo();

        // Modify attributes using setters
        p1.setAge(26);
        System.out.println("Updated Age: " + p1.getAge());
    }
}

