import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tạo HashMap<Integer, String>
        HashMap<Integer, String> books = new HashMap<>();

        //THÊM
        System.out.print("Nhập số lượng sách: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nNhập thông tin sách thứ " + (i + 1));

            System.out.print("Mã sách: ");
            int maSach = sc.nextInt();
            sc.nextLine();

            System.out.print("Tên sách: ");
            String tenSach = sc.nextLine();

            books.put(maSach, tenSach);
        }

        //XUẤT DANH SÁCH
        System.out.println("\nDanh sách sách:");

        for (Map.Entry<Integer, String> entry : books.entrySet()) {

            System.out.println(
                    "Mã sách: " + entry.getKey()
                    + " - Tên sách: " + entry.getValue());
        }

        //SỬA
        System.out.print("\nNhập mã sách cần sửa: ");
        int maSua = sc.nextInt();
        sc.nextLine();

        if (books.containsKey(maSua)) {

            System.out.print("Nhập tên sách mới: ");
            String tenMoi = sc.nextLine();

            books.put(maSua, tenMoi);

            System.out.println("Đã cập nhật thành công!");

        } else {
            System.out.println("Không tìm thấy mã sách!");
        }

        //XÓA
        System.out.print("\nNhập mã sách cần xóa: ");
        int maXoa = sc.nextInt();

        if (books.containsKey(maXoa)) {

            books.remove(maXoa);

            System.out.println("Đã xóa thành công!");

        } else {
            System.out.println("Không tìm thấy mã sách!");
        }

        //TÌM KIẾM
        System.out.print("\nNhập mã sách cần tìm: ");
        int maTim = sc.nextInt();

        if (books.containsKey(maTim)) {

            System.out.println("Tên sách: " + books.get(maTim));

        } else {
            System.out.println("Không tìm thấy sách!");
        }

        //XUẤT DANH SÁCH CUỐI
        System.out.println("\nDanh sách sách sau khi xử lý:");

        for (Map.Entry<Integer, String> entry : books.entrySet()) {

            System.out.println(
                    "Mã sách: " + entry.getKey()
                    + " - Tên sách: " + entry.getValue());
        }

        sc.close();
    }
}