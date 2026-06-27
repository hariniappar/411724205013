public class maxcon {
    public static void main(String[] args) {
    int arr[]={1,3,6,2,5,4,8};
    int maxarea=0;
    int area;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            int h=Math.min(arr[i],arr[j]);
            int w=j-i;
            area=h*w;
            if(maxarea<area){
                maxarea=area;
            }
    }
   } 
   System.out.print("maximum :"+maxarea);

}}
       
