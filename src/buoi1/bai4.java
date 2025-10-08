package buoi1;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.StringBuilder;
public class bai4 {
	static int nhap() {
		Scanner scanner = new Scanner(System.in);
		int n;
		while (true) {
			try {
				n = scanner.nextInt();
				return n;
			}catch (InputMismatchException e) {
				System.out.println("Nhap sai dinh dang!! Hay nhap lai");
				scanner.nextLine();
			}
		}
	}
	static boolean isPrime(int n) {
		for(int i =2;i<Math.sqrt(n);i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	static void binary(int n) {
		StringBuilder s = new StringBuilder();
		int a= n;
		while(n!=0) {
			s.append(n%2);
			n/=2;
		}
		System.out.println("Dang nhi phan cua "+a+" la: "+s.reverse());
	}
	static void sum(int n) {
		int a = n;
		int s =0;
		while(n!=0) {
			s += n%10;
			n/=10;
		}
		System.out.println("Tong cac chu so cua "+a+" la: "+s);
	}
	static void dividers(int n) {
		if (isPrime(n)) {
			System.out.println(n+" la so nguyen to nen khong co uoc so khac ngoai 1 va "+n);
		}else {
			System.out.print("Cac thua so nguyen to cua "+n+" la:");
		}
		int n_copy = n;
		int i =2;
		while(i<=n_copy/2) {
			if((n%i==0)&&(isPrime(i))) {
				System.out.print(i+" ");
				n=n/i;
			}else {
				i++;
			}
		}
		
	}
	public static void main (String [] args) {
		int n;
		System.out.print("Nhap vao so nguyen n : ");
		n = nhap();
		if (isPrime(n)) {
			System.out.println(n+" La so nguyen to.");
		}else {
			System.out.println(n+" Khong la so nguyen to.");
		}
		binary(n);
		sum(n);
		dividers(n);
	}
}
