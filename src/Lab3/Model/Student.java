package Lab3.Model;
import Lab3.Model.Person;
public class Student extends Person{
    private int studentNumber;
    private float averageMark;
    private String clasa;

    public Student(Person person) {
        super(person.getName(), person.getPhoneNumber(), person.getEmailAddress());
    }

    public void setStudentNumber(int studentNumber) { this.studentNumber = studentNumber; }
    public void setAverageMark(float averageMark) { this.averageMark = averageMark; }
    public void setClasa(String clasa) { this.clasa = clasa; }

    public int getStudentNumber() { return studentNumber; }
    public float getAverageMark() { return averageMark; }
    public String getClasa() { return clasa; }

    @Override
    public String toString() {
        return "Student{" +
                " name= '" + getName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", studentNumber= '" + studentNumber + '\'' +
                ", averageMark= '" + averageMark + '\'' +
                ", clasa=" + clasa +
                '}';
    }
}
