package Thi;
import java.util.ArrayList;
import java.util.Scanner;
public class ChuyenXe {

	private int mso;
	private String tentx,nden;
	private float dthu;
	private Xe xe;
	static Scanner scanner =new Scanner(System.in);
	
	public ChuyenXe() {
		xe = new Xe();
	}
	public void nhap() {
		System.out.print("Ma so: "); mso = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Ten tai xe: "); tentx = scanner.nextLine();
		System.out.print("Noi den: "); nden = scanner.nextLine();
		System.out.print("Doanh thu: "); dthu= scanner.nextFloat();
		System.out.println("Nhap thong tin xe: ");
		xe.nhap();
	}
	public void in() {
		xe.in();
		System.out.println("Ma so: "+mso+", Ten tai xe: "+tentx+", Noi den: "+nden+", Doanh thu: "+dthu);
	}
	public Xe getxe() {
		return xe;
	}
	public int getmaso() {
		return mso;
	}
	public float doanhthu(){
		return dthu*(float)0.3;
	}
	public static void main(String[] args) {
		System.out.print("Nhap m: ");int m = scanner.nextInt();
		ChuyenXe[] ds = new ChuyenXe[m];	
		for(int i =0;i<m;i++) {
			ds[i] = new ChuyenXe();
			System.out.println("Nhap thong tin chuyen xe thu "+i+1);
			ds[i].nhap();
		}
		
		System.out.println("---------------------------\n Thong tin cac chuyen xe vua nhap la ");
		for(int i =0;i<m;i++) {
			ds[i].in();
		}
		System.out.println("---------------------------\n Ma so cac chuyen xe bi huy hoac co doanh thu duoi 100000 vnd la ");
		for(int i =0;i<m;i++) {
			if(!ds[i].getxe().gettthai() || ds[i].doanhthu()<100000 ) {
				System.out.println(ds[i].getmaso());
			}
		}
		ArrayList <String> xe = new ArrayList<>();
		for(int i=0;i<m;i++) {
			if(!xe.contains(ds[i].getxe().getloai())){
				xe.add(ds[i].getxe().getloai());
			}
		}
		float [] dthu =new float[ xe.size()];
		for(String loai : xe) {
			int idx =0;
			for(int i =0;i<m;i++) {
				if(loai.equals(ds[i].getxe().getloai())) {
					dthu[idx] +=ds[i].doanhthu();
				}
			}
			idx++;
		}
		for (String loai : xe) {
			int idx=0;
			System.out.println(loai+": "+dthu[idx]);
			idx++;
		}
	}

}
