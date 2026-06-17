import java.util.Scanner;

public class string{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine();
        System.out.println(t);
        int n=t.length();
        int vowel=0,consonent=0;
        for(int i=0;i<n;i++){
             char ch=t.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel++;
            }
            else{
             consonent++;
            }
        }
       System.out.println("vowel:"+vowel);
       System.out.println("Consonent:"+consonent);
    }
}
