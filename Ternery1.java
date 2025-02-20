import java.util.Scanner;
class ternery1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a>b?a:b;
		System.out.println("Max is : "+max);
	}
}