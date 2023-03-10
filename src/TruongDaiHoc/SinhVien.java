package TruongDaiHoc;

public class SinhVien {
    //Thuộc tính (giống với biến)
    // Quy tắc đặt thuộc tính
   /* + Đặt tên giống quy tắc tên biến: quy tắc Camel.
      + Đặt mức độ truy xuất là private nếu không muốn kế thừa
      + Đặt protected nếu muốn cho kế thừa
      + Tuyệt đối không được để public*/
    private String hoTen; //Biến toàn phần instance variable
    private double diem; //Biến toàn phần

    //4.1 Constructor mặc định
    //Khởi tạo giá trị mặc định, ngay khi đối tượng vừa được tạo ra
    // Alt + Ins
    public SinhVien() {
        hoTen="No name";
        diem= 0.0;
    }
    //4.2 Constructor có đối số
    public SinhVien(String hoTen, double diem) //Biến cục bộ local variable
    {
        this.hoTen = hoTen; //this dùng khi biến cục bộ giống biến toàn phần
        this.diem = diem;
    }

    //Phương thức (các hàm)
    //Phương thức không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen+": "+diem);
    }

    //Phương thức có kiểu trả về (có return)
    public  double tinhDTB(double diemToan, double diemVan){
        return (diemToan+diemVan)/2;
    }

    //12. Overloading method:
    /*1. Signature gọi là khác nhau nếu chúng kahcs nhau về
        1. Số lượng các đói số
        2. Kiểu dữ liệu các đối số
        3. Thứ tự các đối số
      2. Overloading method: Trong cùng class có nhiều phương thúc cùng tên nhưng khác nhau về Signature
      3. Contructor: Là trường hợp đặc biệt của overloading method
      // Thuận tiện khi chúng ta có thể hợp nhất về 1 cái tên có thể dùng nhiều phương thức khác nhau
    */
    public  double tinhDTB(double diemToan, double diemVan,double diemAnh){
        return (diemToan+diemVan+diemAnh)/3;
    }
    //Khác nhau về thứ tự đối số
    public  double tinhDTB(double diemToan, double diemVan, String abc){
        return (diemToan+diemVan)/2;
    }
    public  double tinhDTB(String abc,double diemToan, double diemVan){
        return (diemToan+diemVan)/2;
    }

    //get, set : Dùng khi muốn truy cập vào thay đổi các giá trị của biến private

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    //toString : hỗ trợ xuất trực tiếp đối tượng đó ra System.out.println(sv4);
    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    //11. Support Method va Service Method
    //11.1 Support Method : Dùng để hỗ trợ bên trong phương thức. Không truy xuất dược từ bên ngoài-> DÙng từ khóa Private
    private boolean checkDiem() {
        return this.diem>=24;
    }
    //11.2 service Method : Truy xuất được từ bên ngoài -> Dùng từ khóa public
    public void checkHopLeDiem(){
        if(checkDiem())
            System.out.println("Điểm hợp lệ");
        else
            System.out.println("Điểm không hợp lệ, kiểm tra lại");
    }

    //13 Parametter list method: (Là 1 trường hợp của Overloading Method)
    /*Trong trường hợp ta không thể nắm được số lượng đối số vào,
    hoặc số lượng đói số quá lớn> java cung cấp thêm lựa chọn Parameter List
    */

    public double tongDiem(double ... arr){
        double tong = 0.0;
        for (double x:arr){
            tong+=x;
        }
        return tong;
    }

}
