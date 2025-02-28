public class MaxInArr {
    public static void main(String[] args) {
        int arr[] = {5,6,7,1,2,3,8,9,10};
        int max = arr[0];
        int min = arr[0];
        for(int x:arr){
            if(max<x){
                max=x;
            }
            if(min>x){
                min=x;
            }
        }
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }
}
