import java.util.*;
import java.util.stream.IntStream;
public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of array : ");
        // int n = sc.nextInt();
        // int arr[] = new arr[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        int arr[] = {10,20,30,40,50};
        System.out.println("Enter a key");
        int key = sc.nextInt();
        // boolean flag = false;
        // for (int x : arr) {
        //     if(x==key){
        //         flag=true;
        //         break;
        //     }
        // }
        // if(flag){
        //     System.out.println("Found");
        // }else{
        //     System.out.println("Not Found");
        // }

        boolean res=IntStream.of(arr).anyMatch(x->x==key);
        System.out.println(res?"Key found":"Key not found");
    }
}