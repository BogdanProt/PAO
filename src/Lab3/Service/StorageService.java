package Lab3.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Lab3.Model.Student;
import Lab3.Model.Person;
import Lab3.Model.Profesor;

import javax.xml.crypto.Data;

import static Lab3.Utils.Constants.PROFESSOR;
import static Lab3.Utils.Constants.STUDENT;

public class StorageService {
    private DatabaseService databaseService;
    public StorageService() {
        this.databaseService = new DatabaseService();
    }
    public void create(Scanner scanner) {
        System.out.println("Enter type of person [student/profesor]:");
        String typeOfPerson = scanner.nextLine().toLowerCase();
        if(!typeOfPersonValidation(typeOfPerson)) { return; }
        personInit(scanner, typeOfPerson);
    }

    public void read(Scanner scanner) {
        System.out.println("name:");
        String name = scanner.nextLine();
        databaseService.getStudentByName(name);
        databaseService.getProfessorByName(name);
    }

    public void delete(Scanner scanner) {
        System.out.println("name:");
        String name = scanner.nextLine();
        System.out.println("typeOfPerson:");
        String typeOfPerson = scanner.nextLine();
        if(!typeOfPersonValidation(typeOfPerson)) { return; }
        databaseService.removePerson(typeOfPerson, name);
    }

    public void update(Scanner scanner) {
        System.out.println("typeOfPerson:");
        String typeOfPerson = scanner.nextLine();
        if(!typeOfPersonValidation(typeOfPerson)) { return; }
        System.out.println("name:");
        String name = scanner.nextLine();
        Person person = databaseService.getPerson(typeOfPerson, name);
        if (person == null) { return;}

        Person personGeneralInfo = setGeneralInfo(name, scanner);
        person.setName(name);
        person.setPhoneNumber(personGeneralInfo.getPhoneNumber());
        person.setEmailAddress(personGeneralInfo.getEmailAddress());
        if(typeOfPerson.equals(PROFESSOR)){
            professorInit(scanner, (Profesor) person);
        }else{
            studentInit(scanner, (Student) person);
        }
    }

    public boolean typeOfPersonValidation(String typeOfPerson) {

        if(! typeOfPerson.equals(PROFESSOR) && !typeOfPerson.equals(STUDENT)){
            System.out.println("Wrong type");
            return false;
        }
        return true;
    }

    private void personInit(Scanner scanner, String typeOfPerson) {
        System.out.println("name:");
        String name = scanner.nextLine();

        if (typeOfPerson.equals(PROFESSOR) && databaseService.getProfessorByName(name) != null) {return;}
        if (typeOfPerson.equals(STUDENT) && databaseService.getStudentByName(name) != null) {return;}

        Person person = setGeneralInfo(name, scanner);
        if(typeOfPerson.equals(PROFESSOR)){
            Profesor professor = new Profesor(person);
            professorInit(scanner, professor);
            person = professor;
        } else {
            Student student = new Student(person);
            studentInit(scanner, student);
            person = student;
        }

        databaseService.addPerson(person);
        System.out.println("Created " + person);
    }

    private Person setGeneralInfo(String name, Scanner scanner) {
        System.out.println("phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("email:");
        String email = scanner.nextLine();
        return new Person(name, phoneNumber, email);
    }

    private void studentInit(Scanner scanner, Student student) {
        System.out.println("student number:");
        int studentNumber = scanner.nextInt();
        System.out.println("averageMark:");
        float averageMark = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("clasa:");
        String clasa = scanner.nextLine();

        student.setStudentNumber(studentNumber);
        student.setAverageMark(averageMark);
        student.setClasa(clasa);
    }

    private void professorInit(Scanner scanner, Profesor professor) {
        System.out.println("course:");
        String course = scanner.nextLine();
        System.out.println("year:");
        int year = scanner.nextInt();
        scanner.nextLine();
        professor.setCourse(course);
        professor.setYear(year);
    }

}
