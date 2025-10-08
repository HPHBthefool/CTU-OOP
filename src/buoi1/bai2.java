package buoi1;
import java.util.Scanner;
import java.util.InputMismatchException;
public class bai2 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b;
		while (true) {
			try {
				System.out.println("Nhap vao a: ");
				a = scanner.nextInt();
				System.out.println("Nhap vao b: ");
				b = scanner.nextInt();
				System.out.println("a+b = "+(a+b));
				break;
			} catch (InputMismatchException e) {
				System.out.println("Nhap sai dinh dang! Hay nhap lai.");
				scanner.nextLine();
			}
		}
		
	}
}
