package array.Attendance;

public class Student {
    private int id;
    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void info(){
        System.out.println("학번: " + id + ", 이름: " + name);
    }
}

