public class Bai26_GiaiBTString {
    public static void main(String[] args) {
        // 1. Tính tổng các số trong chuỗi
        // 2. Tính TBC các số đó
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0; //biến tính tổng
        int count = 0; //biến lưu số lượng số
        // Tách chuỗi thành các phần tử bằng split()
        String[] parts = str1.split(" ");
        // Duyệt qua từng phần tử và chuyển thành số nếu có thể
        for (String pt :parts) {
            System.out.println(pt);
            try {
                // Chuyển chuỗi sang số nguyên bằng phương thức parseInt() của lớp Interger
                int num = Integer.parseInt(pt);
                sum+=num;
                count++;
            }
            catch (NumberFormatException e) {
                //Chỉ đơn giản là không làm gì
            }
        }
//        Tính trung bình cộng
        double tbc  = (double) sum/count;
        System.out.println("Tổng các số trong chuỗi là: " + sum);
        System.out.println("TBCcác số trong chuỗi là: " + tbc);
    }
}
