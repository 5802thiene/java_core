package oop_2;

import java.time.LocalDate;

public class BaoChi extends TaiLieu{
    private LocalDate ngayPhatHanh;

    public BaoChi() {}

    public BaoChi(String maTaiLieu, String nhaSanXuat, int soBanPhatHanh, LocalDate ngayPhatHanh)
    {
        super(maTaiLieu, nhaSanXuat, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public LocalDate getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngày phát hành: " +getNgayPhatHanh());
    }
}
