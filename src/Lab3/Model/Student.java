package Lab3.Model;
import Lab3.Model.Person;
public class Student extends Person{
    private int studentNumber;
    private double averageMark;
    private int classNumber;

    public Student(String name, String phoneNumber, String emailAddress, int studentNumber, double averageMark, int classNumber) {
        super(name, phoneNumber, emailAddress);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.classNumber = classNumber;
    }

    public Student(int studentNumber, double averageMark, int classNumber) {
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.classNumber = classNumber;
    }

    public Student() {}

    public void setStudentNumber(int studentNumber) { this.studentNumber = studentNumber; }
    public void setAverageMark(double averageMark) { this.averageMark = averageMark; }
    public void setClassNumber(int classNumber) { this.classNumber = classNumber; }

    public int getStudentNumber() { return studentNumber; }
    public double getAverageMark() { return averageMark; }
    public int getClassNumber() { return classNumber; }

}
