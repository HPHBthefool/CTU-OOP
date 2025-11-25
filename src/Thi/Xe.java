package Thi;

import java.util.Scanner;

public class Xe {
	private String soxe,loai,ngay;
	private boolean tthai;
	public static Scanner scanner = new Scanner(System.in);
	public Xe() {
		
	}
	public Xe(Xe x) {
		soxe = x.soxe;
		loai = x.loai;
		ngay = x.ngay;
		tthai = x.tthai;
	}
	public void nhap() {
		System.out.print("So xe: "); soxe = scanner.nextLine();
		System.out.print("Loai: "); loai = scanner.nextLine();
		System.out.print("Ngay-thang-nam dang kiem: "); ngay = scanner.nextLine();
		System.out.print("Trang thai: "); tthai = scanner.nextBoolean();
	}
	public void in() {
		System.out.println("So xe: "+soxe+", Loai: "+loai+", Ngay: "+ngay);
		this.tthai();
	}
	public void tthai() {
		if(tthai ==true) {
			System.out.println("Duoc phep luu hanh");
		}else {
			System.out.println("Khong duoc phep luu hanh");
		}
	}
	public String getloai() {
		return loai;
	}
	public boolean gettthai() {
		return tthai;
	}
	
	public static void main(String[] args) {
		Xe x1 = new Xe();
		x1.nhap();
		System.out.println("Thong tin xe x1: ");x1.in();
		Xe x2 = new Xe(x1);
		System.out.println("Thong tin xe x2: ");x2.in();
	}
}
