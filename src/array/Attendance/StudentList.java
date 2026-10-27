package array.Attendance;

import array.Book.ArrayListTest;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        String[] name = {"강하늘", "김도영", "박영헌", "안세영", "우상혁", "최인호"};

        int i = 1101;

        ArrayList<Student> stu = new ArrayList<>();

        for(String n : name) {
            stu.add(new Student(i++, n));
        }

        for (Student s : stu) {
            s.info();
        }
    }
}
