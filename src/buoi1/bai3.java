package buoi1;
import java.util.Scanner;
import java.util.InputMismatchException;
public class bai3 {
	static double nhap() {
		Scanner scanner = new Scanner(System.in);
		double n;
		while (true) {
			try {
				n = scanner.nextDouble();
				return n;
			}catch (InputMismatchException e) {
				System.out.println("Nhap sai dinh dang!! Hay nhap lai");
				scanner.nextLine();
			}
		}
	}
	static void giaiptbac2(double a, double b, double c) {
		double delta = b*b - (4*a*c);
		if( delta<0) {
			System.out.println("Phuong trinh vo nghiem");
		}else if(delta == 0) {
			System.out.println("Phuong trinh co nghiem kep x = " +(-b/(2*a)));
		}else {
			double x1 = (-b+(Math.sqrt(delta)))/(2*a);
			double x2 = (-b-(Math.sqrt(delta)))/(2*a);
			System.out.println("Phuong trinh co 2 nghiem phan biet");
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
		}
	}
	public static void main(String [] args) {
		
		double a,b,c;
		System.out.print("a= ");
		a = nhap();
		System.out.print("b= ");
		b = nhap();
		System.out.print("c= ");
		c = nhap();
		giaiptbac2(a,b,c);
	}
}