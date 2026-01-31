package gr.aueb.cf.cf9.ch11_JavaBeans;

public class main {

    public static void main(String[] args) {

        Product milk = new Product(1L, "milk a", 1.5, 2, true);

        Customer customer = new Customer(); //afhnw default constructor

        User user = new User();
        User andreas22 = new User(1L, "andreas", "papa", "andr", "1234", true); //ctrl+p
        System.out.println(andreas22.getFirstname());


        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

//        alice.id = 1;
//        bob.id = 2;
//        student.firstname = "George";

        alice.setId(1);                    //setter
        alice.setFirstname("Alice");
        alice.setLastname("fhrufhr");

        Student student2 = new Student(4,"makis", "kapetis");//inject
        student2.setFirstname("Xrisostomos");//meto setter kanoume update

        System.out.println(alice.getId());
        System.out.println(alice.getFirstname());


        System.out.println(Student.getStudentsCount());

    }
}
