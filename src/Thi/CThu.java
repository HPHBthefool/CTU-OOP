package Thi;
import java.util.ArrayList;
import java.time.LocalTime;
public class CThu extends CNguoi{
	
	private int so;
	private String vitri, mua,clb;
	private long bthang;
	
	public void nhap() {
		super.nhap();
		System.out.print("So: "); so = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Vi tri (thu mon, hau ve, trung ve, tien ve, tien dao): "); vitri = scanner.nextLine();
		System.out.print("So ban thang: "); bthang = scanner.nextLong();
		scanner.nextLine();
		System.out.print("Mua giai: "); mua = scanner.nextLine();
		System.out.print("Cau lac bo: "); clb = scanner.nextLine();
	}
	
	public long tinhLuong() {
		long luong = 7000000;
		switch (vitri) {
		case "thu mon" :
			luong+=3000000;
			break;
		case "hau ve":
			luong += 4000000;
			break;
		case "trung ve":
			luong +=4500000;
			break;
		case "tien ve":
			luong +=5000000;
			break;
		case "tien dao":
			luong +=7000000;
			break;
		}
		return luong;
	}
	public void in() {
		super.in();
		System.out.println("So: "+so+", Vi tri: "+vitri+", So ban thang: "+bthang+", Mua giai: "+mua+", Cau lac bo: "+clb);
	}

	public String getClb() {
		return clb;
	}

	public long getBthang() {
		return bthang;
	}
	public String getMua() {
		return mua;
	}
	public static void main(String[] args) {
		System.out.println("Nhap vao n: ");int n = scanner.nextInt();
		CThu [] ds = new CThu[n];
		for(int i =0;i<n;i++) {
			ds[i] = new CThu();
			System.out.println("Nhap thong tin cau thu thu "+((i+1)));
			ds[i].nhap();
		}
		
		System.out.println("--------------------------\n Danh sach cac cau thu vua nhap la ");
		for(int i=0;i<n;i++) {
			ds[i].in();
			System.out.println();
		}
		
		System.out.println("--------------------------\n Danh sach tien luong cac cau thu la ");
		for(int i=0;i<n;i++) {
			System.out.println(i+1+". Ho va ten: "+ds[i].hten()+", Luong: "+ds[i].tinhLuong());
		}
		
		ArrayList <String> clbs = new ArrayList<>();
		for(int i =0;i<n;i++) {
			if(!clbs.contains(ds[i].getClb())) {
				clbs.add(ds[i].getClb());
			}
		}
		Long [] goal = new Long[3];
		System.out.println("--------------------------\n So bang thang theo tung mua giai la: ");
		for(String clb: clbs) {
			System.out.println("CLB: "+clb);
			long tong =0;
			String cur = ds[0].getMua();
			for(int i=0;i<n;i++) {
				
			}
			
		}
		
	}
	
}
