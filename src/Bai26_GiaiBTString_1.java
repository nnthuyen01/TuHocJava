import java.util.Scanner;

public class Bai26_GiaiBTString_1 {
    public static void main(String[] args) {
/*            1.Viết chương trình kiểm tra tính hợp lệ của mật khẩu
                * Mật khẩu hợp lệ chỉ có ít nhất 6 kí tự
                * Chứa ít nhất một chữ cái (thường hoa đều được)
                * Chứa ít nhất một chữ số
            2. Cho người dùng nhập vào mật khẩu để login ( so sánh, nếu đúng mở cửa, sai quá 5 lần khóa đăng nhập, thoắt chương trình)*/

        Scanner sc = new Scanner(System.in);
        String password = "";

        while (true) {
            System.out.println("mời thiết lập mật khẩu");
            System.out.println("mật khẩu ít 6 kí tự, ít nhất 1 chữ cái, ít nhất 1 số");
            String newPassword = sc.nextLine();

            if(checkMK(newPassword)) {
                password = newPassword;
                System.out.println("Mật khẩu mới đã dược thiết lập");
                break;
            }
            else
                System.out.println("mật khẩu không hợp lệ, xin vui lòng nhập lại!!!");
        }
        // Ý thứ 2. nhập quá 5 lần thì khóa
        int count = 0;
        String login ="";
        while (true) {
            System.out.println("mời nhập mật khẩu");
            login =sc.nextLine();
            //Kiem tra mk
            if (login.equals(password)) {
                System.out.println("Đăng nhập thành công");
                break;
            }
            else {
                System.out.println("mật khẩu không đúng, vui lòng nhập lại");
                count++;
            }
            if (count==5)
            {
                System.out.println("bạn nhập sai quá 5 lần, tài khoản bị khóa");
                break;
            }

        }
    }
    // Hàm kiểm tra tính hợp lệ của mật khẩu
    public static boolean checkMK(String password){
        //Kiem tra do dai
        if  (password.length() <6)
            return false;
        // Kiem tra co Chứa ít nhất một chữ cái (thường hoa đều được)
        boolean hasLetter =false;
        for (char c : password.toCharArray()){
            if(Character.isLetter(c)){
                hasLetter=true;
                break;
            }
        }
        if (!hasLetter)
            return false;
        // Kienm tra Chứa ít nhất một chữ số
        boolean hasNum = false;
        for (char c : password.toCharArray()){
            if(Character.isDigit(c)){
                hasNum=true;
                break;
            }
        }
        if (!hasNum)
            return false;
        //Thoa dieu kien
        return true;
    }
}
