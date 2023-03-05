import java.util.Random;

public class Bai24_RanDOm {
    public static void main(String[] args) {
//        Khởi tạo đối tượng ngẫu nhiên
        Random rd = new Random();
//        Lấy ngẫu nhiên số nguyên
        int songuyen = rd.nextInt(-50,51); //Chạy từ -50 cho dến nhỏ hơn 51
        System.out.println(songuyen);
//        CHạy ngẫu nhiên só thực
        Double sothuc = rd.nextDouble(-100, 101);
        System.out.println(sothuc);
    }
}
