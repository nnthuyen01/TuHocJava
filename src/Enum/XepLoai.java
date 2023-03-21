package Enum;

public enum XepLoai {
    //Enum dùng để lưu trữ tập dữ liệu dưới dạng liệt kê có giới hạng
    gioi("XL Giỏi"),   //0
    kha("XL Khá"),    //1
    tb("XL TB"),     //2
    yeu("XL Yếu"),    //3
    duoihoc("XL Đuổi Học");  //4
    private String msg;
    XepLoai(String msg)
    {
        this.msg=msg;
    }
    public String des(){
        return this.msg;
    }
}
