import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private List<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
    }

    public double getCohortAverage() {
        double avg = 0;
        for (Student student: this.getStudents()) {
            avg += student.getGradeAverage();
        }
        return avg / this.getStudents().size();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String findStudentById(long id) {
        String output = "";
        for (Student x: this.getStudents()) {
            if (x.getId() == id) {
                return output += x.getName();
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Cohort emptyCohort = new Cohort();
        System.out.println(emptyCohort.getStudents().size());
    }
}
