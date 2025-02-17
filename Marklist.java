import java.util.Scanner;
public class Marklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your roll number : ");
        int rollno = sc.nextInt();
        System.out.println("Enter your marks : ");
        System.out.println("Subject 1 : ");
        int sub1 = sc.nextInt();
        System.out.println("Subject 2 : ");
        int sub2 = sc.nextInt();
        System.out.println("Subject 3 : ");
        int sub3 = sc.nextInt();
        System.out.println("Subject 4 : ");
        int sub4 = sc.nextInt();
        System.out.println("Subject 5 : ");
        int sub5 = sc.nextInt();

        float perct = (sub1+sub2+sub3+sub4+sub5)/5;

        System.out.println("---------------------MARKLIST-----------------------");
        System.out.println("Roll number\t\t:\t\t"+rollno);
        System.out.println("Student name\t\t:\t\t"+name);
        System.out.println("Subject 1\t\t:\t\t"+sub1);
        System.out.println("Subject 2\t\t:\t\t"+sub2);
        System.out.println("Subject 3\t\t:\t\t"+sub3);
        System.out.println("Subject 4\t\t:\t\t"+sub4);
        System.out.println("Subject 5\t\t:\t\t"+sub5);
        System.out.println("Percentage\t\t:\t\t"+perct);
        System.out.println("---------------------THANK YOU-----------------------"); 
    }
}
