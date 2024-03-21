package Lab3.Repository;

import Lab3.Model.Person;
import Lab3.Model.Profesor;
import Lab3.Model.Student;

import java.util.ArrayList;
import java.util.List;


public class ProfessorRepository {
    private List<Profesor> professors;
    public ProfessorRepository(){
        this.professors = new ArrayList<>();
    }

    public Profesor read(String name){
        if (!professors.isEmpty()){
            for (Profesor p : professors){
                if (p.getName().equals(name)){
                    return p;
                }
            }
        }
        return null;
    }

    public void delete(Profesor profesor){
        professors.remove(profesor);
    }

    public void create(Profesor profesor){
        professors.add(profesor);
    }
}
