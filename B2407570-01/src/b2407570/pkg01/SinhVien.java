
package b2407570.pkg01;
import java.util.Scanner;
import java.util.ArrayList;
public class SinhVien {
    private String mssv;
    private String hoten;
    private int namsinh;
    private ArrayList<DangKyHP> hp;
    Scanner sc = new Scanner(System.in);

    public SinhVien() {
        this.mssv = new String(" ");
        this.hoten = new String(" ");
        this.namsinh = 2000;
        this.hp = new ArrayList<>();
    }

    public SinhVien(String mssv, String hoten, int namsinh, ArrayList<DangKyHP> hp) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.hp = hp;
    }
    public void nhapsv(){
        System.out.print("Nhap mssv: ");
        this.mssv = sc.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        this.hoten = sc.nextLine();
        System.out.print("Nhap vao nam sinh: ");
        this.namsinh = sc.nextInt();
        this.hp = new ArrayList<>();
        System.out.print("Nhap vao so luong hoc phan da dang ky: ");
        int n = sc.nextInt();
        for(int i=0; i<n;  i++){
            System.out.print("Nhap vao hoc phan thu " +(i+ 1)+" : ");
            DangKyHP a = new DangKyHP();
            a.nhaphp();
            this.hp.add(a);
        }
        
    }
    public int tongsotinchi(){
        int tong = 0;
        for(int i=0; i<hp.size(); i++){
            tong += hp.get(i).getmonhoc().gettc();
        }
        return tong;
    }
    public float tonghocphi(){
        int tong = 0;
        for(int i=0; i<hp.size(); i++){
            tong += hp.get(i).getmonhoc().gethocphi();
        }
        return tong;
    }
    public void oput(){
        System.out.println(mssv + "\t" + hoten + "\t" + tongsotinchi() + " \t" + tonghocphi());
    }
}
