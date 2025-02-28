import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int start = 0;
        int end = 14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key : ");
        int key = sc.nextInt();
        boolean flag = false;
        while (start <= end) {
            int mid = (start + end)
                    / 2;
            if (arr[mid] == key) {
                // System.out.println("Found");
                flag = true;
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (flag) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
