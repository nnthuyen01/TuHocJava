package oopSXclass;

public class SanPham implements Comparable<SanPham>{
    //Thuoc tinh
    private int ma;
    private String ten;
    private double gia;

    //constructor
    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
    //get,set

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    //toString

    @Override
    public String toString() {
        return ma + "\t" + ten + "\t" + gia ;
    }

    //Phuong thuc
    //Sắp xếp theo giá
   /* @Override
    public int compareTo(SanPham o) {
        if(this.gia<o.gia)
            return -1;
        if(this.gia>o.gia)
            return 1;
        return 0;
    }*/
    //Sắp xếp theo String
    @Override
    public int compareTo(SanPham o) {
        return this.ten.compareToIgnoreCase(o.ten); //Sắp xếp không phân biệt hoa hay thường.
    }
}
