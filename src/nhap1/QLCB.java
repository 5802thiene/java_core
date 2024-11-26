package nhap1;

import java.util.ArrayList;
import java.util.Scanner;

class QLCB {

    private ArrayList<CanBo> danhSachCanBo = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void khung(String[] noiDung)
    {
        int maxWidth = 0;

        for (String line : noiDung)
        {
            if (line.length() > maxWidth)
            {
                maxWidth = line.length();
            }
        }

        for (int i = 0; i<maxWidth + 4; i++)
        {
            System.out.print("-");
        }
        System.out.println();

        for (String line : noiDung)
        {
            System.out.printf("| %-" + maxWidth + "s |\n", line);
        }

        for (int i = 0; i<maxWidth + 4; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }

    public void themCanBo() {

        while (true) {
            String[] themCanBo = {
                    "Loại cán bộ.",
                    "1. Công nhân.",
                    "2. Kỹ sư.",
                    "3. Nhân viên.",
                    "Chọn loại cán bộ cần thêm: "
            };

            khung(themCanBo);

            int luaChon = sc.nextInt();
            sc.nextLine();

            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Tuổi: ");
            int tuoi = sc.nextInt();
            sc.nextLine();
            System.out.print("Giới tính: ");
            String gioiTinh = sc.nextLine();
            System.out.print("Địa chỉ: ");
            String diaChi = sc.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập bậc (1-10): ");
                    int bac = sc.nextInt();
                    danhSachCanBo.add(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                    break;
                case 2:
                    System.out.print("Nhập ngành đào tạo: ");
                    String nganhDaoTao = sc.nextLine();
                    danhSachCanBo.add(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
                    break;
                case 3:
                    System.out.print("Nhập công việc: ");
                    String congViec = sc.nextLine();
                    danhSachCanBo.add(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
            break;
        }
    }

    public void timKiemTheoHoTen() {
        System.out.print("Nhập họ tên cán bộ cần tìm: ");
        String nhapTen = sc.nextLine();
        boolean timKiem = false;

        ArrayList<String> noiDungKhung = new ArrayList<>();

        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoTen().equals(nhapTen)) {
                noiDungKhung.add("Thong tin can bo: ");
                noiDungKhung.add("Ho ten: " +canBo.getHoTen());
                noiDungKhung.add(("Tuoi: " +canBo.getTuoi()));
                noiDungKhung.add("Gioi tinh: " +canBo.getGioiTinh());
                noiDungKhung.add("Dia chi: " +canBo.getDiaChi());

                if(canBo instanceof CongNhan)
                {
                    CongNhan congNhan = (CongNhan) canBo;
                    noiDungKhung.add("Bac: " +congNhan.getBac());
                }
                else if (canBo instanceof KySu) {
                    KySu kySu = (KySu) canBo;
                    noiDungKhung.add("Nganh dao tao: " +kySu.getNganhDaoTao());
                }
                else if (canBo instanceof NhanVien) {
                    NhanVien nhanVien = (NhanVien) canBo;
                    noiDungKhung.add(("Cong viec: " +nhanVien.getCongViec()));
                }

                timKiem = true;
                break;
            }
        }

        if (timKiem) {
            khung(noiDungKhung.toArray(new String[0]));
        }
        else {
            khung(new String[]{"Không có cán bộ với tên: " + nhapTen});
        }
    }

    public void hienThiDanhSach() {
        if (danhSachCanBo.isEmpty()) {
            System.out.println("Không có cán bộ trong danh sách.");
            return;
        }

        for (CanBo canBo : danhSachCanBo) {
            canBo.hienThiThongTin();
            System.out.println("----------------------");
        }
    }

    public void menu() {
        while (true) {

            String[] menu = {
                    "Các chức năng quản lý cán bộ.",
                    "1. Thêm cán bộ.",
                    "2. Tìm kiếm theo họ tên.",
                    "3. Hiển thị toàn bộ danh sách.",
                    "4. Thoát",
                    "Hãy chọn chức năng: "
            };

            int maxWidth = 0;
            for (String line : menu) {
                if (line.length() > maxWidth) {
                    maxWidth = line.length();
                }
            }

            // In viền trên của khung
            System.out.print("+");
            for (int i = 0; i < maxWidth + 4; i++) {
                System.out.print("+");
            }
            System.out.println("+");

            // In nội dung menu bên trong khung
            for (String line : menu) {
                System.out.printf("|  %-" + maxWidth + "s  |\n", line);
            }

            // In viền dưới của khung
            System.out.print("+");
            for (int i = 0; i < maxWidth + 4; i++) {
                System.out.print("+");
            }
            System.out.println("+");

            int chucNang = sc.nextInt();
            sc.nextLine();
            switch (chucNang) {
                case 1:
                    themCanBo();
                    break;
                case 2:
                    timKiemTheoHoTen();
                    break;
                case 3:
                    hienThiDanhSach();
                    break;
                case 4:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }

}
