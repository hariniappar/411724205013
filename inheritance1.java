class bird {
    void fly(){
        System.out.println("birds are flying");
    }
}
class duck extends bird{
    void swim(){
    System.out.println("duck is swimming");
    }
}
public class inheritance1{
    public static void main(String[] args){
        duck d=new duck();
        d.fly();
        d.swim();
    }
}