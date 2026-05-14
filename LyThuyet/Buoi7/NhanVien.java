import java.util.Scanner;

class NhanVien {

    // Thuộc tính
    private String ho;
    private String ten;
    private int soSP;

    // Constructor
    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;

        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    // Getter & Setter
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    // Hàm tính lương
    public double getLuong() {

        double donGia;

        if (soSP >= 1 && soSP <= 199) {
            donGia = 0.5;
        } else if (soSP <= 399) {
            donGia = 0.55;
        } else if (soSP <= 599) {
            donGia = 0.6;
        } else {
            donGia = 0.65;
        }

        return soSP * donGia;
    }

    // Hàm so sánh số sản phẩm
    public boolean LonHon(NhanVien nv2) {
        return this.soSP > nv2.soSP;
    }

    // Hàm hiển thị
    public void hienThi() {
        System.out.println("Họ tên: " + ho + " " + ten);
        System.out.println("Số sản phẩm: " + soSP);
        System.out.println("Lương: " + getLuong());
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập nhân viên 1
        System.out.println("Nhập thông tin nhân viên 1:");
        System.out.print("Họ: ");
        String ho1 = sc.nextLine();

        System.out.print("Tên: ");
        String ten1 = sc.nextLine();

        System.out.print("Số sản phẩm: ");
        int sp1 = sc.nextInt();
        sc.nextLine();

        // Nhập nhân viên 2
        System.out.println("\nNhập thông tin nhân viên 2:");
        System.out.print("Họ: ");
        String ho2 = sc.nextLine();

        System.out.print("Tên: ");
        String ten2 = sc.nextLine();

        System.out.print("Số sản phẩm: ");
        int sp2 = sc.nextInt();

        // Tạo đối tượng
        NhanVien nv1 = new NhanVien(ho1, ten1, sp1);
        NhanVien nv2 = new NhanVien(ho2, ten2, sp2);

        // Xuất thông tin
        System.out.println("\n===== THÔNG TIN NHÂN VIÊN =====");

        System.out.println("\nNhân viên 1:");
        nv1.hienThi();

        System.out.println("\nNhân viên 2:");
        nv2.hienThi();

        // So sánh dùng hàm LonHon
        System.out.println("\n===== SO SÁNH (Dùng hàm LonHon) =====");

        if (nv1.LonHon(nv2)) {
            System.out.println(nv1.getHo() + " " + nv1.getTen()
                    + " có nhiều sản phẩm hơn "
                    + (nv1.getSoSP() - nv2.getSoSP()) + " sản phẩm");
        } else if (nv2.LonHon(nv1)) {
            System.out.println(nv2.getHo() + " " + nv2.getTen()
                    + " có nhiều sản phẩm hơn "
                    + (nv2.getSoSP() - nv1.getSoSP()) + " sản phẩm");
        } else {
            System.out.println("Hai nhân viên có số sản phẩm bằng nhau");
        }

        // So sánh không dùng hàm LonHon
        System.out.println("\n===== SO SÁNH (Không dùng hàm LonHon) =====");

        if (nv1.getSoSP() > nv2.getSoSP()) {
            System.out.println(nv1.getHo() + " " + nv1.getTen()
                    + " có nhiều sản phẩm hơn "
                    + (nv1.getSoSP() - nv2.getSoSP()) + " sản phẩm");
        } else if (nv2.getSoSP() > nv1.getSoSP()) {
            System.out.println(nv2.getHo() + " " + nv2.getTen()
                    + " có nhiều sản phẩm hơn "
                    + (nv2.getSoSP() - nv1.getSoSP()) + " sản phẩm");
        } else {
            System.out.println("Hai nhân viên có số sản phẩm bằng nhau");
        }

        sc.close();
    }
}