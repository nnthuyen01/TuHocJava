import java.util.HashMap;

public class Bai29_HashMap {
    public static void main(String[] args) {
        //1. Khai bao
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map2 = new HashMap<>();
        //2. Các phương thức
        //Thêm các phần tử vào hashmap
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"cherry");

        //3.Lấy giá trị của phần tử
        String value = map.get(1);
        String value2 = map.get(2);
        String value3 = map.get(3);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);

        //4.Xóa phần tử khỏi hashmap
        map.remove(2);
        System.out.println(map.get(2));

        //5.Kiểm tra xem một phần tử có tồn tại trong map hay không
        boolean check = map.containsKey(3);
        System.out.println(check);
        //6.Kiểm tra xem một giá trị có tồn tại trong map hay không
        boolean check2 = map.containsValue("banana");
        System.out.println(check2);

        //7. Kiểm tra xem hashmap có rỗng hay không
        boolean bien = map.isEmpty();
        System.out.println(bien);

        //8. Lấy số lượng phần tử trong hashmap
        int soLuongPt = map.size();
        System.out.println(soLuongPt);

        //9.Duyệt hashmap
        for (Integer key: map.keySet()){
            String vl = map.get(key);
            System.out.println(key+" :" +vl);
        }


    }
}
