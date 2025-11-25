package Thi;

import java.util.Scanner;

public class CNguoi {

	private String id,hten,ngay;
	private char phai;
	
	static Scanner scanner = new Scanner(System.in);
	public CNguoi() {
		
	}
	
	public CNguoi(CNguoi a) {
		id = a.id;
		hten = a.hten;
		ngay=a.ngay;
		phai = a.phai;
	}
	
	public void nhap() {
		System.out.print("Nhap vao so passport hoac CCCD: "); id = scanner.nextLine();
		System.out.print("Ho va ten: "); hten = scanner.nextLine();
		System.out.print("Ngay sinh (ngay-thang-nam): "); ngay = scanner.nextLine();
		System.out.print("Phai (M:nam, F:nu) : "); phai = scanner.nextLine().charAt(0);
	}
	
	public void in() {
		System.out.println("ID: "+id+", Ho va ten: "+hten+", Ngay sinh: "+ngay+", Phai: "+((phai=='M')?"nam":"nu"));
	}
	public String hten() {
		return hten;
	}
	
	public static void main(String[] args) {
		CNguoi c1  = new CNguoi();
		System.out.println("Nhap vao thong tin nguoi c1");
		c1.nhap();
		CNguoi c2=  new CNguoi (c1);
		System.out.println("Thong tin nguoi c1: ");c1.in();
		System.out.println("Thong tin nguoi c2: ");c2.in();
		
	}

}
