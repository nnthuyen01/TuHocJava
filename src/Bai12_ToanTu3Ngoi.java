import java.util.Scanner;

public class Bai12_ToanTu3Ngoi {

    public static void main(String[] args) {
//        Nhap vao 1 so chan hoac le
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        String traloi = (n%2==0) ? "Chan" : "Le";
        System.out.println("So " + n+ " la so " + traloi);
    }
}
