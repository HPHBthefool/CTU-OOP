package buoi4;
import buoi3.SinhVien;

import java.io.Serializable;
import java.util.Scanner;

import buoi2.Date;
public class SinhVienCNTT extends SinhVien implements Serializable{
	private String taikhoan;
	private String matkhau;
	private String email;
	public SinhVienCNTT() {
		
	}
	public SinhVienCNTT(String mssv, String hoten, Date ngaysinh, int soluonghocphan, String[] dshocphan, String[] diemhocphan, String taikhoan, String matkhau, String email) {
		super(mssv, hoten, ngaysinh, soluonghocphan, dshocphan, diemhocphan);
		this.matkhau = matkhau;
		this.taikhoan = taikhoan;
		this.email = email;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.print("nhap vao taikhoan: ");
		this.taikhoan = scanner.nextLine();
		System.out.print("nhap vao mat khau: ");
		this.matkhau = scanner.nextLine();
		System.out.print("nhap vao email: ");
		this.email = scanner.nextLine();
	}
	@Override
	public String toString() {
		return super.toString()+"\n tai khoan: "+this.taikhoan+"\n mat khau: "+this.matkhau+"\n email: "+this.email+"\n----------------------------------------\n";
	}
	public void doiMatKhau(String newpass) {
		this.matkhau = newpass;
	}
	public String getEmail() {
		return this.email;
	}
	
	
}
