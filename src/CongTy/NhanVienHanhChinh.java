package CongTy;

public class NhanVienHanhChinh extends NhanVien{
    public NhanVienHanhChinh(String ten, String que, int cccd) {
        super(ten, que, cccd); //truy cập các constructor của class cha bằng từ khóa super
    }

    @Override //Ghi đè, tái định nghĩa
    public double tinhLuong() {
        return luongCoBan;
    }
}
