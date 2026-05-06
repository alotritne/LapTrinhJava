import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tạo ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        // Nhập danh sách
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        // Xuất danh sách
        System.out.println("\nDanh sách hiện tại: " + list);

        //THÊM
        System.out.print("\nNhập số cần thêm: ");
        int them = sc.nextInt();
        list.add(them);

        System.out.println("Danh sách sau khi thêm: " + list);

        //SỬA
        System.out.print("\nNhập vị trí cần sửa: ");
        int viTriSua = sc.nextInt();

        if (viTriSua >= 0 && viTriSua < list.size()) {

            System.out.print("Nhập giá trị mới: ");
            int giaTriMoi = sc.nextInt();

            list.set(viTriSua, giaTriMoi);

            System.out.println("Danh sách sau khi sửa: " + list);

        } else {
            System.out.println("Vị trí không hợp lệ!");
        }

        //XÓA
        System.out.print("\nNhập vị trí cần xóa: ");
        int viTriXoa = sc.nextInt();

        if (viTriXoa >= 0 && viTriXoa < list.size()) {

            list.remove(viTriXoa);

            System.out.println("Danh sách sau khi xóa: " + list);

        } else {
            System.out.println("Vị trí không hợp lệ!");
        }

        //TÌM KIẾM
        System.out.print("\nNhập số cần tìm: ");
        int tim = sc.nextInt();

        if (list.contains(tim)) {

            int index = list.indexOf(tim);

            System.out.println(tim + " xuất hiện tại vị trí: " + index);

        } else {
            System.out.println("Không tìm thấy " + tim);
        }

        //SẮP XẾP
        Collections.sort(list);

        System.out.println("\nDanh sách tăng dần: " + list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Danh sách giảm dần: " + list);

        sc.close();
    }
}