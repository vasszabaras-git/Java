package gr.aueb.cf.cf9.ch16._4copyconstructor;

public class City {
    private String description;

    public City() {}

    public City(String description) {this.description = description;}

    // Copy Constructor
    public City(City city) {
        this.description = city.description;
    }

    //normal getter setter
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
}