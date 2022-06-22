package Exercise2;

public class TaiLieu {
    private int maTaiLieu;
    private String tenNhaXB;
    private int soBanPH;

    public TaiLieu() {

    }

    public TaiLieu(int maTaiLieu, String tenNhaXB, int soBanPH) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXB = tenNhaXB;
        this.soBanPH = soBanPH;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    @Override
    public String toString() {
        return " TaiLieu{" +
                "maTaiLieu= " + maTaiLieu +
                ", tenXuatBan= '" + tenNhaXB + '\'' +
                ", soPhatHanh= " + soBanPH +
                '}';
    }


}
