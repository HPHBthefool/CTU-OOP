package buoi2;
import java.io.Serializable;
import java.util.Scanner;

public class Date implements Serializable {
	private int ngay, thang , nam;
	public Date() {
		ngay = thang = nam =0;
	}
	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public void hienThi() {
		System.out.printf("%d/%d/%d\n",ngay,thang,nam);
	}
	public boolean hopLe() {
		int [] max = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((nam%4==0 && nam%100 !=0) || (nam%400==0)) {
			max[2] = 29;
		}
		if(thang <1 || thang >12 || ngay > max[thang]) {
			return false;
		}
		return true;
	}
	public String toString() {
		return ngay+"/"+thang+"/"+nam;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay: ");
			ngay = scanner.nextInt();
			System.out.print("Nhap thang: ");
			thang = scanner.nextInt();
			System.out.print("Nhap nam: ");
			nam = scanner.nextInt();
			if(!this.hopLe()){
				System.out.println("Ngay khong hop le! Hay nhap lai.");
			}
		}while(!this.hopLe());
	}
	public void ngayHomSau() {
		ngay+=1;
		if(!this.hopLe()) {
			ngay =1;
			thang +=1;
			if(!this.hopLe()) {
				thang = 1;
				nam+=1;
			}
		}
		this.hienThi();
	}
	public void congNgay(int n) {
		int [] max = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((nam%4==0 && nam%100 != 0) || (nam%400 ==0)) {
			max[2] = 29;
		}
		ngay +=n;
		while (ngay > max[thang]) {
			ngay = ngay -max[thang];
			thang+=1;
			if(thang>12) {
				thang=1;
				nam +=1;
				if((nam%4==0 && nam%100 != 0) || (nam%400 ==0)) {
					max[2] = 29;
				}else {
					max[2] = 28;
				}
			}
		}
		this.hienThi();
	}
}