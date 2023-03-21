package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        //Kiểm tra thứ tự các giá trị trong enum
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.yeu.ordinal());

        //Tao danh sach
        ArrayList<SV> ds =new ArrayList<>();
        //Tao doi tuong sinh vien
        SV sv1 = new SV(1,"Nguyễn Văn A", 9.5);
        SV sv2 = new SV(2,"Nguyễn Văn B", 4.5);
        SV sv3 = new SV(3,"Nguyễn Văn C", 7.5);

        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);
        for (SV ttSinhVien : ds ) {
            System.out.println(ttSinhVien);
        }

    }
}
