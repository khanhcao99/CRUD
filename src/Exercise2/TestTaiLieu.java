package Exercise2;

import java.util.Scanner;

public class TestTaiLieu {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--------Menu--------");
            System.out.println("--------------------");
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Chỉnh sửa tài liệu theo id");
            System.out.println("3. Xóa tài liệu theo mã tài liệu");
            System.out.println("4. Xóa toàn bộ tài liệu");
            System.out.println("5. Hiển thị thông tin về tài liệu");
            System.out.println("6. Tìm kiếm tài liệu theo loại: Sách, Tạp Chí, Báo");
            System.out.println("7. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    quanLySach.creatorTaiLieu(scanner);
                    break;
                case 2:
                    quanLySach.updateTaiLieu(scanner);
                    break;
                case 3:
                    quanLySach.deleteTaiLieu(scanner);
                    break;
                case 4:
                    quanLySach.deleteAll();
                    break;
                case 5:
                    quanLySach.displayTaiLieu();
                    break;
                case 6:
                    quanLySach.searchTaiLieuTheoLoai(scanner);
                    break;
            }
        }while (choice != 7);
    }
}
