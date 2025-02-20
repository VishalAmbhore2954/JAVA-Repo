import java.util.Scanner;
class ternery4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		String check = a%2==0?"Even":"Odd";
		System.out.println("Number is : "+check);
	}
}