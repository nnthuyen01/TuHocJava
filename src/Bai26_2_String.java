import java.util.Locale;

public class Bai26_2_String {
    public static void main(String[] args) {
        // So Sánh 2 chuỗi dùng compareTo và compareToIgnoreCase(Bỏ qua phân biệt chữ thường)
        // Nếu bằng trả về 0
        // Nếu lớn hơn trả về > 0
        // Nếu bé hơn trả về < 0
        String s25 = "thuyen2001";
        String s26 = "thuyen2001";
        int x = s25.compareTo(s26);
        // Trả về x = 0;
        System.out.println("x= "+ x);

        String s27 = "Thuyen2001";
        String s28 = "thuyen2001";
        int x2 = s27.compareTo(s28);
        System.out.println("x2: "+ x2);

        //So sánh không phân biệt chữ thường
        String s29 = "thuyen2001";
        String s30 = "tHUYEN2001";
        int x3 = s29.compareToIgnoreCase(s30);
        System.out.println("x3: "+ x3);


        //Nối chuối
        String s31 = "Hôm nay";
        s31 = s31 + " trời mưa"; //Không nhanh bằng StringBuilder
        System.out.println(s31);

        // Split: tách chuỗi trả về mảng
        String s32 = "hello, chuỗi";
        String[] mang = s32.split(",");
        //Duyệt mảng
        for (int i = 0; i < mang.length; i++)
            System.out.println(mang[i]);

        //toLowerCase() && toUpperCase()
        String s39 = "Tôi học Lập Trình tại NHÀ";
        String s40 = s39.toLowerCase();
        String s41 = s39.toUpperCase();
        System.out.println(s40 + s41);

        //toCharArray() tách chuỗi thành từng ký tự, cho vào mảng
        String s42 = "abcefghklmnopq";
        char[] mang2= s42.toCharArray();
        //Duyệt mảng
        for (int i = 0; i < mang2.length; i++)
            System.out.println(mang2[i]);

        //Reverse() Đảo ngược chuỗi
        String s43 = "123456789abc";
        //Khai báo đối tượng thuộc class StringBuilder
        StringBuilder sb = new StringBuilder(s43);
        sb.reverse();
        String s44 = sb.toString(); //Chuyển sang chuỗi
        System.out.println(s44);
    }
}
