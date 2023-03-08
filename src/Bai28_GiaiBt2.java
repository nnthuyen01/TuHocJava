import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai28_GiaiBt2 {
    public static void main(String[] args) {
        /* Viết phương trình trả về kết quả phép tính
        quest = {"2 + 5 + 7=","5 * 10 =","sqrt(16) =","12%2 ="}
        */
        Scanner sc = new Scanner(System.in);
        //List de bai cho
        ArrayList<String> quest = new ArrayList<>(List.of(
                "2 + 5 + 7=","5 * 10 =","sqrt(16) =","12%2 ="
        ));
        //List Dap an
        ArrayList<Float> trl = new ArrayList<>(List.of(14f,50f,4f,0f));
        System.out.println(quest);
        //Duyet theo cau hoi
        for (int i = 0; i < quest.size(); i++){
            System.out.println(quest.get(i));
            //Nhap ket qua
            System.out.println("nhap ket qua: ");
            Float kq = sc.nextFloat();
            //Ktra voi dap an
            if(kq.equals(trl.get(i))){
                System.out.println("Dung cmnl ");
            }
            else
                System.out.println("Sai roi, Dap An la: " + trl.get(i));

        }
    }
}
