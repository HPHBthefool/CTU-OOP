package buoi3;
import buoi2.Diem;
import java.util.Scanner;
public class DoanThang {
	private Diem d1, d2;
	public DoanThang(){
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem d1, Diem d2){
		this.d1 = d1;
		this.d2 = d2;
	}
	public DoanThang(int x1, int y1, int x2, int y2){
		Diem d1 = new Diem(x1,y1);
		Diem d2 = new Diem(x2,y2);
	}
	public void nhap() {
		System.out.println("Nhap vao dau mut d1: ");
		d1.nhapDiem();
		System.out.println("Nhap vao dau mut d2:");
		d2.nhapDiem();
	}
	public void tinhTien(int x, int y) {
		d1.doiDiem(x,y);
		d2.doiDiem(x, y);
	}
	public double doDai() {
		return d1.khoangCach(d2);
	}
}
