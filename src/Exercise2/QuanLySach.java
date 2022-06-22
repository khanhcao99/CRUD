package Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private List<TaiLieu> taiLieuList;

    public QuanLySach() {
        taiLieuList = new ArrayList<>();
    }

    public boolean checkMa(int ma) {
        for (TaiLieu taiLieu : taiLieuList) {
            if (ma == taiLieu.getMaTaiLieu()) {
                return true;
            }
        }
        return false;
    }

    public int getIndex (int ma){
        for (int i = 0; i < taiLieuList.size() ; i++) {
            if (taiLieuList.get(i).getMaTaiLieu() == ma){
                return i;
            }
        }
        return -1;
    }

    public void displayTaiLieuCanSua(int ma) {
        System.out.println("Tài liệu bạn cần chỉnh sửa là: ");
        for (TaiLieu taiLieu : taiLieuList) {
            if (taiLieu.getMaTaiLieu() == ma) {
                System.out.println(taiLieu);
            }
        }
    }



    public void updateTaiLieu(Scanner scanner){
        System.out.println("Vui lòng nhập mã tài liệu cần chỉnh sửa: ");
        int ma = scanner.nextInt();
        if (checkMa(ma)){
            displayTaiLieuCanSua(ma);
            editTailieu(scanner, getIndex(ma));
        }else {
            System.out.println("Không có mã tài liệu nào phù hợp \n" + "VUI LÒNG NHẬP LẠI MÃ TÀI LIỆU");
            updateTaiLieu(scanner);
        }
    }


    public void editTailieu(Scanner scanner, int index){
        if (taiLieuList.get(index) instanceof Sach){
            System.out.println("_________________________________________________");
            System.out.println("---------------NHẬP THÔNG TIN MỚI----------------");
            System.out.print("Nhập tên nhà xuất bản: ");
            scanner.nextLine();
            taiLieuList.get(index).setTenNhaXB(scanner.nextLine());
            System.out.print("Nhập số bản phát hành: ");
            taiLieuList.get(index).setSoBanPH(scanner.nextInt());
            System.out.println("Nhập tên tác giả: ");
            scanner.nextLine();
            ((Sach) taiLieuList.get(index)).setTenTG(scanner.nextLine());
            System.out.println("Nhập số trang: ");
            ((Sach) taiLieuList.get(index)).setSoTrang(scanner.nextInt());
            System.out.println("----------UPDATE THÔNG TIN THÀNH CÔNG----------");
        }
        if (taiLieuList.get(index) instanceof TapChi) {
            System.out.println("_________________________________________________");
            System.out.println("---------------NHẬP THÔNG TIN MỚI----------------");
            System.out.print("Nhập tên nhà xuất bản: ");
            scanner.nextLine();
            taiLieuList.get(index).setTenNhaXB(scanner.nextLine());
            System.out.print("Nhập số bản phát hành: ");
            taiLieuList.get(index).setSoBanPH(scanner.nextInt());
            System.out.println("Nhập số phát hành: ");
            scanner.nextLine();
            ((TapChi) taiLieuList.get(index)).setSoPhatHanh(scanner.nextInt());
            System.out.println("Nhập tháng phát hành: ");
            ((TapChi) taiLieuList.get(index)).setThangPhatHanh(scanner.nextInt());
            System.out.println("----------UPDATE THÔNG TIN THÀNH CÔNG----------");
        }

        if (taiLieuList.get(index) instanceof Bao){
            System.out.println("_________________________________________________");
            System.out.println("---------------NHẬP THÔNG TIN MỚI----------------");
            System.out.print("Nhập tên nhà xuất bản: ");
            scanner.nextLine();
            taiLieuList.get(index).setTenNhaXB(scanner.nextLine());
            System.out.print("Nhập số bản phát hành: ");
            taiLieuList.get(index).setSoBanPH(scanner.nextInt());
            System.out.println("Nhập ngày phát hành: ");
            scanner.nextLine();
            ((Bao) taiLieuList.get(index)).setNgayPhatHanh(scanner.nextLine());
            System.out.println("----------UPDATE THÔNG TIN THÀNH CÔNG----------");

        }

    }
    public void creatorTaiLieu(Scanner scanner) {
        System.out.println("_________________________________________________");
        System.out.println("Nhập thông tin tài liệu mới");

        System.out.print("Nhập mã tài liệu mới: ");
        int ma = scanner.nextInt();

        if (!checkMa(ma)) {
            System.out.print("Nhập tên nhà xuất bản: ");
            scanner.nextLine();
            String nxb = scanner.nextLine();
            System.out.print("Nhập số bản phát hành: ");
            int sbph = scanner.nextInt();
            System.out.println("_________________________________________________");
            System.out.println("------Chọn loại tài liệu------ ");
            System.out.println("1. Sách");
            System.out.println("2. Tạp Chí");
            System.out.println("3. Báo");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("_________________________________________________");
                System.out.println("------VUI LÒNG ĐIỀN THÔNG TIN CHO LOẠI SÁCH------");
                System.out.println("Nhập tên tác giả: ");
                scanner.nextLine();
                String tacGia = scanner.nextLine();
                System.out.println("Nhập số trang: ");
                int soTrang = scanner.nextInt();

                TaiLieu sach = new Sach(ma, nxb, sbph, tacGia, soTrang);
                taiLieuList.add(sach);
            }

            if (choice == 2) {
                System.out.println("_________________________________________________");
                System.out.println("------VUI LÒNG ĐIỀN THÔNG TIN CHO LOẠI TẠP CHÍ------");
                System.out.println("Nhập số phát hành: ");
                scanner.nextLine();
                int soPhatHanh = scanner.nextInt();
                System.out.println("Nhập tháng phát hành: ");
                int thangPhatHanh = scanner.nextInt();

                TaiLieu tapchi = new TapChi(ma, nxb, sbph, soPhatHanh, thangPhatHanh);
                taiLieuList.add(tapchi);

            }

            if (choice == 3) {
                System.out.println("_________________________________________________");
                System.out.println("------VUI LÒNG ĐIỀN THÔNG TIN CHO LOẠI BÁO------");
                System.out.println("Nhập ngày phát hành: ");
                scanner.nextLine();
                String ngayPhatHanh = scanner.nextLine();
                TaiLieu bao = new Bao(ma, nxb, sbph, ngayPhatHanh);
                taiLieuList.add(bao);
            }

        } else {
            System.out.println("Mã tài liệu đã có không thể thêm vào");
        }
    }

    public void deleteTaiLieu(Scanner scanner) {
        System.out.println("_________________________________________________");
        System.out.println("Nhập mã tài liệu cần xóa");
        int ma = scanner.nextInt();
        taiLieuList.removeIf(taiLieu -> taiLieu.getMaTaiLieu() == ma);
    }

    public void deleteAll(){
        taiLieuList = new ArrayList<>();
    }

    public void displayTaiLieu() {
        System.out.println("_________________________________________________");
        for (TaiLieu taiLieu : taiLieuList) {
            System.out.println(taiLieu);
        }
    }
    public void searchTaiLieuTheoLoai(Scanner scanner) {
        System.out.println("_________________________________________________");
        System.out.println("Vui lòng chọn loại tài liệu cần hiển thị");
        System.out.println("1. Sách");
        System.out.println("2. Tạp Chí");
        System.out.println("3. Báo");
        int loai = scanner.nextInt();

//        for (int i = 0; i < taiLieuList.size(); i++) {
            if (loai == 1) {
                for (TaiLieu taiLieu : taiLieuList) {
                    if (taiLieu instanceof Sach) {
                        System.out.println(taiLieu);
                    }
                }
//                break;
            }
            if (loai == 2) {
                for (TaiLieu taiLieu : taiLieuList) {
                    if (taiLieu instanceof TapChi) {
                        System.out.println(taiLieu);
                    }
                }
//                break;
            }
            if (loai == 3) {
                for (TaiLieu taiLieu : taiLieuList) {
                    if (taiLieu instanceof Bao) {
                        System.out.println(taiLieu);
                    }
                }
//                break;
            }
            if (loai > 3 || loai < 1){
                System.out.println("_________________________________________________");
                System.out.println("KHÔNG CÓ LOẠI TÀI LIỆU NÀO NHƯ VẬY");
                System.out.println("VUI LÒNG CHỌN LẠI LOẠI TÀI LIỆU MUỐN HIỂN THỊ");
                searchTaiLieuTheoLoai(scanner);
            }
//        }

    }

}
