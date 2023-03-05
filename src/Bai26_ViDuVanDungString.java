import java.util.Scanner;

public class Bai26_ViDuVanDungString {
    public static void main(String[] args) {
//        Đếm in hoa, in thường, số ,khoảng trắng
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào một chuỗi: ");
        String s = sc.nextLine();

        //Gán biến đếm
        int demSo = 0;
        int demInThuong = 0;
        int demInHoa = 0;
        int demKhoangTrang =0;
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++)
        {
            char c =  s.charAt(i);
            if (Character.isLowerCase(c)){
                demInThuong++;
            }
            else if (Character.isUpperCase(c)){
                demInHoa++;
            }
            else if (Character.isDigit(c)) {
                demSo++;
            }
            else if (Character.isWhitespace(c)) {
                demKhoangTrang++;
            }
        }
        System.out.println("Số ký tự thường: " + demInThuong);
        System.out.println("Số ký tự in hoa: " + demInHoa);
        System.out.println("Số ký tự số: " + demSo);
        System.out.println("Số ký tự khoảng trắng: " + demKhoangTrang);
    }
}
