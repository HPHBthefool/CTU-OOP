package buoi3;
import java.util.Scanner;
public class SDGach {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = scanner.nextInt();
		Gach []ds = new Gach[n];
		for(int i =0;i<n;i++) {
			System.out.println("Nhap vao thong tin hop gach thu "+(i+1));
			ds[i] = new Gach();
			ds[i].nhap();
		}
		
		System.out.println("Danh sach cac loai gach vua nhap:");
		for(int i=0;i<n;i++) {
			ds[i].hienthi();
		}
		int index =0;
		float min = (float)ds[0].getGia()/ds[0].dienTichMax();
		for(int i=1;i<n;i++) {
			float cur = (float)ds[i].getGia()/ds[i].dienTichMax();
			if(cur < min) {
				min =cur;
				index =i;
			}
		}
		min = min/10000;
		System.out.print("Loai gach co chi phi lot thap nha la: ");
		ds[index].hienthi();
		System.out.println("Chi phi / dien tich : "+Math.round(min*100.00)/100.00+"/m2");
		
		System.out.println("Chi phi mua gach khi ta lot 1 dien tich co chieu ngang = 500cm va chieu dai la 1500cm theo tung loai gach la: ");
		for(int i=0;i<n;i++) {
			System.out.println("Ms : "+ds[i].getMs()+" - chi phi lot : "+ds[i].getGia()*ds[i].soLuongHop(500, 1500));
		}
	}

}
