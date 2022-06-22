package Exercise2;

public class Sach extends TaiLieu {
    private String tenTG;
    private int soTrang;

    public Sach() {

    }

    public Sach(String tenTG, int soTrang) {
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public Sach(int maTaiLieu, String tenNhaXB, int soBanPH, String tenTG, int soTrang) {
        super(maTaiLieu, tenNhaXB, soBanPH);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" + super.toString() +
                ", tenTG= '" + tenTG + '\'' +
                ", soTrang= " + soTrang +
                '}';
    }
}
