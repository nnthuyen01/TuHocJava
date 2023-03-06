import java.util.Arrays;

public class Bai27_Mang {
    public static void main(String[] args) {
        //1. Khai Bao Mang
        String[] mangStr;
        Float[] mangFl;
        Double[] mangdb;
        //2. Khai bao kem kich thuoc
        String[] mangStr2 = new String[12]; //chua toi da 12 phan tu
        int[] mangNguyen2 = new int[7];
        //3. Khoi tao mang cung gia tri ban dau
        String[] mangStr3 = new String[]{"Chí Phèo", "Thị Nở", "Ông Giáo"};
        int[] mangNguyen3 = new int[]{1,2,3,4,5,6,7,8};

        //4.Truy xuất pt của mảng dựa theo index
        System.out.println(mangNguyen3[2]);
        System.out.println(mangStr3[2]);

        //5.length
        System.out.println(mangNguyen3.length);

        //6.Duyệt mảng For
        //c1
        int[] mang4= new int[] {1,2,3,4,5,6,7,8};
        for (int pt : mang4){
            System.out.println(pt);
        }

        String[] mang5 = new String[]{"Chí Phèo", "Thị Nở", "Ông Giáo"};
        for(String pt:mang5){
            System.out.println(pt);
        }
        System.out.println("-------------");
        //c2
        for (int i = 0; i < mang4.length ;i++) {
            System.out.println(mang4[i]);
        }

        //Sắp xếp tăng dần mảng
        int[] mang6 = {8,9,12,48,1,2,3};
        Arrays.sort(mang6);
        System.out.println("Mảng sau sx tăng là: ");
        System.out.println(Arrays.toString(mang6));

        //Đổi ngược mảng
        int[] mang7 = {8,9,12,48,1,2,3};
        for (int i =0, j =mang7.length -1;i<j;i++,j--) {
            int temp = mang7[i];
            mang7[i] = mang7[j];
            mang7[j] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(mang7));

        //Gán mảng truy xuất vùng nhớ
        int[] mang10 = {8,9,12,48,1,2,3};
        int[] mang11 = mang10;
        mang10[0] = 22;
        System.out.println(Arrays.toString(mang10));
        System.out.println(Arrays.toString(mang11));

        //Clone: dùng để tạo mảng mới cùng giá trị, lưu trên vùng nhớ khác
        int[] mang12 = {8,9,12,48,1,2,3};
        int[] mang13 = mang12.clone();
        mang12[0] = 22;
        System.out.println(Arrays.toString(mang12));
        System.out.println(Arrays.toString(mang13));
    }
}
