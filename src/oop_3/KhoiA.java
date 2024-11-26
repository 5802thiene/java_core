package oop_3;

public class KhoiA extends ThiSinh {
    public KhoiA() {
    }

    public KhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

//    @Override
//    public void hienThiThongTin() {
//        super.hienThiThongTin();
//        System.out.println("Khối A: Toán, Lý, Hóa.");
//    }

    @Override
    public void dsMonThi() {
        System.out.println("Khối A: Toán, Lý, Hóa.");
    }
}
