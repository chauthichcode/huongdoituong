package sddatve;
import java.util.Scanner;
import java.util.ArrayList;
public class ChuyenBay {
    private String machuyenbay;
    private String diemden;
    private String diemdi;
    private float giavecoban;
    private float phidichvu;
    private ArrayList<VeThuong> vedat;

    public ChuyenBay() {
        this.machuyenbay =" ";
        this.diemden = " ";
        this.diemdi=" ";
        this.giavecoban = 1000;
        this.phidichvu = 400;
        this.vedat = new ArrayList<>();
    }

    public ChuyenBay(String machuyenbay, String diemden, String diemdi, float giavecoban, float phidichvu, ArrayList<VeThuong> vedat) {
        this.machuyenbay = machuyenbay;
        this.diemden = diemden;
        this.diemdi = diemdi;
        this.giavecoban = giavecoban;
        this.phidichvu = phidichvu;
        this.vedat = vedat;
    }

    public String getMachuyenbay() {
        return machuyenbay;
    }

    public void setMachuyenbay(String machuyenbay) {
        this.machuyenbay = machuyenbay;
    }

    public String getDiemden() {
        return diemden;
    }
    public void setDiemden(String diemden) {
        this.diemden = diemden;
    }

    public String getDiemdi() {
        return diemdi;
    }

    public void setDiemdi(String diemdi) {
        this.diemdi = diemdi;
    }

    public float getGiavecoban() {
        return giavecoban;
    }

    public void setGiavecoban(float giavecoban) {
        this.giavecoban = giavecoban;
    }

    public float getPhidichvu() {
        return phidichvu;
    }

    public void setPhidichvu(float phidichvu) {
        this.phidichvu = phidichvu;
    }

    public ArrayList<VeThuong> getVedat() {
        return vedat;
    }

    public void setVedat(ArrayList<VeThuong> vedat) {
        this.vedat = vedat;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ma chuyen bay: ");
        this.machuyenbay = sc.nextLine();
        System.out.println("Nhap vao Diem Den: ");
        this.diemden = sc.nextLine();
        System.out.println("Nhap vao Diem bat dau: ");
        this.diemdi = sc.nextLine();
        System.out.println("Nhap vao gia ve co ban: ");
        this.giavecoban = sc.nextFloat();
        System.out.println("Nhap vao phi dich vu: ");
        this.phidichvu = sc.nextFloat();
        System.out.println("Nhap vao so luong ve muon dat: ");
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("LUA CHON");
            System.out.println("1.VE VIP");
            System.out.println("2.VE THUONG");
            int c = sc.nextInt();
            switch(c){
                case 1 : VeVip a = new VeVip();
                a.nhap();
                vedat.add(a);
                break;
                case 2: VeThuong b = new VeThuong();
                b.nhap();
                vedat.add(b);
                break;
            }
        }
    }
    public int tongsove(){
        return vedat.size();
    }
    public float tongchiphichuyenbay(){
        float tong =0;
        for(int i=0; i<vedat.size();i++){
            tong+=vedat.get(i).tinhgiave();
        }
        return tong;
    }
    public void xuat(){
        System.out.println("MA CHUYEN BAY: "+machuyenbay+"\tTONG GHE DAT: "+tongsove()+"\tTONG CHI PHI: "+tongchiphichuyenbay());
    }
}
