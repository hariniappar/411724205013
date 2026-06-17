import java.util.Scanner;

public class amstrong {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int count=0;
while(n>0){
    count++;
    n=n/10;
}
int sum=0;
n=temp;
while ((n>0)){
    int digit=n%10;
    sum=sum+(int)Math.pow(digit, count);
    n=n/10;
}
if(sum==temp){
    System.out.println(sum+"is a amstrong number");
}
else{
     System.out.println(sum+"is not a amstrong number");
}
}
    
    
}
