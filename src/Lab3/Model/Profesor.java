package Lab3.Model;
import Lab3.Model.Person;

public class Profesor extends Person{
    private String course;
    private int year;

    public Profesor(Person person) {
        super(person.getName(), person.getPhoneNumber(), person.getEmailAddress());
    }

    public String getCourse() { return course; }
    public int getYear() { return year; }

    public void setCourse(String course) { this.course = course; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Professor{" +
                " name= '" + getName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                '}';
    }
}
