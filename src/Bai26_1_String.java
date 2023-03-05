public class Bai26_1_String {
    public static void main(String[] args) {
        String s = "Tôi yêu pé Katherine" +
                "\nĐó Là bé mèo xinh đẹp";
        System.out.println(s);
        // Lớp StringBuilder là 1 lớp dùng để quản lý chuỗi có thể thay đổi kích thích và nội dung.
        // Khai báo đối tượng st
        StringBuilder chuoi = new StringBuilder();
        // Cac phương thúc thường dùng
        // append: thêm vào cuối chuỗi
        chuoi.append("Xin chao, ");
        chuoi.append("minh moi hoc lap trinh");
        System.out.println(chuoi);
        // Insert
        chuoi.insert(2, "CHEN");
        System.out.println(chuoi);
        //Delete : Vi tri Start den End -1
        chuoi.delete(2,6);
        System.out.println(chuoi);
        // reverse đảo ngược chuỗi
        //Lenght
        System.out.println(chuoi.length());

        //IndexOf: Kiểm tra vị trí xuất hiện đầu tiên của ký tự hoặc chuỗi
        //Trả về -1 nếu không tìm thấy
        String s7 = " tôi đi tìm tôi";
        System.out.println(s7.indexOf("tôi"));
        //lastIndexOf: Kiểm tra vị trí xuất hiện cuối cùng của ký tự hoặc chuỗi
        //Trả về -1 nếu không tìm thấy
        System.out.println(s7.lastIndexOf("tôi"));

        //Contains: Kiểm tra chuỗi con
        String s9=".mp3";
        String s10 ="tuhoc.mp3";
        //Kierm tra s10 có chứa s9 không
        boolean check = s10.contains(s9);
        if (check) System.out.println("Có .mp3 trong chuỗi");
        else System.out.println("Không tìm thấy .mp3 trong chuỗi");

        //Substring: Trích lọc chuỗi con từ chuỗi ban đầu
        String s11 = "abcdefgh";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);
        String s13 = s11.substring(4,7);
        System.out.println(s13);

        //replace: thay thế toàn bộ ký tự có trong chuỗi cũ thành chuỗi mới
        String s14 = "Tôi đi tìm Tôi";
        String s15 = s14.replace("Tôi","Bạn");
        System.out.println(s14);
        System.out.println(s15);

        //replaceFirst
        String s16 = s14.replaceFirst("Tôi","Bạn");
        System.out.println(s16);

        //trim(): Xoá toàn bộ khoảng trắng ở đầu và cuối
        String s18 = "          Thuyên lại lặp trình   ";
        String s19 = s18.trim();
        System.out.println(s18);
        System.out.println(s19);

        //Xóa toàn bộ khoảng trắng ở cuối chuỗi
        //cách 1: biểu thức chính quy (regular expression)
        //dùng \s+$ để xóa tất cả khoảng trắng ở cuối chuỗi
        String s20 = s18.replaceAll("\\s+$","");
        System.out.println(s18.length());
        System.out.println(s20.length());

        //cách 2: Xóa khoảng cách ở cuối chuỗi bằng vòng lặp while
        String s21 = "          Thuyên lại lập trình     ";
        while (s21.endsWith(" ")){
            s21 = s21.substring(0,s21.length()-1);
        }
        System.out.println(s21);

        //Xóa toàn bộ khoảng cách đầu chuỗi
        //Cách 1: Biểu thức chính quy
        String s23 = "          Thuyên lại lập trình   ";
        String s24 = s23.replaceFirst("^\\s+","");
        System.out.println(s23);
        System.out.println(s24);

        //Cach 2: Sử dụng vòng lặp
        String s25 = "          Thuyên lại lập trình   ";
        while (s25.startsWith(" "))
        {
            s25 = s25.substring(1);

        }
        System.out.println(s25);
    }
}
