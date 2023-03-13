package oopSXclass;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //Tạo List
        ArrayList<SanPham> ds = new ArrayList<>();
        //Khởi tạo các đối tượng thành phần
        SanPham sp1 =new SanPham(1,"SamSung",1050);
        SanPham sp2 =new SanPham(2,"Iphone",500);
        SanPham sp3 =new SanPham(3,"Nokia",800);
        //add sản phẩm cào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        //Xem danh sach sp trong list
        for (SanPham sp : ds)
            System.out.println(sp.toString());

        //sắp xếp
        Collections.sort(ds);
        System.out.println("danh sách sau sắp xếp là");
        for (SanPham sp : ds)
            System.out.println(sp.toString());
    }
}
