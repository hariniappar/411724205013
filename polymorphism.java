 class Area {

    void calculate(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void calculate(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

public class polymorphism
{
    public static void main(String[] args) {
        Area a = new Area();

        a.calculate(5);
        a.calculate(10, 20);
    
}
}
