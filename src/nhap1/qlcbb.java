package nhap1;

import java.util.ArrayList;
import java.util.Scanner;

class qlcbb {

    private ArrayList<CanBo> danhSachCanBo = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public int nhapSoNguyen()
    {
        while (true)
        {
            try {
                return Integer.parseInt(sc.nextLine());
            }
            catch (Exception e)
            {
                return 0;
            }
        }
    }


    public void themCanBo() {
        int luaChon;
        while (true) {
            System.out.println("CHỌN LOẠI CÁN BỘ CẦN THÊM.");
            System.out.println("1. Công nhân.");
            System.out.println("2. Kỹ sư.");
            System.out.println("3. Nhân viên.");
            System.out.print("NHẬP LỰA CHỌN: ");
            luaChon = nhapSoNguyen();

            if (luaChon >= 1 && luaChon <= 3) {
                break;
            }
            else {
                System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG CHỌN LẠI..");
            }
        }

        System.out.print("Họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Tuổi: ");
        int tuoi = nhapSoNguyen();
        System.out.print("Giới tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.nextLine();

        switch (luaChon) {
            case 1:
                System.out.print("Nhập bậc (1-10): ");
                int bac = nhapSoNguyen();
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
        }
    }

    public void timKiemTheoHoTen() {
        System.out.println("NHẬP HỌ TÊN CÁN BỘ CẦN TÌM: ");
        String hoTen = sc.nextLine();
        boolean timKiem = false;

        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoTen().equals(hoTen)) {
                canBo.hienThiThongTin();
                System.out.println("----------------------");
                timKiem = true;
                break;
            }
        }

        if (!timKiem) {
            System.out.println("KHÔNG CÓ CÁN BỘ ĐÓ.");
        }
    }

    public void hienThiDanhSach() {
        if (danhSachCanBo.isEmpty()) {
            System.out.println("KHÔNG CÓ CÁN BỘ TRONG DANH SÁCH.");
            return;
        }

        for (CanBo canBo : danhSachCanBo) {
            canBo.hienThiThongTin();
            System.out.println("----------------------");
        }
    }

    public void chucNang() {
        while (true) {
            System.out.println("CHỌN CHỨC NĂNG QUẢN LÝ CÁN BỘ.");
            System.out.println("1. Thêm cán bộ.");
            System.out.println("2. Tìm kiếm theo họ tên.");
            System.out.println("3. Hiển thị toàn bộ danh sách.");
            System.out.println("4. Thoát.");
            System.out.println("------------");
            int chucNang = nhapSoNguyen();

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
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG CHỌN LẠI.");
            }
        }
    }
}
