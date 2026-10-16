package array.Student;

public class Student {
    private String studentName;
    private String score;

    public Student() {}

    public Student(String studentName, String score) {
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getScore() {
        return score;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "학생의 점수는 " + score + "점 입니다.");
    }
}
