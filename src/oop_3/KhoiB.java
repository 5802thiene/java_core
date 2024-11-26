package oop_3;

public class KhoiB extends ThiSinh {
    public KhoiB() {
    }

    public KhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

//    @Override
//    public void hienThiThongTin() {
//        super.hienThiThongTin();
//        System.out.println("Khối B: Toán, Hóa, Sinh.");
//    }

    @Override
    public void dsMonThi() {
        System.out.println("Khối B: Toán, Hóa, Sinh.");
    }
}
