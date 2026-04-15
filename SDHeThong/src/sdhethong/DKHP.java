package sdhethong;
import java.util.Scanner;

public class DKHP {
    private MonHoc monhoc;
    private String manhomhp;

    public DKHP() {
        this.monhoc = new MonHoc();
        this.manhomhp = new String(" ");
    }

    public DKHP(MonHoc monhoc, String manhomhp) {
        this.monhoc = monhoc;
        this.manhomhp = manhomhp;
    }
    public DKHP(DKHP dk){
        this.monhoc = dk.monhoc;
        this.manhomhp = dk.manhomhp;
    }

    public MonHoc getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(MonHoc monhoc) {
        this.monhoc = monhoc;
    }

    public String getManhomhp() {
        return manhomhp;
    }

    public void setManhomhp(String manhomhp) {
        this.manhomhp = manhomhp;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap thong tin mon hoc dang ky!! ");
        monhoc.nhap();
        System.out.println("Nhap vao nhom hoc phan: ");
        this.manhomhp = sc.nextLine();
    }
    public void xuat(){
        monhoc.xuat();
        System.out.print("NHOM: "+manhomhp);
    }
}
