class lakshman{
    void father(){
        System.out.println("father of benny and ammu kutty");
    }
}
class benny extends lakshman{
    void son(){
        System.out.println("son of lakshman");
    }
}
class ammu extends lakshman{
    void daughter(){
        System.out.println("daughter of lakshman");
    }
}
public class inheritance2 {
    public static void main(String[] args) {
        ammu a=new ammu();
        a.father();
        a.daughter();
        }
    }

