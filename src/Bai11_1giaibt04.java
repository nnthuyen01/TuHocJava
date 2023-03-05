import java.util.Scanner;

public class Bai11_1giaibt04 {
    public static void main(String[] args) {
//        Tìm X, Y khi biết tổng và hiệu của chúng
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào tổng hai số: ");
        float tong = sc.nextFloat();
        System.out.println("Mời nhập vào hiệu hai số: ");
        float hieu = sc.nextFloat();
//        Tính toán
         float x = (tong+hieu)/2;
         float y = tong - x;
        System.out.println("Kq x: " + x );
        System.out.println("Kq y: " + y );
    }
}
