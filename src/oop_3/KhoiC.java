package oop_3;

public class KhoiC extends ThiSinh {
    public KhoiC() {
    }

    public KhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

//    @Override
//    public void hienThiThongTin() {
//        super.hienThiThongTin();
//        System.out.println("Khối B: Văn, Sử, Địa.");
//    }

    @Override
    public void dsMonThi() {
        System.out.println("Khối C: Văn, Sử, Địa.");
    }
}
