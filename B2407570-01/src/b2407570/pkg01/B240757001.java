
package b2407570.pkg01;
public class B240757001 {
    public static void tcnhat(SinhVien a[]){
        int max = a[0].tongsotinchi();
        for(int i=1; i<a.length; i++){
            if(max < a[i].tongsotinchi()) max = a[i].tongsotinchi();
        }
        for(int i=0; i<a.length; i++){
            if(a[i].tongsotinchi() == max) a[i].oput();
        }
    }
    public static void main(String[] args) {
        SinhVien[] a = new SinhVien[2];
        for(int i=0; i<2; i++){
            a[i] = new SinhVien();
            System.out.println("Nhap vao sinh vien thu " +(i+1)+ ": ");
            a[i].nhapsv();
        }
        for(int i=0; i<2; i++){
            a[i].oput();
        }
        System.out.print("\n");
        tcnhat(a);
    }
    
}
