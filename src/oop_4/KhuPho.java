package oop_4;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoGiaDinh> dsHoGiaDinh;

    public KhuPho()
    {
        this.dsHoGiaDinh = new ArrayList<>();
    }

    public void themHoGiaDinh(HoGiaDinh hoGiaDinh)
    {
        dsHoGiaDinh.add(hoGiaDinh);
        System.out.println("THÊM THÀNH CÔNG.");
    }

    public void danhSachHo()
    {
        if (dsHoGiaDinh.isEmpty())
        {
            System.out.println("Không có hộ gia đình nào.");
            return;
        }

        for (HoGiaDinh hoGiaDinh : dsHoGiaDinh)
        {
            hoGiaDinh.thongTinGiaDinh();
            System.out.println("--------------");
        }
    }

    //nhập số hộ gia đình.
    public void nhapDanhSachHo()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hộ gia đình: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i<n; i++)
        {
            System.out.println("Nhập thông tin gia đình thứ: " + (i+1));
            System.out.print("Số thành viên: ");
            int soThanhVien = Integer.parseInt(sc.nextLine());
            System.out.println("Số nhà: ");
            String soNha = sc.nextLine();


        }

    }
}
