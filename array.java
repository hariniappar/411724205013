public class array {
    public static void main(String[] args){
    
    int[] arr = {1, 2, 3, 0, 0, 4, 5, 0, 6, 7};
    int index = 0; 
    int j=0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            index=arr[i];
            arr[i]=arr[j];
            arr[j]=index;
            j++;            }
        }
        for (int i: arr) {
            System.out.print(i+ " ");
        }
    }
}

//         int arr[]={1,2,3,0,0,4,5,0,6,7};
//         int k=0;
//         k=k%arr.length;
//        for(int j=0;j<k;j++){
//           int t=arr[0];
//         for(int i=0;i<arr.length-1;i++){
//             arr[i]=arr[i+1];
//         }
//         arr[arr.length-1]=t;
//     }
//         for(int i:arr){
//         System.out.print(i+" ");}
//     }
// } 

