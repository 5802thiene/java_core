package oop_4;

import java.util.ArrayList;

public class HoGiaDinh {
    private int soThanhVien;
    private String soNha;
    private ArrayList<Nguoi> dsThanhVien;

    public HoGiaDinh(String soNha) {
        this.soNha = soNha;
        this.dsThanhVien = new ArrayList<>();
    }

    public void themThanhVien(Nguoi nguoi) {
        dsThanhVien.add(nguoi);
        soThanhVien = dsThanhVien.size();
        System.out.println("THÊM THÀNH CÔNG.");
    }

    public void thongTinGiaDinh() {
        System.out.println("Số thành viên: " + soThanhVien);
        System.out.println("Số nhà: " + soNha);

        for (Nguoi nguoi : dsThanhVien) {
            nguoi.thongTinNguoi();
            System.out.println("-------------");
        }
    }

}
