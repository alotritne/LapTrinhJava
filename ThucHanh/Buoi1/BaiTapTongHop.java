import java.util.Scanner;

public class BaiTapTongHop {

    // 1. Tìm UCLN
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // 2. Kiểm tra số hoàn thiện
    public static boolean soHoanThien(int n) {

        int tong = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }

        return tong == n;
    }

    // 3. Kiểm tra toàn chữ số chẵn
    public static boolean toanChuSoChan(int n) {

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                return false;
            }

            n /= 10;
        }

        return true;
    }

    // Hàm tính giai thừa
    public static long giaiThua(int n) {

        long gt = 1;

        for (int i = 1; i <= n; i++) {
            gt *= i;
        }

        return gt;
    }

    // 4. Tính S(x,n)
    public static double tinhS(int x, int n) {

        double s = x;

        for (int i = 1; i <= n; i++) {

            int mu = 2 * i + 1;
            int mau = mu;

            s += Math.pow(x, mu) / giaiThua(mau);
        }

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Bài 1 =====
        System.out.println("=== TÌM UCLN ===");
        System.out.print("Nhập a = ");
        int a = sc.nextInt();

        System.out.print("Nhập b = ");
        int b = sc.nextInt();

        System.out.println("UCLN = " + UCLN(a, b));

        // ===== Bài 2 =====
        System.out.println("\n=== KIỂM TRA SỐ HOÀN THIỆN ===");
        System.out.print("Nhập n = ");
        int n1 = sc.nextInt();

        if (soHoanThien(n1)) {
            System.out.println(n1 + " là số hoàn thiện");
        } else {
            System.out.println(n1 + " không phải số hoàn thiện");
        }

        // ===== Bài 3 =====
        System.out.println("\n=== KIỂM TRA TOÀN CHỮ SỐ CHẴN ===");
        System.out.print("Nhập n = ");
        int n2 = sc.nextInt();

        if (toanChuSoChan(n2)) {
            System.out.println(n2 + " có toàn chữ số chẵn");
        } else {
            System.out.println(n2 + " không có toàn chữ số chẵn");
        }

        // ===== Bài 4 =====
        System.out.println("\n=== TÍNH S(x,n) ===");
        System.out.print("Nhập x = ");
        int x = sc.nextInt();

        System.out.print("Nhập n = ");
        int n = sc.nextInt();

        double kq = tinhS(x, n);

        System.out.println("S(" + x + "," + n + ") = " + kq);

        sc.close();
    }
}