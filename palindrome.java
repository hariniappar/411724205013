import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string: ");
        // String original = scanner.next();
        // String reversed = new StringBuilder(original).reverse().toString();
        // if (original.equals(reversed)) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not a palindrome");
        // }
        
        // scanner.close();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is not a Palindrome Number");
        }
    }
}



