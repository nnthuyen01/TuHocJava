package TinhDaHinh;

public abstract class NhanSu {
    //Them thuoc tinh
    private String ten; //Khi để private không lấy được thông tin, cần getter và  setter để lấy
    private String cccd;
    private String que;
    //tao constructor

    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    //phuong thuc tinh luong
    public abstract double tinhLuong(int ngayCong);

    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }

    public String getQue() {
        return que;
    }
}
