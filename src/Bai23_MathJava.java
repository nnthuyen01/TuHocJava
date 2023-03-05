public class Bai23_MathJava {
    public static void main(String[] args) {
        System.out.println("Pi= "+Math.PI);
//        Tri tuyet doi
        int a = -8;
        System.out.println(Math.abs(a));
//        Max, Min
        System.out.println(Math.max(10,3));
        System.out.println(Math.min(10,3));
//        Can bac 2
        System.out.println(Math.sqrt(4));
//        Luy Thua
        System.out.println(Math.pow(2,3));
//        Sin, Cos, Tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        double cos = Math.cos(Math.PI*goc/180);
        double tan = Math.tan(Math.PI*goc/180);
        System.out.println("Sin 90: "+ sin);
        System.out.println("Cos 90: "+ cos);
        System.out.println("Tan 90: "+ tan);
    }
}
