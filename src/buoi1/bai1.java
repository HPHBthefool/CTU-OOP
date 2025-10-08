package buoi1;
import java.util.Scanner;
public class bai1 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		char c;
		do {
			System.out.println("Nhap vao mot ky tu: ");
			c = scanner.nextLine().charAt(0);
		}while (c!='q');
	}
}
