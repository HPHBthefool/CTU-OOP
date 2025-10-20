package buoi2;
import java.util.Scanner;
public class Diem {
	private int x, y;
	public Diem() {
		x=y=0;
	}
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void nhapDiem() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao x: ");
		x = scanner.nextInt();
		System.out.print("Nhap vao y: ");
		y = scanner.nextInt();
	}
	public void hienThi() {
		System.out.printf("(%d,%d)\n",x,y);
	}
	public void doiDiem(int dx, int dy) {
		x +=dx;
		y +=dy;
	}
	public int giaTriX() {
		return x;
	}
	public int giaTriY() {
		return y;
	}
	public double khoangCach() {
		return Math.sqrt(x*x + y*y);
	}
	public double khoangCach(Diem d) {
		return Math.sqrt((d.x - x)*(d.x - x) + (d.y - y)*(d.y - y));
	}
	
}

