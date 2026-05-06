# Arrayy.java

```java
import java.util.*;

public class Arrayy {

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

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử N = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Nhập mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // Xuất toàn bộ mảng
        System.out.println("\nMảng vừa nhập:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        // Tính tổng mảng
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("\nTổng các phần tử = " + sum);

        // Đếm số lần xuất hiện của K
        System.out.print("\nNhập K = ");
        int k = sc.nextInt();

        int count = 0;
        for (int x : arr) {
            if (x == k) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của " + k + " là: " + count);

        // Tìm phần tử lớn nhất
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Phần tử lớn nhất = " + max);

        // Tìm phần tử nhỏ nhất
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Phần tử nhỏ nhất = " + min);

        // Xuất các số nguyên tố
        System.out.print("Các số nguyên tố trong mảng: ");
        for (int x : arr) {
            if (isPrime(x)) {
                System.out.print(x + " ");
            }
        }

        // Sắp xếp tăng dần
        int[] tangDan = arr.clone();
        Arrays.sort(tangDan);

        System.out.print("\nMảng tăng dần: ");
        for (int x : tangDan) {
            System.out.print(x + " ");
        }

        // Sắp xếp giảm dần
        int[] giamDan = arr.clone();

        Arrays.sort(giamDan);
        System.out.print("\nMảng giảm dần: ");

        for (int i = giamDan.length - 1; i >= 0; i--) {
            System.out.print(giamDan[i] + " ");
        }

        sc.close();
    }
}