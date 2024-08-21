package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudent() {
        StudentList student_one = new StudentList();
        StudentList.addNewStudent("6610450218","Thutchakorn Tiensai");
        assertEquals("6610450218",student_one.getStudents();
    }

}