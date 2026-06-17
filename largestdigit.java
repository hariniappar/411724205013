import java.util.Scanner;

public class largestdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        int largest=n;
        while(n>0){
            a=n%10;
            if(a<largest){
                largest=a;

            }
            n/=10;
        }
        System.out.print(largest);
    }
    
}
