import java.util.Scanner;
public class sumofdigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int even=0,odd=0;
        while(x>0){
            x=x/10;
            if(x%2==0){
               even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even:"+even);
        System.out.println("odd:"+odd);
    }
}