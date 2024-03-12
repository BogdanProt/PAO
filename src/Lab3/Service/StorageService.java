package Lab3.Service;
import java.util.ArrayList;
import java.util.List;
import Lab3.Model.Student;
import Lab3.Model.Person;
import Lab3.Model.Profesor;

public class StorageService {
    private List<Student> students;
    private List<Profesor> professors;

    public StorageService() {
        students = new ArrayList<>();
        professors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void addProfessor(Profesor profesor) {
        professors.add(profesor);
    }
    
}
