import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bai28_GiaiBt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n la so luong phan tu trong List");
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < n; i++){
            int ngauNhien= rd.nextInt(1,101);
            lst.add(ngauNhien);
        }
        System.out.println(lst);
    }
}
