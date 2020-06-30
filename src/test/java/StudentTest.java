import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

//    @Before
//    public void setUp() {
//
//    }

    @Test
    public void hasCorrectConstructor() {
        Student student = new Student(3, "Cody");
        assertEquals(3, student.id);
        assertEquals("Cody", student.name);
    }
}
