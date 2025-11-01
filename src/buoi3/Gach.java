package buoi3;
import java.util.Scanner;
public class Gach {
	private String ms;
	private String mau;
	private int soluong;
	private int dai;
	private int ngang;
	private long gia;
	public Gach (){
		
	}
	public Gach (String ms, String mau, int soluong, int dai, int ngang, long gia){
		this.ms = ms;
		this.mau = mau;
		this.soluong = soluong;
		this.dai = dai;
		this.ngang = ngang;
		this.gia = gia;
	}
	public Gach( Gach c){
		ms = c.ms;
		mau = c.mau;
		soluong = c.soluong;
		dai = c.dai;
		ngang = c.ngang;
		gia = c.gia;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ma so: ");
		this.ms = scanner.nextLine();
		System.out.print("Nhap vao mau: ");
		this.mau = scanner.nextLine();
		System.out.print("Nhap vao so luong: ");
		this.soluong = scanner.nextInt();
		System.out.print("Nhap vao chieu dai: ");
		this.dai = scanner.nextInt();
		System.out.print("Nhap vao chieu ngang: ");
		this.ngang = scanner.nextInt();
		System.out.print("Nhap vao gia: ");
		this.gia = scanner.nextLong();
	}
	public long getGia() {
		return gia;
	}
	public String getMs() {
		return ms;
	}
	public void hienthi() {
		System.out.println("ms: "+ms+" - mau: "+mau+" - so luong: "+soluong+" - chieu dai: "+dai+" - chieu ngang: "+ngang+" - gia: "+gia);
	}
	public float giaBanLe() {
		return (float)(gia*1.2)/soluong;
	}
	public int dienTichMax() {
		return dai*ngang*soluong;
	}
	int soLuongHop(int D, int N) {
		return (int) Math.ceil(D*N/this.dienTichMax());
	}
}
