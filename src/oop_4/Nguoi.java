package oop_4;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private String CCCD;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String CCCD) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.CCCD = CCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public void thongTinNguoi() {
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Tuổi: " + getTuoi());
        System.out.println("Nghề nghiệp: " + getNgheNghiep());
        System.out.println("CCCD: " + getCCCD());
    }
}
