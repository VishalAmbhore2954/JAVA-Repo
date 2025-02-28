import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();
        if(marks>90){
            System.out.println("A");
        }else if(marks>70){
            System.out.println("B");
        }else if(marks>50){
            System.out.println("C");
        }else{
            System.out.println("FAIL");
        }
    }
}
