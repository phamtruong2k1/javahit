package bai1;
import java.util.Scanner;

public class DieuHoa extends SanPham {
    private int congSuat;
    private int giaBan;

    public DieuHoa(){
    }

    public DieuHoa(String ma, String tenSp, String tenHang, Date ngayNhap, int congSuat, int giaBan) {
        super(ma, tenSp, tenHang, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public void Nhap(){
        super.Input();
        Scanner sc= new Scanner((System.in));
        System.out.println("Nhap cong xuat:");
        congSuat=sc.nextInt();
        System.out.println("Nhap gia ban:");
        giaBan=sc.nextInt();
        sc.nextLine();
    }

    public void Xuat(){
        super.Output();
        System.out.println("Cong suat:"+congSuat);
        System.out.println("Gia ban:"+giaBan+"tr đ");
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getT(){
        return super.getTenHang();
    }
}
