package oop_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        QLS quanLySach = new QLS();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String[] menu = {
                    "QUẢN LÝ TÀI LIỆU THƯ VIỆN: ",
                    "1. Thêm mới tài liệu.",
                    "2. Xoá tài liệu.",
                    "3. Hiển thị thông tin tài liệu.",
                    "4. Tìm kiếm tài liệu theo loại.",
                    "5. Thoát.",
                    "CHỌN CHỨC NĂNG."
            };
            int maxWidth = 0;
            for (String line : menu) {
                if (line.length() > maxWidth) {
                    maxWidth = line.length();
                }
            }

            System.out.print("+");
            for (int i = 0; i < maxWidth + 4; i++) {
                System.out.print("+");
            }
            System.out.println("+");

            for (String line : menu) {
                System.out.printf("|  %-" + maxWidth + "s  |\n", line);
            }

            System.out.print("+");
            for (int i = 0; i < maxWidth + 4; i++) {
                System.out.print("+");
            }
            System.out.println("+");

            int luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.println("Chọn loại tài liệu:");
                    System.out.println("1. Sách.");
                    System.out.println("2. Tạp chí.");
                    System.out.println("3. Báo chí.");
                    System.out.println("-----------------");
                    int loai = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Mã tài liệu: ");
                    String maTaiLieu = sc.nextLine();
                    System.out.print("Tên nhà xuất bản: ");
                    String nhaXuatBan = sc.nextLine();
                    System.out.print("Số bản phát hành: ");
                    int soBan = sc.nextInt();
                    sc.nextLine();

                    if (loai == 1) {
                        System.out.print("Tên tác giả: ");
                        String tacGia = sc.nextLine();
                        System.out.print("Số trang: ");
                        int soTrang = sc.nextInt();
                        sc.nextLine();
                        TaiLieu sach = new Sach(maTaiLieu, nhaXuatBan, soBan, tacGia, soTrang);
                        quanLySach.themMoiTaiLieu(sach);
                    }
                    else if (loai == 2) {
                        System.out.print("Số phát hành: ");
                        int soPhatHanh = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Tháng phát hành: ");
                        int thangPhatHanh = sc.nextInt();
                        sc.nextLine();
                        TaiLieu tapChi = new TapChi(maTaiLieu, nhaXuatBan, soBan, soPhatHanh, thangPhatHanh);
                        quanLySach.themMoiTaiLieu(tapChi);
                    }
                    else if (loai == 3) {
                        System.out.println("Ngày phát hành (YYYY-MM-DD): ");
                        String ngayStr = sc.nextLine();
                        TaiLieu baoChi = new BaoChi(maTaiLieu, nhaXuatBan, soBan, LocalDate.parse(ngayStr));
                        quanLySach.themMoiTaiLieu(baoChi);
                    }
                    break;

                case 2:
                    System.out.print("Nhập mã tài liệu cần xoá: ");
                    String maXoa = sc.nextLine();
                    quanLySach.xoaTaiLieu(maXoa);
                    break;

                case 3:
                    System.out.println("Các tài liệu: ");
                    quanLySach.hienThiThongTin();
                    break;

                case 4:
                    System.out.println("Nhập loại tài liệu cần tìm: ");
                    System.out.println("1. Sách.");
                    System.out.println("2. Tạp chí.");
                    System.out.println("3. Báo chí.");
                    int loaiTaiLieu = Integer.parseInt(sc.nextLine());

                    if (loaiTaiLieu == 1) {
                        quanLySach.timKiemTaiLieuTheoLoai(Sach.class);
                    }
                    else if (loaiTaiLieu == 2) {
                        quanLySach.timKiemTaiLieuTheoLoai(TapChi.class);
                    }
                    else if (loaiTaiLieu == 3) {
                        quanLySach.timKiemTaiLieuTheoLoai(BaoChi.class);
                    }
                    else {
                        System.out.println("LỰA CHỌN KHÔNG HỢP LỆ.");
                    }
                    break;

                case 5:
                    System.out.println("THOÁT CHƯƠNG TRÌNH.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ.");
                    break;
            }

        }
    }
}
