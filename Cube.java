import java.util.Scanner;
public class Cube  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int cube = num*num*num;
        System.out.println("Square of "+num+" is "+cube);
    }
}
