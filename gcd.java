import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp;
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0){
		   temp=a%b;
		    a=b;
		    temp=b;	  
	}
    // System.out.print(temp);
    System.out.print(a);
    // System.out.print(b);
}
}