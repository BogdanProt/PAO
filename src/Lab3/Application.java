package Lab3;
import java.security.Provider;
import java.util.Scanner;
import Lab3.Model.Student;
import Lab3.Model.Person;
import Lab3.Model.Profesor;
import Lab3.Service.StorageService;
public class Application {
    public static void main(String[] args) {
        StorageService storageService = new StorageService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Alegeti comanda pe care doriti sa o efectuati: ");
        System.out.println("1.create\n2.read\n3.update\n4.delete\n5.quit");
        String command = scanner.nextLine();

        switch(command){
            case "create":
                String type, name, phoneNumber, email;
                System.out.println("Introduceti tipul de persoana(Profesor / Student):");
                type = scanner.nextLine();
                System.out.println("Introduceti numele:");
                name = scanner.nextLine();
                System.out.println("Introduceti numarul de telefon:");
                phoneNumber = scanner.nextLine();
                System.out.println("Introduceti adresa de mail:");
                email = scanner.nextLine();
                if (type.equals("Student")){
                    int studentNumber, classNumber;
                    double averageMark;
                    System.out.println("Introduceti numarul de student:");
                    studentNumber = scanner.nextInt();
                    System.out.println("Introduceti media anuala:");
                    averageMark = scanner.nextDouble();
                    System.out.println("Introduceti clasa studentului:");
                    classNumber = scanner.nextInt();

                    Student student = new Student(name, phoneNumber, email, studentNumber, averageMark, classNumber);
                    storageService.addStudent(student);
                } else if (type.equals("Profesor")) {
                    String course;
                    int year;
                    System.out.println("Introduceti cursul pe care il preda profesorul:");
                    course = scanner.nextLine();
                    System.out.println("Introduceti anul la care preda profesorul:");
                    year = scanner.nextInt();

                    Profesor profesor = new Profesor(name, phoneNumber, email, course, year);
                    storageService.addProfessor(profesor);
                }
                break;
        }
    }
}
