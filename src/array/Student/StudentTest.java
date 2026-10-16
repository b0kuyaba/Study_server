package array.Student;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<Student>();

        student.add(new Student("김철수","90"));
        student.add(new Student("김영희","80"));
        student.add(new Student("김민수","91"));

        for (int i = 0; i < student.size(); i++) {
            student.get(i).showStudentInfo();
        }
    }
}
