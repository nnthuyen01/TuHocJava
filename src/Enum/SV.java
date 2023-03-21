package Enum;

public class SV {
    //thuoc tinh
    private int ma;
    private String ten;
    private double dtb;
    private XepLoai loai;
    //constructor

    public SV(int ma, String ten, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.dtb = dtb;
        this.loai = getLoai();
    }
    //phuong thuc de getLoai
    public XepLoai getLoai(){
        if(this.dtb>=8)
            loai=XepLoai.gioi;
        else if (this.dtb >= 6.5)
            loai = XepLoai.kha;
        else if (this.dtb >= 5.0)
            loai = XepLoai.tb;
        else if (this.dtb >= 3.0)
            loai = XepLoai.yeu;
        else loai = XepLoai.duoihoc;
        return loai;
    }
    //toString

    @Override
    public String toString() {
        return ma + "\t" + ten + "\t" + this.loai.des();
    }
}
