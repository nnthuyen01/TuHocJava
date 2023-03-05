public class Bai15_DoWhile {
    public static void main(String[] args) {
//        Vòng lặp này khác với vong lặp while ở chỗ, nó thi hành khối lệnh trước,
//        sau đó mới kiểm tra điều kiện, kiểm tra điều kiện thấy vẫn True thì lặp tiếp.

//        Tính tổng các số 1 - 5
        int a = 1;
        int tong = 0;
        do {
            tong += a;
            a++;
        }while(a<=5);
        System.out.println("Tong = "+tong);
    }
}
