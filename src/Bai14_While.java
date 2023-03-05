import java.util.Scanner;

public class Bai14_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn phải nhập số từ 1 đến 99: \n");
        int n = sc.nextInt();
        while (n<1 || n>99){
            System.out.println("Bạn phải nhập số từ 1 đến 99");
            n = sc.nextInt();
        }
        System.out.println("bạn đã nhập đúng rồi :)) n bằng "+ n);
    }
}
