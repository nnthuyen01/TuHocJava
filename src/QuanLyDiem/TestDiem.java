package QuanLyDiem;

public class TestDiem {
    public static void main(String[] args) {
        //Khởi tạo đối tượng
        KhoaToan toan1 = new KhoaToan("Ten A","32132");
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("Ten B","123312");
        anh1.tinhDTB();
    }
}
