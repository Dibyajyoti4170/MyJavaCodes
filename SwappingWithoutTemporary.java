package javaprograms;
import java.util.Scanner;
public class SwappingWithoutTemporary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number ");
		int n2 = sc.nextInt();
		System.out.println("before swapping");
		System.out.println("first number= "+n1);
		System.out.println("second number= "+n2);
		n1=n1-n2;
		n2=n1+n2;
		n1=n2-n1;
		System.out.println("after swapping");
		System.out.println("first number= "+n1);
		System.out.println("second number= "+n2);

	}

}
