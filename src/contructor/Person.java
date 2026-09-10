package contructor;

public class Person {
    String name;
    float height;
    float weight;

    public Person() {}

    public Person(String pname) {
            name = pname;
    }

    public Person(String pname, float pweight, float pheight) {
        name = pname;
        weight= pweight;
        height = pheight;
    }
}
