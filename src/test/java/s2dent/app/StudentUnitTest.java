package s2dent.app;

import junit.framework.TestCase;
import s2dent.app.domain.Student;

public class StudentUnitTest extends TestCase {

    private Student student;

    protected void setUp() throws Exception {
        student = new Student();
    }

    public void testSetAndGetDescription() {
        String name = "test name";
        assertNull(student.getFirstname());
        student.setFirstname(name);
        assertEquals(name, student.getFirstname());
    }
}