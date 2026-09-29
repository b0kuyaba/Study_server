package stataicdemo;

public class Student {

    public static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
