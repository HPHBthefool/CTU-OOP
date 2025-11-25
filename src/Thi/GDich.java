package Thi;

import java.util.Scanner;

public class GDich {
	private int mgd;
	private String ngay, hten;
	private boolean tthai;
	public GDich() {
		
	}
	
	public GDich(GDich gd) {
		mgd = gd.mgd;
		hten = gd.hten;
		ngay = gd.ngay;
		tthai = gd.tthai;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ma giao dich: "); mgd = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Ho va ten: "); hten = scanner.nextLine();
		System.out.print("Ngay : "); ngay = scanner.nextLine();
		System.out.print("Trang thai: "); tthai = scanner.nextBoolean();
	}
	public float giatri() {
		return 0;
	}
	public void in() {
		System.out.println(this);
		this.tthai();
	}
	public String toString() {
		String s = "Ma giao dich: "+mgd+ ", Ho va ten: "+hten+", Ngay: "+ngay;;
		return s;
	}
	public void tthai() {
		if (tthai == true) {
			System.out.println("Trang thai: Thanh cong");
		}else {
			System.out.println("Trang thai: That bai");
		}
	}
	public String ngay() {
		return ngay;
	}
	
	public static void main(String[] args) {
		GDich gd1 = new GDich();
		gd1.nhap();
		System.out.println("Giao dich 1: ");
		gd1.in();
		GDich gd2 = new GDich(gd1);
		System.out.println("Giao dich 2: ");
		gd2.in();
	}
}
