package b2407570.pkg01;
import java.util.Scanner;
public class DangKyHP {
    private MonHoc monhoc;
    private String manhomhp;
    Scanner sc = new Scanner(System.in);

    public DangKyHP() {
        this.monhoc = new MonHoc();
        this.manhomhp = new String(" ");
    }

    public DangKyHP(MonHoc monhoc, String manhomhp) {
        this.monhoc = monhoc;
        this.manhomhp = manhomhp;
    }
    public MonHoc getmonhoc(){
        return this.monhoc;
    }
    public String getmanhomhp(){
        return this.manhomhp;
    }
    public void nhaphp(){
        System.out.print("Nhap vao ma nhom hp: ");
        this.manhomhp = sc.nextLine();
        this.monhoc.nhap();
    }
    public void xuat() {
    System.out.printf("%-10s", manhomhp);
    monhoc.xuat();
}
    public float tinhhocphihp(){
        return this.monhoc.tinhhocphi();
    }
}
