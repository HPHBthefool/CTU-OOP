package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		A.hienThi();
		Diem B = new Diem();
		B.nhapDiem();
		B.hienThi();
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		C.hienThi();
		System.out.println("Khoang cach tu diem B den tam O la: "+ B.khoangCach());
		System.out.println("Khoang cach tu diem A den diem B la: "+A.khoangCach(B));
	}

}
