package Exercise2;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao() {

    }

    public Bao(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(int maTaiLieu, String tenNhaXB, int soBanPH, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXB, soBanPH);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" + super.toString() +
                ", ngayPhatHanh= " + ngayPhatHanh +
                '}';
    }
}
