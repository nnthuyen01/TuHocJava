public class Bai16_For {
    public static void main(String[] args) {

        //Tính tổng các số chẵn từ 0 - 10
        int tong = 0;
        for (int i = 0; i<=10; i+=2)
            tong+=i;
        System.out.println("Tổng ="+ tong);
    }
}
