package gr.aueb.cf.cf9.ch11_JavaBeans;
//Java Bean
//data class with private fields
//at least 1 deafult constructor
//getters setters with conventions
public class Student {

    private static int studentsCount = 0; //ta static anhkoun sth classh oxi sta instances, are stored in the methodArea

//    static {
//        studentsCount = 0 ;
//    }

    //3 instances sto heap
    private int id;                 //instances
    private String firstname;
    private String lastname;

    //default constructor
    public Student (){
        studentsCount ++ ;
    }

    // Overloaded constructor!!!!!!!!
    public Student(int id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount ++ ;
    }

    public static int getStudentsCount(){   //mesa apo static method de borw na kalesw ena non-static
        return studentsCount;
        //id = 0;                           //ta static mporei n uparxoun prin apo opoiodhpote instance ginei new
    }
//insttance methods getterssetters anhkoun sta objects
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
