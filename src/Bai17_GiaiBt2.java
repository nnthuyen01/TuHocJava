public class Bai17_GiaiBt2 {
    public static void main(String[] args) {
//        Số hoàn hảo là số: Tổng các ước thực bằng chính nó
//        Vd: 6 = 1+ 2 +3
//        Tìm tất cả số hoàn hảo trong phạm vi từ 1 - 1000
        for(int n = 1;n<=1000; n++)
        {
            int tong = 0;
            for(int i= 1; i<n;i++)
                if(n%i==0)
                    tong+=i;
            if (tong == n)
                System.out.println(n+" ");
        }
    }
}
