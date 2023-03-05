public class Bai9_ToanTuLogic {
    public static void main(String[] args) {
 /*       int i = 15;
//        Kiểm tra giá trị i>0 và i<10 không
        System.out.println(i>0 && i<10);
//        Kiem tra xem i>10 hoac i<-1
        System.out.println(i>10 || i<-1);
//        Phep phu dinh
        System.out.println(!(i>10 || i<-1));

//        Toán từ tiền tố prefix, hậu tố postfix ++ --
        int x=100;
        int y=90;
        int z=80;
        int t=70;

        x++;
        ++y;
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);*/

        int a = 1;
        int b = 2;
        int c = a++ - ++b + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

/*        Ưu tiên tính toán Postfix, Prefix
                Step 1: Prefix
                Step 2: Các Phép toán còn lại
                Step 3: Gán giá trị cho biến bên trái dấu bằng
                Step 4: Tính Postfix*/
    }
}
