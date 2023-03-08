import java.util.HashMap;
import java.util.Scanner;

public class Bai29_GiaiBtHashMap {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("user1","1re23456");
        users.put("user2","12we3456");
        users.put("user4","1234weq56");
        users.put("user5","12q3456");
        users.put("user6","12345eqw6");
        users.put("user7","123q45e6");
        users.put("user8","1234ewq56");
        users.put("user9","123ewq456");
        users.put("user10","1234eqw56");

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap User: ");
        String userName = sc.nextLine();
        System.out.println("nhap Password: ");
        String pass = sc.nextLine();

        //Ktra
        if (!users.containsKey(userName)){
            //neu khogn co key nay trong hashmap users. thi user k ton tai
            System.out.println("User không tồn tại");
        }
        else if (!users.get(userName).equals(pass)){
            System.out.println("pass sai");
        }
        else
            System.out.println("bạn đã đăng nhập thành công");
    }
}
