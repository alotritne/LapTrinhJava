import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class NegativeNumberInStrings {

    // Hàm tìm số âm trong chuỗi
    public static void NegativeNumberInStrings(String str) {

        // Regex tìm số âm
        Pattern pattern = Pattern.compile("-\\d+");
        Matcher matcher = pattern.matcher(str);

        int count = 0;

        System.out.println("Các số âm trong chuỗi:");

        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }

        System.out.println("Tổng cộng có " + count + " số âm");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        NegativeNumberInStrings(str);

        sc.close();
    }
}