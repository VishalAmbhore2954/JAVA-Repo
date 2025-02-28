
import java.util.Arrays;

public class MaxMinWithStream {
    public static void main(String[] args){
        int arr[] = {12,3,46,78,56};
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Max is : "+max);
        System.out.println("Min is : "+min);
    }
}
