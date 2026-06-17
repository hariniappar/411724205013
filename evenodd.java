public class evenodd {
    public static void main(String[] args) {
        String s="38721";
        for(int i=s.length();i>=0;i--){
            if(i%2==0){
            System.out.println("even:"+i);

            }
            else{
                System.out.println("odd:"+i);
        
            }
            break;
        }
       
       
      
    }
    
}
