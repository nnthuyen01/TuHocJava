public class Bai17_GiaiBt1 {
    public static void main(String[] args) {
//        Viết chương trình tính tổng: S = 1! + 2! + 3! + ... + 10!
        int tong = 0;
        int m = 1;
        for( int i = 1; i<=10;i++){
            m *= i;
            tong += m;
        }
        System.out.println("Tổng cần tính = "+ tong);
    }
}
