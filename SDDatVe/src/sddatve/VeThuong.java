
package sddatve;
import java.util.Scanner;
import java.util.ArrayList;
public class VeThuong {
    private String tenkh;
    private String maghe;

    public VeThuong() {
        this.tenkh = " ";
        this.maghe = " ";
    }

    public VeThuong(String tenkh, String maghe) {
        this.tenkh = tenkh;
        this.maghe = maghe;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getMaghe() {
        return maghe;
    }

    public void setMaghe(String maghe) {
        this.maghe = maghe;
    }
    public float tinhgiave(){
        float phidv = 400;
        float giacoban = 1000;
        
        return giacoban+(1*phidv); 
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ten khach hang: ");
        this.tenkh = sc.nextLine();
        System.out.println("Nhap vao ma cho ngoi: ");
        this.maghe = sc.nextLine();
    }
    public void xuat(){
        System.out.println("MA GHE: "+maghe+"\tTEN KHACH HANG: "+tenkh+"\tGIA VE: "+tinhgiave());
    }
}
