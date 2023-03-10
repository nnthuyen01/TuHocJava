package QuanLyDiem;

public class KhaoVan extends NamHoc2023{
    public KhaoVan(String ten, String cccd) {
        super(ten, cccd);
    }
    //override

    @Override
    public void tinhDTB() {
        System.out.println("Đây là pt tính dtb của khoa Văn");
    }
}
