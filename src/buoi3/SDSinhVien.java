package buoi3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class SDSinhVien {
	public static void main(String [] args) {
		SinhVien a = new SinhVien();
		System.out.println("Nhap thong tin cho sinh vien a: ");
		a.nhap();
		a.nhapDiem();
		a.dkhocphan("LTHDT");
		System.out.println(a);
		System.out.println();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao n: ");int n = scanner.nextInt();
		SinhVien [] ds= new SinhVien[n];
		for(int i=0;i<n;i++) {
			ds[i] = new SinhVien();
			System.out.println("Sinh vien "+(i+1)+": " );
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		System.out.println();
		
		
		System.out.println("Cac sinh vien bi canh cao hoc vu la: ");
		for(int i=0;i<n;i++) {
			if(ds[i].canhcaohocvu()) {
				System.out.println(ds[i]);
			}
		}
		System.out.println();
		
		
		float max =ds[0].trungbinh();
		int index =0;
		for(int i =1;i<n;i++) {
			if(max <  ds[i].trungbinh()) {
				max  = ds[i].trungbinh();
				index =i;
			}
		}
		System.out.println("Sinh vien co diem trung binh cao nhat la: ");
		System.out.println(ds[index]);
		System.out.println();
		
		
		System.out.println("Danh sach sinh vien sau khi sap xep thu tu Alphabet cua ten la: ");
		Arrays.sort(ds, new Comparator<SinhVien>(){
			@Override
			public int compare(SinhVien a, SinhVien b) {
				String tena = a.hoten().trim().split("\\s+")[a.hoten().trim().split("\\s+").length-1];
				String tenb = b.hoten().trim().split("\\s+")[b.hoten().trim().split("\\s+").length-1];
				int kq = tena.compareToIgnoreCase(tenb);
				if(kq!=0) return kq;
				return a.hoten().compareToIgnoreCase(b.hoten());
			}
		});
		for(int i=0;i<n;i++) {
			System.out.println(ds[i]);
			System.out.println("------------------------");
		}
	}
	
}
