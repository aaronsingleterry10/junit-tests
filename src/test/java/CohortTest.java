import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
//    Then create a CohortTest class and build a test for each of the following requirements:
//
//    A Cohort instance can add a Student to the List of students.

    Cohort emptyCohort;
    Cohort oneStudentCohort;
    Cohort manyStudentsCohort;
    Student student1;
    Student student2;

    @Before
    public void setUp() {
        emptyCohort = new Cohort();
        oneStudentCohort = new Cohort();
        manyStudentsCohort = new Cohort();
        student1 = new Student(44, "James");
        student2 = new Student(33, "Steve");
        student1.addGrade(90);
        student2.addGrade(90);

        oneStudentCohort.addStudent(student1);

        manyStudentsCohort.addStudent(student1);
        manyStudentsCohort.addStudent(student2);
    }

    @Test
    public void testAddStudent() {
        assertTrue(oneStudentCohort.getStudents().contains(student1));
        assertTrue(manyStudentsCohort.getStudents().contains(student2));
    }

    //    A Cohort instance can get the current List of students.

    @Test
    public void testGetStudents() {
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, oneStudentCohort.getStudents().size());
        assertEquals(2, manyStudentsCohort.getStudents().size());
    }
//    A Cohort instance can get the average and it's being calculated correctly.
//    Go back to the StudentTest class and refactor the code to avoid any repetition in the test cases, the use of the @Before annotation will be useful to achieve this, do the same with this new CohortTest class if you find any code repetition as well.

    @Test
    public void testGetCohortAverage() {
        assertEquals(90, oneStudentCohort.getCohortAverage(), 0);
        assertEquals(90, manyStudentsCohort.getCohortAverage(), 0);
    }
}
