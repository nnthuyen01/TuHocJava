import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai28_GiaiBt3 {
//    Tim vi tri va gia tri cua so lon thu 2, so nho thu 2 trong list
public static void main(String[] args) {
    ArrayList<Integer> lst  = new ArrayList<>(List.of(1,9,3,14,5,27,8));
    //Tao ra 1 list moi giong gia tri voi lst
    ArrayList<Integer> copy = new ArrayList<>(lst);
    //In thu list copy
    System.out.println(copy);
    //Sap xep tang dan copy
    Collections.sort(copy);
    System.out.println(copy);
    //In ra so lon thu 2 va so nho thu 2 tron list
    int soLonThu2 = copy.get(copy.size()-2);
    int soNhoThu2 = copy.get(1);
    System.out.println(soLonThu2);
    System.out.println(soNhoThu2);
    //In ra vi tri 2 so do
    System.out.println(lst.indexOf(soLonThu2));
    System.out.println(lst.indexOf(soNhoThu2));

}
}
