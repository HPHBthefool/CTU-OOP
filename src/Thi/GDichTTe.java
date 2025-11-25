package Thi;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class GDichTTe extends GDich {
	private float dgia, tgia;
	private int sluong;
	private char loai;
	public GDichTTe() {
		
	}
	public void nhap() {
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Don gia: "); dgia = scanner.nextFloat();
		System.out.print("So luong: "); sluong = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Loai : "); loai = scanner.nextLine().charAt(0);
		System.out.print("Ti gia: "); tgia = scanner.nextFloat();
	}
	public float giatri() {
		if (loai == 'V') {
			return dgia*sluong;
		}
		return dgia*sluong*tgia;
	}
	
	public void in() {
		System.out.println(this);
		this.tthai();
	}
	
	public String toString() {
		return super.toString() + "\n"+ "Don gia: "+dgia+ ", Soluong: "+sluong+", Loai: "+loai+", Ti gia: "+tgia;		
	}
	public static void swap(GDichTTe a, GDichTTe b) {
		GDichTTe t;
		t= a;
		a= b;
		b= t;
	}
	public static void sort(GDichTTe [] ds) {
		
		for(int i=0;i<ds.length-1;i++) {
			for(int j=1;j<ds.length;j++) {
				DateTimeFormatter f=  DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate d1=  LocalDate.parse(ds[i].ngay(), f);
				LocalDate d2=  LocalDate.parse(ds[j].ngay(), f);
				if (d1.isAfter(d2)) {
					swap(ds[i], ds[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Nhap vao n: ");n = scanner.nextInt();
		GDichTTe [] ds = new GDichTTe[n];
		for(int i =0;i<n;i++) {
			ds[i] = new GDichTTe();
			System.out.println("Nhap vao thong tin giao dich thu "+(i+1)+": ");
			ds[i].nhap();
		}
		System.out.println("--------------------");
		System.out.println("Danh sach cac giao dich vua nhap la: ");
		for(int i =0;i<n;i++) {
			ds[i].in();
		}
		System.out.println("--------------------");
		System.out.println("Cac giao dich co gia tri tren 100000 VND la: ");
		for(int i =0;i<n;i++) {
			if(ds[i].giatri() >100000) {
				ds[i].in();
			}
		}
		sort(ds);
		System.out.println("--------------------");
		System.out.println("So tien giao dich theo thang-nam la: ");
		float tong =0;
		int a=0;
		String cur = ds[0].ngay().substring(3,10);
		for(int i =0;i<n;i++) {
			if (cur.equals(ds[i].ngay().substring(3,10))) {
				tong+=ds[i].giatri();
			}else {
				System.out.println(cur+": "+tong);
				tong=ds[i].giatri();
				cur = ds[i].ngay().substring(3,10);
			}
		}
		System.out.println(cur+": "+tong);
	}
}
