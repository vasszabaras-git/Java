package gr.aueb.cf.cf9.ch15_Interface._3lesson_marker_interface;

public class disc implements Item{

    private int id;
    private String title;

    public disc() {

    }

    public disc(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
