package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student_one;
    @BeforeEach
    void init(){
        student_one = new Student("6610450218", "Thutchakorn Tiensai");
    }
    @Test
    void testAddScore() {
        Student student_one = new Student("6610450218", "Thutchakorn Tiensai");
        assertEquals(0,student_one.getScore());
        student_one.addScore(40.5);
        assertEquals(40.5, student_one.getScore());
        student_one.addScore(10);
        assertEquals(50.5,student_one.getScore());
    }
    @Test
    void testChangeName() {
        Student student_one = new Student("6610450218", "Thutchakorn Tiensai");
        student_one.changeName("Zero");
        assertEquals("Zero",student_one.getName());
        student_one.changeName("One");
        assertEquals("One", student_one.getName());
    }
    @Test
    void testStudent() {
        Student student_one = new Student("6610450218", "Thutchakorn Tiensai", 60);
        assertEquals(60,student_one.getScore());
        student_one.addScore(40.5);
        assertEquals(100.5, student_one.getScore());
        student_one.addScore(10);
        assertEquals(110.5,student_one.getScore());
    }
    @Test
     void testIsId() {
        Student student_one = new Student("6610450218", "Thutchakorn Tiensai");
        assertTrue(student_one.isId("6610450218"));
    }
    @Test
    @DisplayName("ทดสอบการคิดเกรด")
    void testCalculateGrade() {
        Student student_one = new Student("6610450218", "Thutchakorn Tiensai");
        student_one.addScore(60.8);
        assertEquals("C", student_one.grade());
    }
}