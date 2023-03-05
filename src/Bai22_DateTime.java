import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bai22_DateTime {
    public static void main(String[] args) {
//        Get toan bo thoi gian,...
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
//        Lấy ngày tháng năm
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH); //Thang trong JAVA quy dinh tư 0 - 11
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang+1);
        System.out.println(ngay);

//        Set ngày tháng năm theo ý muốn
        cal.set(Calendar.YEAR,2001);
        cal.set(Calendar.MONTH,0);
        cal.set(Calendar.DAY_OF_MONTH,20);
//        Kiểm tra ngày tháng sau thiết lập
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
//        Xuất
        System.out.println("Ngày tháng năm sinh: "
                            +ngaySinh+"/"
                            +(thangSinh+1)+"/"
                            +namSinh);

//        Xuất theo định dạng
        SimpleDateFormat dinhdang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
//        Tạo đối tượng data để get time trong đối tượng cal
        Date d = cal.getTime();
        String s = dinhdang.format(d);
        System.out.println(s);
    }
}
