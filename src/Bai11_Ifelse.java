import java.util.Scanner;

public class Bai11_Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao dtb: ");
        double dtb = sc.nextDouble();
//        Kiểm tra điều kiện
        if (dtb>5.0){
            System.out.println("Bạn đỗ");
            System.out.println("Chúc mừng bạn");
        }
        else {
            System.out.println("Bạn tạch");
        }
    }
}
