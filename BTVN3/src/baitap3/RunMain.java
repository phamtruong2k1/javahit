package baitap3;

public class RunMain {
    public static void main(String[] args) {
        HangHoa a1 = new HangHoa("anh","Ti Vi",100000,2);
        HangHoa a2 = new HangHoa();
        a2.setMaHang("aft");
        a2.setTenHang("Tu lanh");
        a2.setDonGia(200000);
        a2.setSoLuong(2);
        System.out.println("Mặt hàng thứ 1:");
        a1.Xuat();
        System.out.println("Mặt hàng thứ 2:");
        a2.Xuat();
    }
}
