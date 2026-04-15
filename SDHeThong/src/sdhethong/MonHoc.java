package sdhethong;
import java.util.Scanner;
public class MonHoc {
    private String mamon;
    private String tenmon;
    private int sotc;
    private float hocphi;

    public MonHoc() {
        this.mamon = new String(" ");
        this.tenmon = new String(" ");
        this.sotc = 1;
        this.hocphi = 100;
    }

    public MonHoc(String mamon, String tenmon, int sotc, float hocphi) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.sotc = sotc;
        this.hocphi = hocphi;
    }
    public MonHoc(MonHoc mh){
       this.mamon = mh.mamon;
       this.tenmon = mh.tenmon;
       this.sotc = mh.sotc;
       this.hocphi = mh.hocphi;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getSotc() {
        return sotc;
    }

    public void setSotc(int sotc) {
        this.sotc = sotc;
    }

    public float getHocphi() {
        return hocphi;
    }

    public void setHocphi(float hocphi) {
        this.hocphi = hocphi;
    }
    public double tongtienmon(){
        return this.sotc * this.hocphi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma mon hoc: ");
        this.mamon = sc.nextLine();
        System.out.println("Nhap vao ten mon hoc: ");
        this.tenmon = sc.nextLine();
        System.out.println("Nhap vao so tin chi: ");
        this.sotc = sc.nextInt();
        System.out.println("Nhap vao hoc phi cua mon hoc: ");
        this.hocphi = sc.nextFloat();
    }
    public void xuat(){
        System.out.println("MA MH: "+mamon+"\tTEN MON: "+tenmon+"\tSO TC: "+sotc+"\tHOCPHI: "+hocphi);
        System.out.println("SO TIEN PHAI DONG LA: "+tongtienmon());
    }
}
