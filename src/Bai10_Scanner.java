import java.util.Scanner;

public class Bai10_Scanner {
    public static void main(String[] args) {
//        Khởi tạo 1 đối tượng Scanner
        Scanner sc = new Scanner(System.in);

//        Cho phép nhập chuỗi
        System.out.println("Mời nhập vào mật khẩu cấp 1: ");
        String mk1 = sc.nextLine(); //để đọc toàn bộ dòng dữ liệu
        System.out.println("MK cấp 1 là: "+ mk1);
//        Nhập số nguyên
        System.out.println("Mời nhập vào một số nguyên a:");
        int a = sc.nextInt();
        System.out.println("a ="+ a);
//        Nhập float
        System.out.println("Mời nhập vào 1 số thực x:");
        float x = sc.nextFloat();
        System.out.println("x ="+ x);

//        cách 2 khai báo riêng cho mỡi lần nhập
//        Nhập chỗi
        System.out.println("Mời bạn nhập chuỗi");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Chuỗi là"+ ten);

//        Làm cách này để mỗi lần sử dụng lại nhập không Scan không bị lỗi
        int so = new Scanner(System.in).nextInt();
        System.out.println("Số nguyên là"+ so);

        float sothuc = new Scanner(System.in).nextFloat();
        System.out.println("Số Thực là"+ sothuc);

    }
}
