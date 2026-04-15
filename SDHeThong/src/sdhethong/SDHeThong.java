package sdhethong;
import java.util.Scanner;
public class SDHeThong {
    public static void hpmax(SinhVien a[], int n){
        SinhVien max = a[0];
        for(int i=1; i<n;i++){
            if(max.tinhtien() < a[i].tinhtien()) max = a[i];
        }
        max.xuat();
    }
    public static void main(String[] args) {
        SinhVien[] a = new SinhVien[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so sinh vien muon dang ky: ");
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            a[i] = new SinhVien();
            a[i].nhap();
        }
        for(int i=0; i<n; i++){
            a[i].xuat();
        }
        hpmax(a,n);
    }
    
}
