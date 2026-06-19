
class Student {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class  encapulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Harini");
        System.out.println("Student Name: " + s.getName());
    }
}