package gr.aueb.cf.cf9.ch16._1lesson_javabeans;

public class main {

    public static void main(String[] args) {
        Book book1 = new Book.Builder(1, "A123").build();
        Book book2 = new Book.Builder(2, "B456")
                .author("Androutsos")
                .title("Java")
                .build();

        Book book3 = new Book.Builder(3, "C456")
                .title("JavaScript")
                .build();
    }
}

//new Book.Builder(3, "C456") an object created
//.title("JavaScript") sets builder.title = "javascript"

