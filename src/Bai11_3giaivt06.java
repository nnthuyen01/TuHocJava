import java.util.Scanner;

public class Bai11_3giaivt06 {
    public static void main(String[] args) {
/*    Nhập vào 1 năm dương lịch,
    kiểm tra năm đó có phải năm nhuận không*/
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào 1 năm dương lịch");
        int nam = sc.nextInt();
        if (((nam%4==0) && (nam % 100 != 0)) || (nam % 400 ==0))
            System.out.println("la nam nhuan");
        else System.out.println("La nam khong nhuan");
    }
}
