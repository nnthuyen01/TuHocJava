import java.util.Scanner;

public class Bai26_GiaiBTString_2 {
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyulop";

        System.out.println("Vui long nhập text muốn mã hóa:");
        String input = new Scanner(System.in).nextLine();
        String output ="";
        for (int i = 0; i< input.length(); i++) {
            char c = input.charAt(i);
            int index = a.indexOf(c);

            if(index==-1)
                output+=c;
            else
                output += b.charAt(index);
        }
        System.out.println("Sau khi mã hóa là: " +output);
    }
}
