package buoi4;
import java.util.Scanner;
import buoi2.Diem;
public class DiemMau extends Diem{
	private String mau;
	public DiemMau() {
		
	}
	public DiemMau(int x, int y, String mau) {
		super(x,y);
		this.mau = mau;
	}
	public void GanMau(String mau) {
		this.mau = mau;
	}
	public void nhap() {
		Scanner scanner= new Scanner(System.in);
		this.nhapDiem();
		System.out.print("Nhap vao mau: ");
		this.mau = scanner.nextLine();
	}
	public String toString() {
		return "("+this.giaTriX()+", "+this.giaTriY()+")-mau: "+mau;
	}
	public void hienThi() {
		System.out.println(this);
	}
}
