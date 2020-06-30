import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        student = new Student(3, "Cody");
        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(95);
    }

    @Test
    public void hasCorrectConstructor() {

        assertEquals(3, student.id);
        assertEquals("Cody", student.name);
    }

    @Test
    public void testStudentId() {
        assertEquals(3, student.getId());
    }

    @Test
    public void testStudentName() {
        assertEquals("Cody", student.getName());
    }

    @Test
    public void testStudentGrades() {
        int expected = 90;
        int actual = student.grades.get(0);
        assertEquals(expected, actual);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testStudentAverage() {
        double expected = 90;
        double actual = student.getGradeAverage();
        assertEquals(expected, actual, 0);
    }
}
