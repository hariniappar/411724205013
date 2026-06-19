class copyconstructor{
    String name;
    int id;
    copyconstructor(int i,string n){
        name=n;
        id=i;

    }
}
public static void main(String[] args){
    copyconstructor=new copyconstructor(s1);
}
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // Inherited method
        d.bark();  // Child class method
    }
}