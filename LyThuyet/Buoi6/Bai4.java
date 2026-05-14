import java.util.Scanner;

public class Bai4 {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Nhập mảng
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int countOdd = 0;
        int countEven = 0;

        // Dòng 1: số lẻ
        System.out.print("\nDòng 1 - Các số lẻ: ");
        for (int x : arr) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
                countOdd++;
            }
        }
        System.out.println("=> Có " + countOdd + " số lẻ");

        // Dòng 2: số chẵn
        System.out.print("\nDòng 2 - Các số chẵn: ");
        for (int x : arr) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                countEven++;
            }
        }
        System.out.println("=> Có " + countEven + " số chẵn");

        // Dòng 3: số nguyên tố
        System.out.print("\nDòng 3 - Các số nguyên tố: ");
        for (int x : arr) {
            if (isPrime(x)) {
                System.out.print(x + " ");
            }
        }

        // Dòng 4: không phải số nguyên tố
        System.out.print("\n\nDòng 4 - Các số không phải số nguyên tố: ");
        for (int x : arr) {
            if (!isPrime(x)) {
                System.out.print(x + " ");
            }
        }

        sc.close();
    }
}