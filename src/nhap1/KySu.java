package nhap1;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String hoten, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao)
    {
        super(hoten, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu() {}

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nganh dao tao: " +nganhDaoTao);
    }
}
