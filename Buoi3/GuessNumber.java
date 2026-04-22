import java.util.Scanner;

public class DoanSo {
    void main(){
        int MIN_NUMBER = 0;
        int MAX_NUMBER = 100;
        int NUMBER = (int)(Math.random() * MAX_NUMBER + MIN_NUMBER);
        int LIMIT_TRY = 7;

        int n = 0;
        int curr = 0;
        while (curr <= LIMIT_TRY){
            n = NhapSo();
            if (n > NUMBER){
                curr++;
                System.out.println("Bé hơn");
            }
            else if(n < NUMBER){
                curr++;
                System.out.println("Lớn hơn");
            }
            else if (n == NUMBER){
                System.out.println("Đúng rồi!!!");
                return;
            }
            else{
                System.out.println("Có lỗi xảy ra");
            }
        }
        System.out.println("Đã hết lần thử");
    }
    int NhapSo(){
        int n;
        do {
            System.out.print("Nhập vào số bé hơn 100: ");
            try{
                Scanner in = new Scanner(System.in);
                n = in.nextInt();
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        } while(n >= 100);
        return n;
    }
}
