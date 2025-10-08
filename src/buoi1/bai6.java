package buoi1;
import java.util.Scanner;
public class bai6 {
	static void dem(int[] ds, int x) {
		int k=0;
		for(int i=0;i<ds.length;i++) {
			if(ds[i] == x) k++;
		}
		System.out.println("So "+x+" xuat hien "+k+" lan trong danh sach");
	}
	static int[] sapxep(int [] ds) {
		int t=0;
		for(int i =0;i<ds.length-1;i++) {
			for(int j=i+1;j<ds.length;j++) {
				if(ds[i]>ds[j]) {
					t= ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
			}
		}
		return ds;
	}
	static int[] append (int x,int[] ds) {
		int flag =0;
		int[] new_ds = new int[ds.length+1];
		for(int i =0;i<ds.length;i++) {
			if((x<ds[i])&&(flag ==0)) {
				new_ds[i]= x;
				flag=1;
				i--;
			}else {
				new_ds[i+flag] = ds[i];
			}
			
		}
		return new_ds;
	}
	static void hienthi(int [] ds) {
		for(int i =0;i<ds.length;i++) {
			System.out.print(ds[i]+" ");
		}
		System.out.println();
	}
	static int[] remove(int x, int[] ds) {
		int index =0;
		while((index< ds.length)&&(ds[index]<x)) index++;
		if(index==ds.length) return new int[0];
		int[] new_ds = new int[ds.length-index];
		for(int i=0;i<new_ds.length;i++) {
			new_ds[i] = ds[index+i];
		}
		return new_ds;
	}
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();
		int []ds = new int[n];
		for(int i =0;i<n;i++) {
			System.out.print("Nhap vao so thu "+i+": ");
			ds[i] = scanner.nextInt();
		}
		System.out.print("Nhap vao x: ");
		int x= scanner.nextInt();
		dem(ds,x);
		ds = sapxep(ds);
		System.out.print("danh sach sau khi sap xep la: ");
		hienthi(ds);
		ds = append(x,ds);
		System.out.print("danh sach sau them x la: ");
		hienthi(ds);
		int []new_ds= remove(x,ds);
		System.out.print("danh sach sau khi xoa cac so be hon x la: ");
		hienthi(new_ds);
	}
}
