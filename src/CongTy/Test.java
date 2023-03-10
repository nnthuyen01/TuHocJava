package CongTy;

public class Test {
    public static void main(String[] args) {
        /*NhanVien nv1 = new NhanVien("Nhân viên 1","Hà Nội",123456);
        double luongNv1 = nv1.tinhLuong();
        System.out.println("Lương nv1 là: "+luongNv1);*/

        //tạo đối tượng nhân viên hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("Hành chính 1","Bình Định",333333);
        double luongHc1 = hc1.tinhLuong();
        System.out.println("Lương hc1 là: "+luongHc1);

        //Tại đối tượng đi ca
        NhanVienDiCa ca1 = new NhanVienDiCa("Nguyễn Văn A", "Tp Hồ Chí Minh", 555555);
        double luongCa1 = ca1.tinhLuong();
        System.out.println("Lương ca1 là: "+luongCa1);

        NhanVienDiCa ca2 = new NhanVienDiCa("Nguyễn Văn Ca", "Vũng Tàu", 777777,1);
        double luongCa2 = ca2.tinhLuong();
        System.out.println("Lương của nhân viên ca2 là: "+ luongCa2);
        System.out.println(ca2.ca);

    }
}
