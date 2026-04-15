
package b2407570.pkg01;
import java.util.Scanner;
public class MonHoc {
    private String mamon;
    private String tenmon;
    private int sotc;
    private float hocphi;
    Scanner sc = new Scanner(System.in);

    public MonHoc() {
        this.mamon = new String(" ");
        this.tenmon = new String(" ");
        this.sotc = 1;
        this.hocphi = 550;
    }

    public MonHoc(String mamon, String tenmon, int sotc, float hocphi) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotc = sotc;
        this.hocphi = hocphi;
    }
    public void nhap(){
        System.out.print("xin moi nhap ma mon: ");
        this.mamon=sc.nextLine();
        System.out.print("xin moi nhap ten mon: ");
        this.tenmon = sc.nextLine();
        System.out.print("xin moi nhap so tin chi: ");
        this.sotc=sc.nextInt();
        System.out.print("xin moi nhap so tien: ");
        this.hocphi = sc.nextFloat();
    }
    public String getmamon(){
        return this.mamon;
    }
    public String gettenmon(){
        return this.tenmon;
    }
    public int gettc(){
        return this.sotc;
    }
    public float gethocphi(){
        return this.hocphi;
    }
    public void xuat() {
    System.out.printf("%-10s %-25s %-10d %-10.2f\n", mamon, tenmon, sotc, hocphi);
}
    public float tinhhocphi(){
        return this.sotc * this.hocphi;
    }
}
