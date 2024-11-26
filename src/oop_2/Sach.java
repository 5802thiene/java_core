package oop_2;

public class Sach extends TaiLieu {
    private String tacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String maTaiLieu, String nhaSanXuat, int soBanPhatHanh, String tacGia, int soTrang) {
        super(maTaiLieu, nhaSanXuat, soBanPhatHanh);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Tên tác giả: " + getTacGia());
        System.out.println("Số trang: " + getSoTrang());
    }
}
