package array.Dog;

public class Dog {
    private String name;
    private String type;

    public Dog() {}

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showDogInfo() {
        System.out.println(name + "," + type);
    }
}
