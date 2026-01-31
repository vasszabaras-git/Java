package gr.aueb.cf.cf9.ch16._4copyconstructor;

public class Main {

    public static void main(String[] args) {
        // Original city and student
        City c1 = new City("New York");
        Student s1 = new Student();
        s1.setName("Alice");
        s1.setCity(c1);

        // Copy student using copy constructor
        Student s2 = new Student(s1);
        s2.setName("Bob");

        // Modify original city
        c1.setDescription("Los Angeles");
        System.out.println(s1.getCity().getDescription());
        // Print to show deep copy works
        System.out.println(s1.getName() + " lives in " + s1.getCity().getDescription()); // Alice, New York
        System.out.println(s2.getName() + " lives in " + s2.getCity().getDescription()); // Bob, New York
    }
}
/*
make a city and a student Alice which lives in tatt city.
copy that student and make her Bob.
change the city. Bob and helen should still live in the old one*/
