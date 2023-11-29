public class Human {
    String name;
    String surname;
    int age;
    boolean isMan;
    String hobbies;
    void displayInfo () {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Is it a man? " + isMan);
        System.out.println("Hobbies: " + hobbies);
        System.out.println("Hi, " + name + "!");
    }

   public Human (String name, String surname, int age, boolean isMan, String hobbies) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMan = isMan;
        this.hobbies = hobbies;

    }
}