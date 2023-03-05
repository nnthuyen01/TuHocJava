public class Bai17_BreakContinue {
    public static void main(String[] args) {
//        break : thường được dùng để thoát khỏi 1 vòng lặp
//        continue : dùng để bỏ qua 1 giá trị trong vòng lặp

//        Tính tổng từ 1 -5 những bỏ qua số 3
        int tong = 0;
        for (int i = 0; i<= 5;i++){
            if (i == 3) continue;
            else
            tong += i;
        }
        System.out.println("Tong = " + tong);

//        Break
        int n = 0;
        while(n<100)
        {
            System.out.println("n= "+ n);
            if(n==15)
                break;
            n++;
        }
    }
}
