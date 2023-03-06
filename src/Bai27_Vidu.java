import java.util.Arrays;
import java.util.Scanner;

public class Bai27_Vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào phần tử tối đa của mảng: ");
        int n = sc.nextInt();
        //tạo mảng có n phần tử (cấp phát bộ nhớ cho mảng)
        int[] M = new int[n];
        //Nhập dữ liệu cho từng phần tử
        System.out.println("Số phần tử của mảng: "+ M.length);
        for (int i = 0; i < n; i++){
            System.out.print("M["+i+"]= "); //M[0] =
            M[i] = sc.nextInt();
        }

        //Xuat Mang de xem
        System.out.println("Mảng M được tạo là: ");
        System.out.println(Arrays.toString(M));
    }
}
