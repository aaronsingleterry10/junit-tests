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

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (Integer x : this.grades) {
            sum += x;
        }
        return sum / this.grades.size();
    }

    public void updateGrade(int from, int to) {
        for (int i = 0; i < this.grades.size(); i++) {
            if (this.grades.get(i) == from) {
                this.grades.remove(i);
                this.grades.add(to);
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(33, "Aaron");
        s1.grades.add(90);
        s1.grades.add(100);
        s1.grades.add(80);
        s1.updateGrade(80, 90);
        s1.updateGrade(100, 95);
        System.out.println(s1.grades);
    }
}
