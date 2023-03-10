import TruongDaiHoc.SinhVien;

public class Bai30_OOP_buoi1 {
    public static void main(String[] args) {
        //Khởi tạo đối tượng thuộc class TruongDaiHoc.SinhVien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Thuyen",10.0);
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("An",9.);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        //Thay doi ten cua sinh vien 4
        sv4.setHoTen("Thuy");
        sv4.setDiem(100);
        sv4.hienThiThongTin();
        //Test phương thức có kiểu trả về
        double dtbsv4 = sv4.tinhDTB(7.5,7.2);
        System.out.println(dtbsv4);

        //Test phương thức toString
        System.out.println(sv4);

        //11. Support Method va Service Method
        //sv4.checkDiem(); khong su dung dc
        sv4.checkHopLeDiem();

        //12. Overloading
        double testD = sv4.tinhDTB(5,6,7);
        System.out.println(testD);
        double testD2 = sv4.tinhDTB(8,9);
        System.out.println(testD2);

        double kq = sv4.tongDiem(1,2,3,4,5,6,7,8,9,10);
        System.out.println(kq);
    }
}
