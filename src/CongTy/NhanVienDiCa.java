package CongTy;

public class NhanVienDiCa extends NhanVien{

    //Khai báo thêm thuộc tính ca
    //ca1: làm ngày
    //ca2: làm đêm
    protected int ca;

    public NhanVienDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd); //truy cập các constructor của class cha bằng từ khóa super
    }
    public NhanVienDiCa(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd); //truy cập các constructor của class cha bằng từ khóa super
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan*1.05; //cao hơn 5% so với lương hành chính
    }
}
