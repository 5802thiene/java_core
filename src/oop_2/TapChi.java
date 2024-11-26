package oop_2;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi() {}

    public TapChi(String maTaiLieu, String nhaSanXuat, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh)
    {
        super(maTaiLieu, nhaSanXuat, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số phát hành: " +getSoPhatHanh());
        System.out.println("Tháng phát hành: " +getThangPhatHanh());
    }
}
