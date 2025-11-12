package buoi4;

import java.util.Scanner;

public class ConVat {
	private String giong;
	private String maulong;
	private float cannang;
	public ConVat() {
		
	}
	public ConVat(String giong, String maulong, float cannang) {
		this.giong = giong;
		this.maulong = maulong;
		this.cannang =cannang;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Giong: "); this.giong = scanner.nextLine();
		System.out.print("Mau long: "); this.maulong = scanner.nextLine();
		System.out.print("Can nang: "); this.cannang = scanner.nextFloat();	
	}
	public void Keu() {
		
	}
}
class Bo extends ConVat{
	public Bo() {
		
	}
	public Bo(String giong, String maulong, float cannang) {
		super(giong, maulong, cannang);
	}
	public void Keu() {
		System.out.println("MOOOOOOOOOOO");
	}
}
class Heo extends ConVat {
	public Heo() {
	}
	public Heo(String giong, String maulong, float cannang) {
		super(giong, maulong, cannang);
	}
	public void Keu() {
		System.out.println("Oink");
	}
}
class De extends ConVat {
	public De() {
	}
	public De(String giong, String maulong, float cannang) {
		super(giong, maulong, cannang);
	}
	public void Keu() {
		System.out.println("Bahhhh");
	}
}

