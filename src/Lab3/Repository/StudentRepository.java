package Lab3.Repository;
import Lab3.Model.Person;
import Lab3.Model.Profesor;
import Lab3.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students;

    public StudentRepository(){
        this.students = new ArrayList<>();
    }

    public void create(Student student){
        students.add(student);
    }

    public Student read(String name){
        if (!students.isEmpty()){
            for (Student s : students){
                if (s.getName().equals(name)){
                    return s;
                }
            }
        }
        return null;
    }

    public void delete(Student student){
        students.remove(student);
    }
}
