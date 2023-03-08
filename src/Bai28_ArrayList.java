import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai28_ArrayList {
    public static void main(String[] args) {
        //1. Khai Bao List
        ArrayList<Integer> lst = new ArrayList<>();
        //2. Khai bao voi so luong phan tu ban dau
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        //3. Khoi tao List voi cac phan tu ban dau
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6));

        //Xuat List
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        //2. add them phan tu
        ArrayList<Integer> lst4 = new ArrayList<>();
        //add pt
        lst4.add(7);
        lst4.add(8);
        lst4.add(11);
        lst4.add(12);
        System.out.println("lst4 moi add la: "+lst4);
        //add(index,element) vao vi tri chi dinh
        lst4.add(1,9);
        System.out.println("lst4 cau khi chen vao index 1 bang 9 la: "+lst4);

        //2.2 size: tra ve so phan tu cua list
        System.out.println("So pt cu lst4 la: " + lst4.size());

        //2.3 get(int index): tra ve gia tri list tai vi tri index
        System.out.println(lst4.get(2));

        //2.4 remove(index)
        lst4.remove(1);
        System.out.println("lst4 sau khi xoa gia tri tai index 1 la: " + lst4);

        //2.5 remove (1 phan tu duoc chi dinh)
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst5 :" + lst5);
        lst5.remove(Integer.valueOf(3));
        System.out.println("lst5 sau khi xoa: "+ lst5);

        //2.6 set(index,element) : thay doi thong tin
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst6 :" + lst6);
        lst6.set(2,7);
        System.out.println("lst6 sau khi xoa: "+ lst6);

        //2.7 contain() Kiem tra Collection co chua thong tin phan tu nao do hay khong
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(1,2,3,4,5,6));
        boolean ktra = lst7.contains(4);
        System.out.println(ktra);

        //2.8 Collections.sort(list): Sap xep tang dan
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(19,2,30,4,5,6));
        Collections.sort(lst8);
        System.out.println("List lst8 sau sap xep tang dan la: " + lst8);
        //2.9 Colletions.reverse : Dao nguoc List
        //2.10 List.isEmpty: Kiem tra danh sach List co rong khong
        //2.11 Clear(): Xoa toan bo phan tu cua List
        //2.12 indexOf(): Tim vi tri dau tien cua phan tu element trong List
        // Neu khong ton tai tra ve -1
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(19,2,30,4,5,6));
        System.out.println(lst9.indexOf(9));
        System.out.println(lst9.indexOf(4));

        //3. Duyet List
        //3.1 Cach 1
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(19,2,30,4,5,6));
        System.out.println("Lst10 Dung Duyet For ");
        for (int vl : lst10){
            System.out.println(vl);
        }
        System.out.println("--------------------");
        //3.2 Cach 2: Khi can su dung den cac chi so index
        ArrayList<Integer> lst11 = new ArrayList<>(List.of(19,2,30,4,5,6));
        for (int i =0; i<lst10.size();i++){
            int vl = lst11.get(i);
            System.out.println(vl);
        }
    }
}
