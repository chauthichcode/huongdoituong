package sdhethong;
import java.util.ArrayList;
import java.util.Scanner;
public class SinhVien {
    private String mssv;
    private String hotensv;
    private String namsinh;
    private ArrayList<DKHP> dangkyhp;

    public SinhVien() {
        this.mssv = new String(" ");
        this.hotensv = new String(" ");
        this.namsinh = new String(" ");
        this.dangkyhp = new ArrayList<>();
    }

    public SinhVien(String mssv, String hotensv, String namsinh, ArrayList<DKHP> dangkyhp) {
        this.mssv = mssv;
        this.hotensv = hotensv;
        this.namsinh = namsinh;
        this.dangkyhp = dangkyhp;
    }
    public SinhVien(SinhVien sv){
        this.mssv = sv.mssv;
        this.hotensv = sv.hotensv;
        this.namsinh = sv.namsinh;
        this.dangkyhp = sv.dangkyhp;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHotensv() {
        return hotensv;
    }

    public void setHotensv(String hotensv) {
        this.hotensv = hotensv;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public ArrayList<DKHP> getDangkyhp() {
        return dangkyhp;
    }

    public void setDangkyhp(ArrayList<DKHP> dangkyhp) {
        this.dangkyhp = dangkyhp;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mssv: ");
        this.mssv = sc.nextLine();
        System.out.println("Nhap vao ten sinh vien: ");
        this.hotensv = sc.nextLine();
        System.out.println("Nhap vao nam sinh: ");
        this.namsinh = sc.nextLine();
        System.out.println("Nhap vao so luong mon hoc: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
        DKHP a = new DKHP();
        a.nhap();
        dangkyhp.add(a);
    }
        
    }
    public int tongtc(){
        int tc = 0;
        for(int i=0; i<dangkyhp.size(); i++){
            tc += dangkyhp.get(i).getMonhoc().getSotc();
        }
        return tc;
    }
    public float tinhtien(){
        float tien =0;
        for(int i =0; i<dangkyhp.size(); i++){
            tien+=dangkyhp.get(i).getMonhoc().tongtienmon();
        }
        return tien;
    }
    public void xuat(){
        System.out.println("MSSV: "+mssv+"\tHO TEN: "+hotensv+"\tSO TIN CHI: "+tongtc()+"\tHOCPHITONG: "+tinhtien());
    }
}
