import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		 double num1;
	     double num2;
	     double ans;
	     double ans1;
	     double ans2;
	     double ans4;
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter First Number: ");
	     num1 = sc.nextDouble();
	     System.out.print("Enter Second Number: ");
	     num2 = sc.nextDouble();
	     ans = num1 + num2;
	     ans1 = num1 * num2;
	     ans2 = num1 / num2;
	     ans4 = num1 - num2;
	     System.out.println("Addition "+ans);
	     System.out.println("Multiplication "+ans1);
	     System.out.println("Division "+ans2);
	     System.out.println("Substraction "+ans4);
	}

}
