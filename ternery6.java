import java.util.Scanner;
class ternery6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
        int c = sc.nextInt();
		int mid = (a>b&&b>c)||(c>b&&b>a)?b:((b>a&&a>c)||(c>a&&a>b)?a:c); 
        System.out.println("Mid is : "+mid);
	}
}
