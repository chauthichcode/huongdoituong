package sddatve;
import java.util.Scanner;
public class VeVip extends VeThuong {
    private int hesophuthu;

    public VeVip() {
    }
    public VeVip(String tenkh, String maghe, int hspt){
        super(tenkh, maghe);
        this.hesophuthu = hspt;
    }

    public int getHesophuthu() {
        return hesophuthu;
    }

    public void setHesophuthu(int hesophuthu) {
        this.hesophuthu = hesophuthu;
    }
    @Override
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap he so phu thu: ");
        this.hesophuthu = sc.nextInt();
    }
    @Override
    public float tinhgiave(){
        return 1000+(400*hesophuthu);
    }
    @Override
    public void xuat(){
        System.out.println("MA GHE VIP: "+getMaghe()+"\tTEN KHACH HANG: "+getTenkh()+"\tGIA VE: "+ tinhgiave());
    }
}
