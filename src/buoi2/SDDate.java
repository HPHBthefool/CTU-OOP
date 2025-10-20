package buoi2;
import java.util.Scanner;
public class SDDate {

	public static void main(String[] args) {
		Date date = new Date();
		date.nhap();
		date.hienThi();
		date.ngayHomSau();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ngay muon cong: ");
		int n = scanner.nextInt();
		date.congNgay(n);
	}

}
