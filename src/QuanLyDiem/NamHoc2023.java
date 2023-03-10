package QuanLyDiem;

public class NamHoc2023 {
    //thuộc tính
    protected String ten;
    protected String cccd;
    //alt ins

    public NamHoc2023(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    //Phuong thuc
    public void tinhDTB(){
        System.out.println("Đây là phương thức tính điểm TB của class cha");
    }
}
