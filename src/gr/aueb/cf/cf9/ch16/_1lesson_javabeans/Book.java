package gr.aueb.cf.cf9.ch16._1lesson_javabeans;

public class Book {

    private final long id;                                    //Book fields are final and set only once in a private constructor, so the object cannot be modified after creation.
    private final String title;
    private final String author;
    private final String isbn;

    private Book(Builder builder) {                          //The constructor is private, forcing object creation through Book.Builder.
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;
    }
//--------------------------------------------------------------
    public static class Builder {                            //Builder holds the same fields as Book.
        private final long id;
        private final String isbn;
        private String title = "";
        private String author = "";

        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }         //Required fields (id, isbn) are passed to the Builder constructor, guaranteeing they are always set.

        public Builder author(String author) {            // Fluent Setter - returns the Builder object - chaining
            this.author = author;
            return this;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
//--------------------------------------------------------------------
    public long getId() {return id; }
    public String getTitle() {return title; }
    public String getAuthor() {return author;}
    public String getIsbn() {return isbn;}
}