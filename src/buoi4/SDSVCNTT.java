package buoi4;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class SDSVCNTT {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("nhap vao n: "); int n = scanner.nextInt();
		SinhVienCNTT []ds = new SinhVienCNTT[n];
		for(int i =0;i<n;i++) {
			ds[i] = new SinhVienCNTT();
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		for(int i =0;i<n;i++) {
			System.out.println(ds[i]);
		}
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("sv.ser"));
			os.writeObject(ds);
			os.flush();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SinhVienCNTT []ds1 = new SinhVienCNTT[n];
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("sv.ser"));
			ds1 = (SinhVienCNTT[]) is.readObject();
			is.close();
		}catch (FileNotFoundException e) {
			System.out.println("Loi!! File khong ton tai");
		} catch (IOException e) {
			System.out.println("Co loi xay ra!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Co loi xay ra!");
			e.printStackTrace();
		}
		scanner.nextLine();
		System.out.println("Nhap email: ");
		String email = scanner.nextLine();
		int found =0;
		for(int i=0;i<n;i++) {
			if(ds1[i].getEmail().equals(email)) {
				found =1;
				System.out.println("tim thay sinh vien co email tuong ung");
				System.out.println(ds1[i]);
			}
		}
		if(found==0) {
			System.out.println("khong ton tai sinh vien co email nay");
		}
		SinhVienCNTT t;
		for(int i =0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(ds1[i].trungbinh() < ds1[j].trungbinh()) {
					t = ds1[i];
					ds1[i] = ds1[j];
					ds1[j] = t;
				}
			}
		}
		System.out.println("Danh sach sau khi sap xep la: ");
		for(int i =0;i<n;i++) {
			System.out.println(ds1[i]);
		}
		
	}

}
