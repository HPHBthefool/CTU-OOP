package buoi3;
import buoi2.Diem;
public class SDDoanThang {
	public static void main(String []args) {
		Diem A = new Diem(2,5);
		Diem B = new Diem(20,35);
		DoanThang AB = new DoanThang(A,B);
		AB.tinhTien(5,3);
		System.out.print("Toa do 2 dau mut sau khi tinh tien mot doan (5,3) la: ");
		System.out.print("A: ");A.hienThi();
		System.out.print("B: ");B.hienThi();
		DoanThang CD = new DoanThang();
		System.out.println("Nhap vao doan thang CD: ");
		CD.nhap();
		System.out.println("Do dai doan thang CD la: "+Math.round(CD.doDai()*100.00)/100.00);
	}
}
