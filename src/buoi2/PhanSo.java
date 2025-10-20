package buoi2;
import java.util.Scanner;
public class PhanSo {
	private int tuso, mauso;
	public PhanSo() {		
		tuso = mauso =1;
	}
	public PhanSo(int tuso, int mauso) {
		this.tuso = tuso;
		this.mauso = mauso;
	}
	public int tuso() {
		return tuso;
	}
	public int mauso() {
		return mauso;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhap vao tu so:");
			tuso = scanner.nextInt();
			System.out.print("Nhap vao mau so:");
			mauso = scanner.nextInt();
			if(mauso==0) {
				System.out.println("Mau so khong duoc bang 0! Nhap lai");
			}
		}while(mauso ==0);
	}
	public void hienThi() {
		if(tuso ==0) {
			System.out.println("0");
		}else if(mauso ==1) {
			System.out.println(tuso);
		}else {
			if(tuso*mauso<0) {
				System.out.println("-"+tuso+"/"+mauso);
			}else {
				System.out.println(tuso+"/"+mauso);
			}
		}
	}
	public void nghichDao() {
		int t =mauso;
		mauso = tuso;
		tuso = t;
	}
	public PhanSo giaTriNgichDao() {
		return new PhanSo(mauso, tuso);
	}
	public double giaTriThuc() {
		return (double)tuso/mauso;
	}
	public boolean lonHon(PhanSo a) {
		if(this.giaTriThuc() > a.giaTriThuc()) {
			return true;
		}
		return false;
	}
	public void normalize() {
		int a = tuso;
		int b = mauso;
		int t;
		while(b!=0) {
			t = a%b;
			a=b;
			b=t;
		}
		tuso/=a;
		mauso/=a;
	}
	public PhanSo cong(PhanSo a) {
		PhanSo tong;
		if(mauso == a.mauso) {
			tong = new PhanSo(tuso + a.tuso,mauso);
		}else {
			tong = new PhanSo(tuso*a.mauso + a.tuso*mauso, mauso*a.mauso);
		}
		tong.normalize();
		return tong;
	}
	public PhanSo tru(PhanSo a) {
		a.tuso  = -a.tuso;
		return this.cong(a);
	}
	public PhanSo nhan(PhanSo a) {
		PhanSo tich = new PhanSo(tuso*a.tuso, mauso*a.mauso);
		tich.normalize();
		return tich;
	}
	public PhanSo chia(PhanSo a) {
		PhanSo nghichdao = new PhanSo(a.mauso, a.tuso);
		return this.nhan(nghichdao);
	}
	public PhanSo cong(int n) {
		PhanSo a = new PhanSo(n,1);
		return this.cong(a);
	}
	public PhanSo tru(int n) {
		PhanSo a = new PhanSo(n,1);
		return this.tru(a);
	}
	public PhanSo nhan(int n) {
		PhanSo a=  new PhanSo(n,1);
		return this.nhan(a);
	}
	public PhanSo chia(int n) {
		PhanSo a = new PhanSo(n, 1);
		return this.chia(a);
	}
}
