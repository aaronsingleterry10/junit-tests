import java.util.ArrayList;

public class Student {
//    id should be a long number used to represent a "unique user" in our application.
    public long id;

//    name is a String that holds the name of the student.
    public String name;

//    grades is an ArrayList that contains a list of Integer numbers.
    public ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }
}
