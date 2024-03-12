package Lab3.Model;
import Lab3.Model.Person;

public class Profesor extends Person{
    private String course;
    private int year;

    public Profesor() {}
    public Profesor(String course, int year) {
        this.course = course;
        this.year = year;
    }

    public Profesor(String name, String phoneNumber, String emailAddress, String course, int year) {
        super(name, phoneNumber, emailAddress);
        this.course = course;
        this.year = year;
    }

    public String getCourse() { return course; }
    public int getYear() { return year; }

    public void setCourse(String course) { this.course = course; }
    public void setYear(int year) { this.year = year; }

}
