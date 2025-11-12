package buoi3;
import java.util.Scanner;
import java.io.Serializable;
import java.util.Arrays;
import buoi2.Date;
public class SinhVien implements Serializable {
	private String mssv;
	private String hoten;
	private Date ngaysinh;
	private int soluonghocphan;
	private String[] dshocphan;
	private String[] diemhocphan;
	public SinhVien(){
		ngaysinh = new Date();
	}
	public SinhVien(String mssv, String hoten, Date ngaysinh, int soluonghocphan, String[] dshocphan, String[] diemhocphan){
		this.mssv = mssv;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.soluonghocphan = soluonghocphan;
		this.dshocphan = dshocphan;
		this.diemhocphan = diemhocphan;
	}
	public SinhVien(SinhVien sv){
		mssv = sv.mssv;
		hoten = sv.hoten;
		ngaysinh = sv.ngaysinh;
		soluonghocphan = sv.soluonghocphan;
		dshocphan = sv.dshocphan;
		diemhocphan = sv.diemhocphan;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("mssv: ");mssv = scanner.nextLine();
		System.out.print("ho va ten: ");hoten = scanner.nextLine();
		System.out.println("ngay sinh: ");ngaysinh.nhap();
		System.out.print("so luong hoc phan: ");soluonghocphan = scanner.nextInt();
		dshocphan = new String[soluonghocphan];
		diemhocphan = new String[soluonghocphan];
		System.out.println("danh sach hoc phan: ");
		scanner.nextLine();
		for(int i=0;i<soluonghocphan;i++) {
			System.out.print("Ten hoc phan "+(i+1)+" : ");dshocphan[i] = scanner.nextLine();
		}
	}
	public void nhapDiem() {
		Scanner scanner = new Scanner(System.in);
		if(soluonghocphan == 0) {
			System.out.println("Chua dang ky hoc phan nao!");
		return;
		}
		
		System.out.println("diem cac hoc phan: ");
		for(int i=0;i<soluonghocphan;i++) {
			System.out.print((i+1)+". "+dshocphan[i]+" : ");diemhocphan[i] = scanner.nextLine();
		}
	}
	public String toString() {
		String s= "mssv: "+mssv+" - ho va ten: "+hoten+" - ngay sinh : "+ngaysinh+" - so hoc phan: "+soluonghocphan ;
		for(int i =0;i<soluonghocphan;i++) {
			s+= "\n"+(i+1)+". "+dshocphan[i]+" : "+((quydoidiem(diemhocphan[i])==-1)?"Chua co diem":diemhocphan[i]);
		}
		return s;
	}
	public float trungbinh() {
		if(soluonghocphan ==0) {
			return 0;
		}
		int num_valid=0;
		float tong =0;
		for(int i=0;i<soluonghocphan;i++) {
			if(quydoidiem(diemhocphan[i])!=-1) {
				tong += quydoidiem(diemhocphan[i]);
				num_valid ++;
			}
		}
		return tong/num_valid;
	}
	public void dkhocphan(String tenhp) {
		dshocphan = Arrays.copyOf(dshocphan, soluonghocphan+1);
		diemhocphan = Arrays.copyOf(diemhocphan, soluonghocphan+1);
		dshocphan[soluonghocphan] = tenhp;
		soluonghocphan++;
	}
	public void xoahocphan(String tenhp) {
		String [] ds = new String[soluonghocphan-1];
		String [] diem = new String[soluonghocphan-1];
		int offset =0;
		for(int i=0;i<soluonghocphan;i++) {
			if(dshocphan[i] == tenhp) {
				offset++;
			}else {
				ds[i+offset] = dshocphan[i];
				diem[i+offset] = diemhocphan[i];
			}
		}
		soluonghocphan--;
		dshocphan =ds;
		diemhocphan = diem;
	}
	private float quydoidiem(String d) {
		if (d == null) {
			return -1;
		}
		switch(d) {
		case "A": return 4.0f;
		case "B+": return 3.5f;
		case "B": return 3.0f;
		case "C+": return 2.5f;
		case "C": return 2.0f;
		case "D+": return 1.5f;
		case "D": return 1.0f;
		case "F": return 0.0f;
		default: return -1;
		}
	}
	public boolean canhcaohocvu() {
		return (this.trungbinh()<1.0)?true:false;
	}
	public String hoten() {
		return hoten;
	}
	public String ten() {
		String [] parsed = hoten.trim().split(" ");
		return parsed[-1];
	}
	
	
}
