package oop_2;

public class TaiLieu {
    private String maTaiLieu;
    private String nhaSanXuat;
    private int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String nhaSanXuat, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaSanXuat = nhaSanXuat;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void hienThiThongTin() {
        System.out.println("Mã tài liệu: " + getMaTaiLieu());
        System.out.println("Tên nhà xuất bản: " + getNhaSanXuat());
        System.out.println("Số bản phát hành: " + getSoBanPhatHanh());
    }
}
