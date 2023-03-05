import java.util.Scanner;

public class Bai26_Char {
    public static void main(String[] args) {
//        Khai Báo: Trong java char được sử dụng để lưu trữ một(1) ký tự, ký tự bặt trong nháy đơn
        char ch = 'a'; //Khoi tao
        char ch2 = 66; //Khoi tao
        System.out.println(ch2);
        char ch3; //Khai Bao
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 ki tu: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0); //Lay 1 ki tu dau
        System.out.println("Ki tu vua nhap: "+ ch4);*/
//        So Sanh
//        Dua vao bang ASCII để tính toán

        System.out.println(Character.compare('a','b'));
        System.out.println(Character.compare('a','A'));
        System.out.println(Character.compare('b','b'));

        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';
        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch8));
    }
}
