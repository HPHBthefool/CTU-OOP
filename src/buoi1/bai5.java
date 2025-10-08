package buoi1;
import java.util.Scanner;
import java.lang.StringBuilder;
public class bai5 {
	static StringBuilder parse(String s) {
		StringBuilder ten = new StringBuilder();
		char c;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				ten.setLength(0);
			}else {
				ten.append(s.charAt(i));
			}
		}
		return ten;
	}
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ho va ten: ");
		String s = scanner.nextLine();
		StringBuilder ten = new StringBuilder();
		ten = parse(s);
		System.out.println("Ten cua ho va ten ban vua nhap la: " +ten);
	}
}
