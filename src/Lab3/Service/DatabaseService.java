package Lab3.Service;
import Lab3.Model.Student;
import Lab3.Model.Profesor;
import Lab3.Model.Person;
import Lab3.Repository.StudentRepository;
import Lab3.Repository.ProfessorRepository;

import javax.sound.midi.SysexMessage;
import javax.xml.crypto.Data;

import static Lab3.Utils.Constants.PROFESSOR;

public class DatabaseService {
    private ProfessorRepository professorRepository;
    private StudentRepository studentRepository;

    public DatabaseService() {
        this.professorRepository = new ProfessorRepository();
        this.studentRepository = new StudentRepository();
    }

    public Student getStudentByName(String name){
        Student student = studentRepository.read(name);
        if (student != null){
            System.out.println(student);
        } else {
            System.out.println("No student having this name.");
        }
        return student;
    }

    public Profesor getProfessorByName(String name){
        Profesor professor = professorRepository.read(name);
        if (professor != null){
            System.out.println(professor);
        } else {
            System.out.println("No professor having this name.");
        }
        return professor;
    }

    public Person getPerson(String typeOfPerson, String name){
        Person person;
        if (typeOfPerson.equals(PROFESSOR)){
            person = getProfessorByName(name);
        } else {
            person = getStudentByName(name);
        }
        if (person == null){
            System.out.println("No person having name " + name);
            return null;
        }
        return person;
    }

    public void addPerson(Person person){
        if (person != null){
            switch (person){
                case Profesor profesor-> professorRepository.create(profesor);
                case Student student-> studentRepository.create(student);
                default -> throw new IllegalStateException("Unexpected value: " + person);
            }
        }
    }

    public void removePerson(String typeOfPerson, String name){
        Person person = getPerson(typeOfPerson, name);
        if (person == null) return ;

        switch (person){
            case Profesor profesor-> professorRepository.delete(profesor);
            case Student student-> studentRepository.delete(student);
            default -> throw new IllegalStateException("Unexpected value: " + person);
        }
    }
}
