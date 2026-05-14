import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySinhVien {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> dsSinhVien = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Tìm sinh viên có chữ 'An'");
            System.out.println("6. Sắp xếp sinh viên");
            System.out.println("7. Xuất số lượng sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                // a) Thêm sinh viên
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    String ten = sc.nextLine();
                    dsSinhVien.add(ten);
                    System.out.println("Đã thêm sinh viên!");
                    break;

                // b) Xuất danh sách sinh viên
                case 2:
                    System.out.println("\nDanh sách sinh viên:");
                    if (dsSinhVien.isEmpty()) {
                        System.out.println("Danh sách rỗng!");
                    } else {
                        for (int i = 0; i < dsSinhVien.size(); i++) {
                            System.out.println((i + 1) + ". " + dsSinhVien.get(i));
                        }
                    }
                    break;

                // c) Sửa sinh viên
                case 3:
                    System.out.print("Nhập tên sinh viên cần sửa: ");
                    String tenCu = sc.nextLine();

                    if (dsSinhVien.contains(tenCu)) {
                        System.out.print("Nhập tên mới: ");
                        String tenMoi = sc.nextLine();

                        int index = dsSinhVien.indexOf(tenCu);
                        dsSinhVien.set(index, tenMoi);

                        System.out.println("Sửa thành công!");
                    } else {
                        System.out.println("Không tìm thấy sinh viên!");
                    }
                    break;

                // d) Xóa sinh viên chứa tên bất kỳ
                case 4:
                    System.out.print("Nhập tên cần xóa: ");
                    String tenXoa = sc.nextLine();

                    boolean daXoa = false;

                    for (int i = dsSinhVien.size() - 1; i >= 0; i--) {
                        if (dsSinhVien.get(i).toLowerCase().contains(tenXoa.toLowerCase())) {
                            dsSinhVien.remove(i);
                            daXoa = true;
                        }
                    }

                    if (daXoa) {
                        System.out.println("Đã xóa sinh viên!");
                    } else {
                        System.out.println("Không tìm thấy!");
                    }
                    break;

                // e) Tìm sinh viên có chữ An
                case 5:
                    System.out.println("Sinh viên có chữ 'An':");

                    boolean found = false;

                    for (String sv : dsSinhVien) {
                        if (sv.toLowerCase().contains("an")) {
                            System.out.println(sv);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không có sinh viên nào!");
                    }
                    break;

                // f) Sắp xếp sinh viên
                case 6:
                    Collections.sort(dsSinhVien);
                    System.out.println("Đã sắp xếp danh sách!");
                    break;

                // g) Xuất số lượng sinh viên
                case 7:
                    System.out.println("Số lượng sinh viên: " + dsSinhVien.size());
                    break;

                // Thoát
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);

        sc.close();
    }
}