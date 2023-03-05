public class Bai20_XyLyNgoaiLe {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            int c= a/b;
            System.out.println("c= " + c);
        }
        catch (ArithmeticException ex) {
            System.out.println("Có lỗi toán học rồi!!!");
            ex.printStackTrace();
        }
        catch (Exception ex) {
            System.out.println("Có lỗi rồi bu nó ơi...");
            ex.printStackTrace(); //Dùng để in lỗi đó ra
        }
//        Khối finally được dùng khi ta muốn chương trình thực hiện dòng lệnh này kể cả có lỗi hay k có lỗi
        finally {
            System.out.println("Có lỗi hay không lỗi đều thực hiện cái này");
        }
        System.out.println("Đoạn code phía sau");
    }
}
