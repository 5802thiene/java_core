package oop_3;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    ArrayList<ThiSinh> dsThiSinh = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public int nhapSoNguyen() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            }
            catch (Exception e) {
                System.out.println("KHÔNG HỢP LỆ. NHẬP LẠI.");
            }
        }
    }

    public int nhapMucUuTien() {
        while (true) {
            int mucUuTien = nhapSoNguyen();
            if (mucUuTien >= 1 && mucUuTien <= 4) {
                return mucUuTien;
            }
            System.out.print("MỨC ƯU TIÊN KHÔNG HỢP LỆ. VUI LÒNG NHẬP LẠI (1-4): ");
        }
    }

    public void themMoiThiSinh(ThiSinh thiSinh) {
        dsThiSinh.add(thiSinh);
        System.out.println("THÊM THÀNH CÔNG.");

    }

    public void thongTinThiSinh() {
        if (dsThiSinh.isEmpty()) {
            System.out.println("KHÔNG CÓ THÍ SINH TRONG DANH SÁCH.");
            return;
        }

        for (ThiSinh thiSinh : dsThiSinh) {
            thiSinh.hienThiThongTin();
            thiSinh.dsMonThi();
            System.out.println("-----------------");
        }
    }

    public void timKiemTheoSBD(String sbd) {
        boolean found = false;

        for (ThiSinh thiSinh : dsThiSinh) {
            if (thiSinh.getSoBaoDanh().equals(sbd)) {
                thiSinh.hienThiThongTin();
                thiSinh.dsMonThi();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("KHÔNG TÌM THẤY THÍ SINH VỚI SỐ BÁO DANH: " + sbd);
        }
    }

    public void menu() {
        int chucNang;

        while (true) {
            System.out.println("CÁC CHỨC NĂNG.");
            System.out.println("1. Thêm mới thí sinh.");
            System.out.println("2. Hiển thị thông tin thí sinh và khối thi của thí sinh.");
            System.out.println("3. Tìm kiếm theo số báo danh.");
            System.out.println("4. Thoát.");
            System.out.println("CHỌN CHỨC NĂNG.");
            chucNang = nhapSoNguyen();

            switch (chucNang) {
                case 1:
                    System.out.print("Số báo danh: ");
                    String soBaoDanh = sc.nextLine();
                    System.out.print("Họ tên: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String diaChi = sc.nextLine();
                    System.out.print("Mức ưu tiên (1-4): ");
                    int mucUuTien = nhapMucUuTien();
                    System.out.print("Chọn khối thi A/B/C: ");
                    String khoiThi;
                    ThiSinh thiSinh = null;

                    while (true) {
                        khoiThi = sc.nextLine().toUpperCase();
                        if (khoiThi.equalsIgnoreCase("A")) {
                            thiSinh = new KhoiA(soBaoDanh, hoTen, diaChi, mucUuTien);
                            break;
                        }
                        else if (khoiThi.equalsIgnoreCase("B")) {
                            thiSinh = new KhoiB(soBaoDanh, hoTen, diaChi, mucUuTien);
                            break;
                        }
                        else if (khoiThi.equalsIgnoreCase("C")) {
                            thiSinh = new KhoiC(soBaoDanh, hoTen, diaChi, mucUuTien);
                            break;
                        }
                        else {
                            System.out.println("Khối thi không hợp lệ. Vui lòng nhập lại.");
                        }
                    }

                    if (thiSinh != null) {
                        themMoiThiSinh(thiSinh);
                    }
                    else {
                        System.out.println("KHÔNG THỂ THÊM THÍ SINH.");
                    }
                    break;

                case 2:
                    thongTinThiSinh();
                    break;
                case 3:
                    System.out.print("Nhập số báo danh: ");
                    soBaoDanh = sc.nextLine();
                    timKiemTheoSBD(soBaoDanh);
                    break;
                case 4:
                    System.out.println("THOÁT.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("KHÔNG HỢP LỆ.");
            }
        }
    }

    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        tuyenSinh.menu();
    }
}
