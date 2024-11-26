package oop_2;

import java.util.ArrayList;
import java.util.Scanner;

class QLS {
    private ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void themMoiTaiLieu(TaiLieu taiLieu)
    {
        danhSachTaiLieu.add(taiLieu);
        System.out.println("THÊM TÀI LIỆU THÀNH CÔNG");
    }

    public void xoaTaiLieu(String maTaiLieu)
    {
        danhSachTaiLieu.removeIf(taiLieu -> taiLieu.getMaTaiLieu().equals(maTaiLieu));
        System.out.println("XOÁ THÀNH CÔNG");
    }

    public void hienThiThongTin()
    {
        if (danhSachTaiLieu.isEmpty())
        {
            System.out.println("KHÔNG CÓ TÀI LIỆU.");
            return;
        }

        for (TaiLieu taiLieu : danhSachTaiLieu)
        {
            taiLieu.hienThiThongTin();
            System.out.println("-----------------");
        }
    }

    public void timKiemTaiLieuTheoLoai(Class<?> loaiTaiLieu) {
        boolean found = false;
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (loaiTaiLieu.isInstance(taiLieu)) {
                taiLieu.hienThiThongTin();
                System.out.println("-----------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("KHÔNG TÌM THẤY TÀI LIỆU LOẠI: " + loaiTaiLieu.getSimpleName());
        }
    }

}
