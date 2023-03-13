package TinhDaHinh;

public class Test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("Thuyen","123456","KhanhHoa");
        //Xuat Luong Pho Phong
        System.out.println(ns1.tinhLuong(21));
        System.out.println(ns1.getTen()+" : "+ns1.getQue());
        //Thay Doi Chuc Vu
        ns1 = new TruongPhong(ns1.getTen(), ns1.getCccd(), ns1.getQue());
        System.out.println(ns1.tinhLuong(21));
        System.out.println(ns1.getTen()+" : "+ns1.getQue());

    }
}
