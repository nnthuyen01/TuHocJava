import java.util.Scanner;

public class Bai10_GiaiBaiTap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào bán kính đường tròn r:");
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r,2);
//        Xuất kết quả
        System.out.println("Chu vi là: "+ cv);
        System.out.println("Diện tích là: "+ dt);
    }
}
