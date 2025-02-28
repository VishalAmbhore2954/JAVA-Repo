import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character : ");
        char ch = sc.nextLine().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='O'||ch=='I'||ch=='E'||ch=='A'||ch=='U'){
            System.out.println("It is Vowel");
        }else{
            System.out.println("It is Consonent");
        }
    }
}
