import java.util.Scanner;

public class stringplacement {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int digits=0,letters=0,uppercase=0,lowercase=0;
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercase++;
            } 
            else if (Character.isLowerCase(ch)) {
                lowercase++;
            }
            if (Character.isDigit(ch)) {
                digits++;
            }
            if (Character.isLetter(ch)) {
                letters++;
            }
        }
        System.out.println("No. of uppercase letters : " + uppercase);
        System.out.println("No. of lowercase letters : " + lowercase);
        System.out.println("No. of digits            : " + digits);
        System.out.println("No. of letters           : " + letters);
    }
}
