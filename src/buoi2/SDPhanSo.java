package buoi2;
import java.util.Scanner;
public class SDPhanSo {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3,7);
		PhanSo b = new PhanSo(4,9);
		System.out.print("a = "); a.hienThi();
		System.out.print("b = "); b.hienThi();
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("Nhap vao x: ");
		x.nhap();
		System.out.println("Nhap vao y: ");
		y.nhap();
		System.out.print("Gia tri nghich dao cua x la : ");  x.giaTriNgichDao().hienThi();
		System.out.print("Tong cua x + y la :"); x.cong(y).hienThi();
		
		System.out.print("Nhap vao n: ");
		int n = scanner.nextInt();
		PhanSo [] ds = new PhanSo[n];
		for(int i =0;i<n;i++) {
			ds[i] = new PhanSo();
			System.out.println("Nhap vao phan tu thu "+(i+1));
			ds[i].nhap();
			ds[i].normalize();
		}
		PhanSo tong = new PhanSo(ds[0].tuso(),ds[0].mauso());
		for(int i =1;i<n;i++) {
			tong = tong.cong(ds[i]);
		}
		
		System.out.print("Tong cac phan so trong danh sach la: "); tong.hienThi();
		PhanSo max = ds[0];
		for(int i =1;i<n;i++) {
			if(max.giaTriThuc() < ds[i].giaTriThuc()) {
				max = ds[i];
			}
		}
		System.out.print("Phan so lon nhat trong danh sach la: "); max.hienThi();
		PhanSo t;
		for(int i =0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(ds[i].giaTriThuc() >ds[j].giaTriThuc()){
					t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
			}
		}
		for(int i=0;i<n;i++) {
			ds[i].hienThi();
		}
	}

}
